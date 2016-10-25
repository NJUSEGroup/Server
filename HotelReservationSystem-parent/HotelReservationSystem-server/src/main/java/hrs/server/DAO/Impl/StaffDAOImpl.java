package hrs.server.DAO.Impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import hrs.common.util.ResultMessage;
import hrs.server.DAO.Interface.StaffDAO;
import hrs.server.POJO.StaffPO;
public class StaffDAOImpl implements StaffDAO {
	
	private SessionFactory sessionFactory;
	private Session getSession(){
		return sessionFactory.getCurrentSession();
	}
	@Override
	public ResultMessage update(StaffPO staffpo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage add(StaffPO staffpo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StaffPO findByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Override
	public StaffPO findByHotelName(String hotelName) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public StaffPO login(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}
}
