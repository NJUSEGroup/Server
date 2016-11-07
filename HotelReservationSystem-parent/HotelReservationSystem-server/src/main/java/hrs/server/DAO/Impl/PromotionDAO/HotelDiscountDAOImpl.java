package hrs.server.DAO.Impl.PromotionDAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import hrs.common.util.ResultMessage;
import hrs.server.DAO.Interface.PromotionDAO.HotelDiscountDAO;
import hrs.server.POJO.HotelDiscountPO;

public class HotelDiscountDAOImpl implements HotelDiscountDAO {
	private SessionFactory sessionFactory;

	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public ResultMessage add(HotelDiscountPO hoteldiscountpo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage update(HotelDiscountPO hoteldiscountpo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<HotelDiscountPO> findAllByHotelID(int hotelID) {
		// TODO Auto-generated method stub
		return null;
	}

}
