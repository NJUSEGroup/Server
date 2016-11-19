package hrs.server.DAO.Impl.HotelDAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import hrs.common.POJO.HotelPO;
import hrs.common.util.ResultMessage;
import hrs.server.DAO.Interface.HotelDAO.HotelDAO;

@Repository
public class HotelDAOImpl implements HotelDAO {
	@Autowired
	private SessionFactory sessionFactory;

	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public HotelPO findByID(int hotelID) {
		return getSession().get(HotelPO.class, hotelID);
	}

	@Override
	public ResultMessage update(HotelPO hotelpo) {
		getSession().update(hotelpo);
		return ResultMessage.SUCCESS;
	}

	@Override
	public ResultMessage add(HotelPO hotelpo) {
		getSession().save(hotelpo);
		return ResultMessage.SUCCESS;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<HotelPO> find(int loc, int circle) {
		String hql = "from HotelPO hotel inner join fetch hotel.location loc "
									  + "inner join fetch hotel.commercialCircle circle "
									  + "where loc.id = :loc and circle.id = :circle";

		return getSession().createQuery(hql).setParameter("loc", loc).setParameter("circle", circle).getResultList();
	}

}
