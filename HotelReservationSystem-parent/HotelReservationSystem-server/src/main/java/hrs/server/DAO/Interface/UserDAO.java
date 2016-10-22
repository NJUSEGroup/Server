package hrs.server.DAO.Interface;

import hrs.common.util.ResultMessage;
import hrs.server.POJO.UserPO;

public interface UserDAO {
	UserPO findByUserName(String username);
	ResultMessage add(UserPO userpo);
	ResultMessage update(UserPO userpo);
}
