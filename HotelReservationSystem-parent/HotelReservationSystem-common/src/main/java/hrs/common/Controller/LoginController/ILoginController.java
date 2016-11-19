package hrs.common.Controller.LoginController;

import hrs.common.VO.StaffVO;
import hrs.common.VO.UserVO;

public interface ILoginController {
	void register(UserVO uservo);
	UserVO loginUser(String username,String password);
	StaffVO loginStaff(String username, String password);
}
