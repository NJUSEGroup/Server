package hrs.common.DAO;

import hrs.common.PO.UserPO;
import hrs.common.util.ResultMessage;

public interface UserDAO {
	UserPO findByUserName(String username);
	ResultMessage add(UserPO userpo);
	ResultMessage update(UserPO userpo);
}
