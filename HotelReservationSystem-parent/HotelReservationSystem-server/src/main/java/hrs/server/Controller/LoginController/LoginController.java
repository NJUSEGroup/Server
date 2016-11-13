package hrs.server.Controller.LoginController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import hrs.common.Controller.LoginController.ILoginController;
import hrs.common.VO.StaffVO;
import hrs.common.VO.UserVO;
import hrs.common.util.ResultMessage;
import hrs.server.Service.Interface.StaffService.StaffService;
import hrs.server.Service.Interface.UserService.UserService;
@Controller
public class LoginController implements ILoginController {
	@Autowired
	private UserService userService;
	@Autowired
	private StaffService staffService;

	@Override
	public ResultMessage register(UserVO uservo) {
		return null;
	}

	@Override
	public UserVO loginUser(String username, String password) {
		System.out.println("LoginController.loginUser("+username+","+password+")");
		return userService.login(username, password);
	}

	@Override
	public StaffVO loginStaff(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}
}
