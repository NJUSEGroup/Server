package hrs.client.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import hrs.client.Service.StaffService;
import hrs.client.Service.UserService;
import hrs.client.VO.StaffVO;
import hrs.client.VO.UserVO;
import hrs.common.util.ResultMessage;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	@Autowired
	private StaffService staffService;
	
	public UserVO findByUsername(String username){
		return userService.findByUsername(username);
	}
	public ResultMessage register(UserVO uservo){
		return userService.register(uservo);
	}
	public ResultMessage update(UserVO uservo){
		return userService.update(uservo);
	}
	public UserVO userLogin(String username,String password){
		return userService.login(username, password);		
	}
	public StaffVO staffLogin(String username,String password){
		return staffService.login(username, password);
	}
}
