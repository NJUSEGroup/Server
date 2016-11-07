package hrs.server.DAO.Impl;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import hrs.common.util.ResultMessage;
import hrs.common.util.type.RoomType;
import hrs.server.DAO.Interface.RoomDAO;
import hrs.server.POJO.RoomPO;

public class RoomDAOImpl implements RoomDAO{
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	private Session getSession(){
		return sessionFactory.getCurrentSession();
	}
	

	@Override
	public ResultMessage update(RoomPO roompo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage add(RoomPO roompo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RoomPO> findByHotelID(int hotelID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int findAvailableRoom(int hotelID, RoomType type, Date date) {
		// TODO Auto-generated method stub
		return 0;
	}

}
