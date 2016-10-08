package hrs.StubAndDriver.BLService.UserBLService;

import hrs.client.BLService.UserBLService;

public class UserBLServiceStub implements UserBLService{
	
	@Override
	public boolean login(String username, String password) {
		return false;
	}
}
