package hrs.server.DAO.Impl.HotelDAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import hrs.common.POJO.CommercialCirclePO;
import hrs.server.DAO.Interface.HotelDAO.CommCircleDAO;

@Repository
public class CommCircleDAOImpl implements CommCircleDAO {
	@Autowired
	private SessionFactory sessionFactory;

	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CommercialCirclePO> findByLoc(int locID) {
		String hql = "from CommercialCirclePO cc inner join fetch cc.location  location where location.id = :locID";
		return getSession().createQuery(hql).setParameter("locID", locID).getResultList();
	}

}
