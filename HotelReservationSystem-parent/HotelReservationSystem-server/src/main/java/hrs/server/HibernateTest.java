package hrs.server;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import hrs.common.util.type.OrderStatus;
import hrs.server.POJO.OrderPO;
import hrs.server.util.SpringUtils;

public class HibernateTest {
	private SessionFactory sessionFactory;
	private Session session;
	private Transaction transaction;

	@Before
	public void setUp() throws Exception {
		sessionFactory = SpringUtils.getBean("sessionFactory");
		session = sessionFactory.openSession();
		transaction = session.beginTransaction();
	}

	@Test
	public void findByID() {
		OrderPO po = session.get(OrderPO.class, 10);
		System.out.println(po.getValue());
	}
	
	public void findByHotelAndType(int hotelID, OrderStatus type) {
		// TODO Auto-generated method stub
	}

	public void findByUsernameAndType(String username, OrderStatus type) {
		// TODO Auto-generated method stub
	}

	public void findByUsername(String username) {
		// TODO Auto-generated method stub
	}

	public void findByHotelAndUsername(int hotelID, String username) {
		// TODO Auto-generated method stub
	}

	public void findByOrderType(OrderStatus status) {
		// TODO Auto-generated method stub
	}

	public void findByHotelAndTime(int hotelID, Date begin, Date end) {
		// TODO Auto-generated method stub
	}

	@After
	public void tearDown() throws Exception {
		transaction.commit();
		session.close();
		sessionFactory.close();
	}
}
