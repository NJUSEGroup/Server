package hrs.server.DAO.Impl;

import java.util.Collections;
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
		getSession().merge(roompo);
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
	 * 
	 * @Title: findAvailableRoomNum 
	 * @Description:包含begin那天，不包含end那天
	 * @param hotelID
	 * @param type
	 * @param begin
	 * @param end
	 * @return 
	 * @see hrs.server.DAO.Interface.RoomDAO#findAvailableRoomNum(int, hrs.common.util.type.RoomType, java.util.Date, java.util.Date)
	 */
	@Override
	public int findAvailableRoomNum(int hotelID, RoomType type, Date begin,Date end) {
		String hql = "from AvailableRoomPO ar inner join fetch ar.hotel hotel where hotel.id = :hotelID and ar.type = :type and ar.roomDate >= :begin and ar.roomDate < :end";
		List<AvailableRoomPO> list  = null;
		try{
			list =  getSession().createQuery(hql)
					.setParameter("hotelID", hotelID)
					.setParameter("type", type)
					.setParameter("begin", begin)
					.setParameter("end", end)
					.getResultList();
		}catch(NoResultException e){
			System.out.println("NoResultException  ");
			return findByHotelAndType(hotelID, type).getRoomNum();
		}
		/*for(AvailableRoomPO po:list){
			System.out.println(po);
		}*/
		return Collections.min(list).getAvailableRoomNum();
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
