package hrs.server.DataServiceImpl;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import hrs.common.DAO.UserDAO;
import hrs.common.PO.UserPO;
import hrs.server.DAOImpl.UserDAOImpl;

public class TestUserDataServiceImpl {
	private UserDAO service;
	@Before
	public void setUp() throws Exception {
		service = new UserDAOImpl();
	}	

	@Test
	public void test1() {
		UserPO user = service.findByUserName("admin");
		assertEquals(user.getPassword(),"admin");
	}
	@Test
	public void test2() {
		UserPO user = service.findByUserName("admin");
		assertEquals(user.getPassword(),"admin");
	}
}
