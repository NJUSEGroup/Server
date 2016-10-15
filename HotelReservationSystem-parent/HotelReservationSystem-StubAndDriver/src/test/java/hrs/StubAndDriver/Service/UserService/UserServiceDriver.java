package hrs.StubAndDriver.Service.UserService;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import hrs.client.Service.UserService;
import hrs.client.VO.UserVO;
import hrs.common.util.ResultMessage;

public class UserServiceDriver {
	private UserService service;
	@Before
	public void launch(){
		service = new UserServiceStub();
	}
	@Test
	public void testFindByUsername(){
		UserVO vo = service.findByUsername("admin");
		assertEquals(vo.getPassword(),"admin");
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
