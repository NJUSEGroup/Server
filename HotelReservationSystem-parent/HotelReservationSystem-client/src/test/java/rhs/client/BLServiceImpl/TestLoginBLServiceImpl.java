package rhs.client.BLServiceImpl;
import static org.easymock.EasyMock.*;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import hrs.client.BLService.LoginBLService;
import hrs.client.BLServiceImpl.LoginBLServiceImpl;
import hrs.common.DataService.UserDataService;
import hrs.common.PO.UserPO;

public class TestLoginBLServiceImpl {
	private LoginBLService service;
	private UserDataService dataservice;//没有实际的代码，需要模拟
	private UserPO baseUser ;
	@Before
	public void setUp() throws Exception {
		dataservice = createMock(UserDataService.class);
		service = new LoginBLServiceImpl(dataservice);
		baseUser = new UserPO();
		baseUser.setUsername("admin");
		baseUser.setPassword("admin");
	}

	@Test
	public void test() {
		//设置预期行为
		expect(dataservice.findByUserName("admin")).andReturn(baseUser);
		//切换到响应状态
		replay(dataservice);
		//正式测试
		assertTrue(service.login("admin", "admin"));
	}
	
	@After
	public void tearDown(){
		verify(dataservice);
	}
}
