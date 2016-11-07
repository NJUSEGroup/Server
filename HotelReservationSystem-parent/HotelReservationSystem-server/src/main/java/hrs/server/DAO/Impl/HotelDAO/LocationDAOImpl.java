package hrs.server.DAO.Impl.HotelDAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import hrs.server.DAO.Interface.HotelDAO.LocationDAO;
import hrs.server.POJO.LocationPO;

public class LocationDAOImpl implements LocationDAO {
	private SessionFactory sessionFactory;

	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Override
	public List<LocationPO> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
