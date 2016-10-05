package rhs.server.DataServiceImpl;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import rhs.common.DataService.UserDataService;
import rhs.common.PO.UserPO;

public class TestUserDataServiceImpl {
	private UserDataService service;
	@Before
	public void setUp() throws Exception {
		service = new UserDataServiceImpl();
	}	

	@Test
	public void test() {
		UserPO user = service.findByUserName("admin");
		assertEquals(user.getPassword(),"admin");
	}

}
