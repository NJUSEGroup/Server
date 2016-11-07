package hrs.server.DAO.Impl;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import hrs.common.util.ResultMessage;
import hrs.common.util.type.OrderStatus;
import hrs.server.DAO.Interface.OrderDAO;
import hrs.server.POJO.OrderPO;

public class OrderDAOImpl implements OrderDAO {
	private SessionFactory sessionFactory;

	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public OrderPO findByID(int ID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderPO> findByUsernameAndType(String username, OrderStatus status) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderPO> findByHotelAndUsername(int hotelID, String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderPO> findByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderPO> findByOrderType(OrderStatus status) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderPO> findByHotelAndTime(int hotelID, Date begin, Date end) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage add(OrderPO orderpo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage update(OrderPO orderpo) {
		// TODO Auto-generated method stub
		return null;
	}

}
