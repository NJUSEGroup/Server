package test.server.Service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import hrs.common.Exception.UserService.UserExistedException;
import hrs.common.Exception.UserService.UserNotFoundException;
import hrs.common.Exception.UserService.UserPasswordErrorException;
import hrs.common.VO.UserVO;
import hrs.common.util.ResultMessage;
import hrs.server.Service.Interface.UserService.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class TestUserService {
	@Autowired
	private UserService service;

	@Test
	public void testFindByUsername() {
		UserVO vo = service.findByUsername("admin");
		System.out.println(vo);
		assertEquals(vo.password, "admin");
	}
	
	@Test
	public void testValidateCredit(){
		assertTrue(service.validateCredit("admin"));
	}
	

	@Test(expected = UserExistedException.class)
	public void testRegister() {
		assertEquals(service.register(new UserVO("admin", "admin")), ResultMessage.SUCCESS);
	}

	@Test
	public void testUpdate() {
		UserVO vo = service.findByUsername("admin");
		vo.credit = 3000;
//		service.update(vo);
//		assertEquals(service.findByUsername("admin").credit, 3000);
	}

	@Test(expected = UserPasswordErrorException.class)
	public void testLogin1() {
		service.login("admin", "2222");
	}

	@Test(expected = UserNotFoundException.class)
	public void testLogin2() {
		service.login("admin111", "2222");
	}

	@Test
	public void testLogin3() {
		assertEquals(service.login("admin", "admin").username, "admin");
	}

}
