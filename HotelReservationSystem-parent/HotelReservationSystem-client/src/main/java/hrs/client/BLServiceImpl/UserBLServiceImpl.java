package hrs.client.BLServiceImpl;

import hrs.client.BLService.UserBLService;
import hrs.common.DataService.UserDataService;

public class UserBLServiceImpl implements UserBLService{
	private UserDataService dataservice;
	public UserBLServiceImpl(UserDataService dataservice) {
		this.dataservice = dataservice;
	}
	public boolean login(String username, String password) {
		return password.equals(dataservice.findByUserName(username).getPassword());
	}
}
