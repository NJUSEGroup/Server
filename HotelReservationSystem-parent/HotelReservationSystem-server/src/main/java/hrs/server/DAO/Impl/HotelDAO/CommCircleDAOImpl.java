package hrs.server.DAO.Impl.HotelDAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import hrs.server.DAO.Interface.HotelDAO.CommCircleDAO;
import hrs.server.POJO.CommercialCirclePO;

public class CommCircleDAOImpl implements CommCircleDAO {
	private SessionFactory sessionFactory;

	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Override
	public List<CommercialCirclePO> findByLoc(int locID) {
		// TODO Auto-generated method stub
		return null;
	}

}
