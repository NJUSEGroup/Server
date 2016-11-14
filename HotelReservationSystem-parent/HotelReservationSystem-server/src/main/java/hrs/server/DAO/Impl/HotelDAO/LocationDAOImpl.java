package hrs.server.DAO.Impl.HotelDAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import hrs.common.POJO.LocationPO;
import hrs.server.DAO.Interface.HotelDAO.LocationDAO;
@Repository
public class LocationDAOImpl implements LocationDAO {
	@Autowired
	private SessionFactory sessionFactory;

	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public List<LocationPO> findAll() {
		String hql = "from LocationPO";
		return getSession().createQuery(hql).getResultList();
	}
}
