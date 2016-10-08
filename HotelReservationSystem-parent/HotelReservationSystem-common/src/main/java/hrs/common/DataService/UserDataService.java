package hrs.common.DataService;

import hrs.common.PO.UserPO;

public interface UserDataService {
	UserPO findByUserName(String username);
	
}
