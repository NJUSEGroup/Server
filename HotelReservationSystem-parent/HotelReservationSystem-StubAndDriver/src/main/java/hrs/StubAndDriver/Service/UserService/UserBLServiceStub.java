package hrs.StubAndDriver.Service.UserService;

import hrs.client.Service.UserService;

public class UserBLServiceStub implements UserService{
	
	@Override
	public boolean login(String username, String password) {
		return false;
	}
}
