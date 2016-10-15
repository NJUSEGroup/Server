package hrs.client.Service;

import hrs.client.VO.UserVO;
import hrs.common.util.ResultMessage;

public interface UserService {
	UserVO findByUsername(String username);
	ResultMessage register(UserVO uservo);
	ResultMessage update(UserVO uservo);
	UserVO login(String username,String password);
}
