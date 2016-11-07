package hrs.server.DAO.Impl.PromotionDAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import hrs.common.util.ResultMessage;
import hrs.server.DAO.Interface.PromotionDAO.WebDiscountDAO;
import hrs.server.POJO.WebDiscountPO;

public class WebDiscountDAOImpl implements WebDiscountDAO {
	private SessionFactory sessionFactory;

	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Override
	public ResultMessage add(WebDiscountPO webdiscountpo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage update(WebDiscountPO webdiscountpo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<WebDiscountPO> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
