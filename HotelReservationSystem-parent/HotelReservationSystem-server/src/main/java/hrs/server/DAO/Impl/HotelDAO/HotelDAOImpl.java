package hrs.server.DAO.Impl.HotelDAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import hrs.common.util.ResultMessage;
import hrs.server.DAO.Interface.HotelDAO.HotelDAO;
import hrs.server.POJO.HotelPO;

public class HotelDAOImpl implements HotelDAO {
	private SessionFactory sessionFactory;

	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Override
	public HotelPO findByID(int hotelID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage update(HotelPO hotelpo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage add(HotelPO hotelpo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<HotelPO> find(int loc, int circle) {
		// TODO Auto-generated method stub
		return null;
	}

}
