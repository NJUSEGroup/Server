package hrs.common.DAO;

import hrs.common.PO.UserPO;

public interface UserDAO {
	UserPO findByUserName(String username);
	
}
