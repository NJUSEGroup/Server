package hrs.common.Controller;

import hrs.common.VO.StaffVO;
import hrs.common.VO.UserVO;

public interface ILoginController {
	UserVO loginUser(String username,String password);
	
	StaffVO loginStaff(String username,String password);
}
