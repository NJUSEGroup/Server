package hrs.server.DAO.Impl.HotelDAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import hrs.server.DAO.Interface.HotelDAO.CommCircleDAO;
import hrs.server.POJO.CommercialCirclePO;

@Repository
public class CommCircleDAOImpl implements CommCircleDAO {
	@Autowired
	private SessionFactory sessionFactory;

	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public List<CommercialCirclePO> findByLoc(int locID) {
		String hql = "from CommercialCirclePO cc inner join fetch cc.location  location where location.id = :locID";
		return getSession().createQuery(hql).setParameter("locID", locID).getResultList();
	}

}
