package hrs.common.Controller.LoginController;

import hrs.common.VO.StaffVO;
import hrs.common.VO.UserVO;
import hrs.common.util.ResultMessage;

public interface ILoginController {
	ResultMessage register(UserVO uservo);
	UserVO loginUser(String username,String password);
	StaffVO loginStaff(String username, String password);
}
