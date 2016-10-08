package hrs.server.DataServiceImpl;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import hrs.common.DataService.UserDataService;
import hrs.common.PO.UserPO;
import hrs.server.DataServiceImpl.UserDataServiceImpl;

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
