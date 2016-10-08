package hrs.client.BLServiceImpl;

import hrs.client.BLService.LoginBLService;
import hrs.common.DataService.UserDataService;

public class LoginBLServiceImpl implements LoginBLService{
	private UserDataService dataservice;
	public LoginBLServiceImpl(UserDataService dataservice) {
		this.dataservice = dataservice;
	}
	public boolean login(String username, String password) {
		return password.equals(dataservice.findByUserName(username).getPassword());
	}
	
	
}
