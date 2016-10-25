package hrs.common.Controller.UserController;

import java.util.List;

import hrs.common.VO.CreditRecordVO;
import hrs.common.VO.UserVO;
import hrs.common.util.ResultMessage;

public interface IUserController {
	ResultMessage update(UserVO uservo);
	UserVO findUserByUsername(String username);
	List<CreditRecordVO> findByUsername(String username);
}
