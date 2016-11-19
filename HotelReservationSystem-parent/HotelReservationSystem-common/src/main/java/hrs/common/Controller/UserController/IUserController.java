package hrs.common.Controller.UserController;

import java.util.List;

import hrs.common.Exception.CreditRecordService.CreditRecordNotFoundException;
import hrs.common.VO.CreditRecordVO;
import hrs.common.VO.UserVO;

public interface IUserController {
	void updateUser(UserVO uservo);
	UserVO findUserByUsername(String username);
	List<CreditRecordVO> findCreditRecordByUsername(String username) throws CreditRecordNotFoundException;
}
