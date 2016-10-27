package hrs.server.Controller.LoginController;

import hrs.common.Controller.LoginController.ILoginController;
import hrs.common.VO.StaffVO;
import hrs.common.VO.UserVO;
import hrs.common.util.ResultMessage;
import hrs.server.Service.Interface.StaffService.StaffService;
import hrs.server.Service.Interface.UserService.UserService;

public class LoginController implements ILoginController {
	private UserService userService;
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

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public StaffService getStaffService() {
		return staffService;
	}

	public void setStaffService(StaffService staffService) {
		this.staffService = staffService;
	}

}