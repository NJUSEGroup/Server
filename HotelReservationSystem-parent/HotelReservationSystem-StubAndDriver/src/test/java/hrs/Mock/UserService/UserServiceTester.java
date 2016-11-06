package hrs.Mock.UserService;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import hrs.common.VO.UserVO;
import hrs.common.util.ResultMessage;
import hrs.server.Service.Interface.UserService.UserService;

public class UserServiceTester {
	private UserService service;
	@Before
	public void launch(){
		service = new UserServiceMock();
	}
	@Test
	public void testFindByUsername(){
		UserVO vo = service.findByUsername("admin");
		assertEquals(vo.password,"admin");
	}
	@Test
	public void testRegister(){
		assertTrue(service.register(new UserVO("admin","admin")) == ResultMessage.EXISTED);
	}
	@Test
	public void testUpdate(){
		assertTrue(service.update(new UserVO("admin","66666666666666")) == ResultMessage.SUCCESS);
	}
	@Test
	public void testLogin(){
		assertNotNull(service.login("admin", "admin"));
	}
 	
}
