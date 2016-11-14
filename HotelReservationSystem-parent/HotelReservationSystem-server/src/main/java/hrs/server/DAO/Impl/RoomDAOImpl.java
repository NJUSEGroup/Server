package hrs.server.DAO.Impl;

import java.util.Date;
import java.util.List;

import javax.persistence.NoResultException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import hrs.common.POJO.AvailableRoomPO;
import hrs.common.POJO.RoomPO;
import hrs.common.util.ResultMessage;
import hrs.common.util.type.RoomType;
import hrs.server.DAO.Interface.RoomDAO;

@Repository
public class RoomDAOImpl implements RoomDAO {
	@Autowired
	private SessionFactory sessionFactory;

	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public ResultMessage update(RoomPO roompo) {
		getSession().update(roompo);
		return ResultMessage.SUCCESS;
	}

	@Override
	public ResultMessage add(RoomPO roompo) {
		getSession().save(roompo);
		return ResultMessage.SUCCESS;
	}

	@Override
	public List<RoomPO> findByHotelID(int hotelID) {
		String hql = "from RoomPO room inner join fetch room.hotel hotel where hotel.id = ?";
		List<RoomPO> list = null;
		try {
			list = getSession().createQuery(hql).setParameter(0, hotelID).getResultList();
		} catch (NoResultException e) {
		}
		return list;
	}

	/**
	 * 注意date默认是零时零分零秒
	 * 如果没有可用房间记录，那么就返回房间总数
	 */
	@Override
	public int findAvailableRoom(int hotelID, RoomType type, Date date) {
		String hql = "from AvailableRoomPO ar inner join fetch ar.hotel hotel where hotel.id = ? and ar.type = ? and ar.roomDate = ?";
		AvailableRoomPO po  = null;
		try{
			po = ((AvailableRoomPO) getSession().createQuery(hql)
					.setParameter(0, hotelID)
					.setParameter(1, type)
					.setParameter(2, date)
					.getSingleResult());
		}catch(NoResultException e){
			System.out.println("NoResultException");
			return findByHotelAndType(hotelID, type).getRoomNum();
		}
		return po.getAvailableRoomNum();
	}

	@Override
	public RoomPO findByHotelAndType(int hotelID, RoomType type) {
		String hql = "from RoomPO room inner join fetch room.hotel hotel where hotel.id = :hotelID and room.type = :type";
		RoomPO po = null;
		try {
			po = (RoomPO) getSession().createQuery(hql).setParameter("hotelID", hotelID).setParameter("type", type)
					.getSingleResult();
		} catch (NoResultException e) {
		}
		return po;
	}
}
