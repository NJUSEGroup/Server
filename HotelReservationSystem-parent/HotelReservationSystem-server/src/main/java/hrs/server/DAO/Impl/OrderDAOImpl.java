package hrs.server.DAO.Impl;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import hrs.common.POJO.OrderPO;
import hrs.common.util.ResultMessage;
import hrs.common.util.type.OrderStatus;
import hrs.server.DAO.Interface.OrderDAO;

@SuppressWarnings("all")
@Repository
public class OrderDAOImpl implements OrderDAO {
	@Autowired
	private SessionFactory sessionFactory;

	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public OrderPO findByID(int id) {
		return getSession().get(OrderPO.class, id);
	}

	@Override
	public List<OrderPO> findByUsernameAndType(String username, OrderStatus status) {
		String hql = "from OrderPO o inner join fetch o.user u "
				+ "where u.username = :username and o.status = :status";
		List<OrderPO> list = getSession().createQuery(hql).setParameter("username", username)
				.setParameter("status", status).getResultList();
		return list;
	}

	@Override
	public List<OrderPO> findByHotelAndUsername(int hotelID, String username) {
		String hql = "from OrderPO o " + "inner join fetch o.hotel hotel " + "inner join fetch o.user u "
				+ "where hotel.id = :hotelID and u.username = :username";
		List<OrderPO> list = getSession().createQuery(hql).setParameter("hotelID", hotelID)
				.setParameter("username", username).getResultList();
		return list;
	}

	@Override
	public List<OrderPO> findByUsername(String username) {
		String hql = "from OrderPO o inner join fetch o.user u " + "where u.username = :username";
		List<OrderPO> list = getSession().createQuery(hql).setParameter("username", username).getResultList();
		return list;
	}

	@Override
	public List<OrderPO> findByOrderStatus(OrderStatus status) {
		String hql = "from OrderPO o where o.status = :status";
		List<OrderPO> list = getSession().createQuery(hql).setParameter("status", status).getResultList();

		return list;
	}

	@Override
	public List<OrderPO> findByHotelAndTime(int hotelID, Date begin, Date end) {
		String hql = "from OrderPO o inner join fetch o.hotel hotel "
										 + "where hotel.id = :hotelID "
										 + "and o.execTime >= :begin "
										 + "and o.expectedCheckoutTime <= :end";
		List<OrderPO> list = getSession().createQuery(hql)
										 .setParameter("begin", begin)
										 .setParameter("end", end)
										 .setParameter("hotelID", hotelID).getResultList();
		return list;
	}

	@Override
	public ResultMessage add(OrderPO orderpo) {
		getSession().save(orderpo);
		return ResultMessage.SUCCESS;
	}

	@Override
	public ResultMessage update(OrderPO orderpo) {
		getSession().update(orderpo);
		return ResultMessage.SUCCESS;
	}

}
