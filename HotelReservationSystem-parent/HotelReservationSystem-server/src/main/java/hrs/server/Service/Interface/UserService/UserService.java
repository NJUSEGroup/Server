package hrs.server.Service.Interface.UserService;

import hrs.common.VO.UserVO;
import hrs.common.util.ResultMessage;

public interface UserService {
	UserVO findByUsername(String username);
	void register(UserVO uservo);
	void update(UserVO uservo);
	UserVO login(String username,String password);
	boolean validateCredit(String username);
}
