package hrs.server;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.model.naming.ImplicitNamingStrategyJpaCompliantImpl;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import hrs.common.util.type.OrderStatus;
import hrs.server.POJO.OrderPO;


public class HibernateTest {
	private SessionFactory sessionFactory;
	private Session session;
	private Transaction transaction;
	
	@Before
	public void setUp() throws Exception {
		StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure().build();
		Metadata metadata = new MetadataSources(serviceRegistry).getMetadataBuilder()
				.applyImplicitNamingStrategy(ImplicitNamingStrategyJpaCompliantImpl.INSTANCE).build();
		sessionFactory = metadata.getSessionFactoryBuilder().build();
		session = sessionFactory.openSession();
		transaction = session.beginTransaction();
	}
	
	
	@After
	public void tearDown() throws Exception {
		transaction.commit();
		session.close();
		sessionFactory.close();
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
}
