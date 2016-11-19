package hrs.common.Controller.WebStaffController;

import hrs.common.VO.UserVO;

public interface IWebUserController {
	UserVO findUserByUsername(String username);
	void updateUser(UserVO uservo);
}
