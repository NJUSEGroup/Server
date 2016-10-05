package rhs.common.DataService;

import rhs.common.PO.UserPO;

public interface UserDataService {
	UserPO findByUserName(String username);
}
