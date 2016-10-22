package hrs.client.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import hrs.client.Service.StaffService;
import hrs.client.Service.UserService;
import hrs.client.VO.StaffVO;
import hrs.client.VO.UserVO;

@Controller
public class LoginController {
	@Autowired
	private UserService userService;
	@Autowired
	private StaffService staffService;
	public LoginController() {
		// TODO Auto-generated constructor stub
	}
	public UserVO loginUser(String username,String password){
		return userService.login(username, password);
	}
	public StaffVO loginStaff(String username, String password){
		return staffService.login(username, password);
	}
}
