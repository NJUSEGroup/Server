package test.server.Service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import hrs.common.Exception.UserService.UserExistedException;
import hrs.common.Exception.UserService.UserNotFoundException;
import hrs.common.Exception.UserService.UserPasswordErrorException;
import hrs.common.VO.EnterpriseVO;
import hrs.common.VO.UserVO;
import hrs.common.util.ResultMessage;
import hrs.common.util.type.UserType;
import hrs.server.Service.Interface.PromotionService.EnterpriseService;
import hrs.server.Service.Interface.UserService.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class TestUserService {
	@Autowired
	private UserService service;
	@Autowired
	private EnterpriseService enterpriseService;

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
	public void testRegister1() {
		service.register(new UserVO("admin","admin"));
	}
	
	@Test
	public void testRegister2() {
		UserVO vo = new UserVO("admin666", "admin666", "123123", "呵呵", 0, 1, UserType.Enterprise,"酒店ttt");
		service.register(vo);
		vo = service.findByUsername("admin666");
		assertEquals(vo.password,"admin666");
		List<EnterpriseVO> list = enterpriseService.getAllEnterprises();
		for(EnterpriseVO enterprise:list){
			if(enterprise.name.equals("酒店ttt")){
				return;
			}
		}
		fail();
	}
	
	@Test
	public void testUpdate() {
		UserVO vo = service.findByUsername("admin");
		vo.credit = 3000;
		service.update(vo);
		assertEquals(service.findByUsername("admin").credit, 3000);
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
