package hrs.common.Controller.WebStaffController;

import hrs.common.VO.UserVO;
import hrs.common.util.ResultMessage;

public interface WebUserController {
	UserVO findUserByUsername(String username);
	ResultMessage updateUser(UserVO uservo);
}
