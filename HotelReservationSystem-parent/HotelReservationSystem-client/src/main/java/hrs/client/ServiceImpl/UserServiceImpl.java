package hrs.client.ServiceImpl;

import hrs.client.Service.UserService;
import hrs.common.DAO.UserDAO;

public class UserServiceImpl implements UserService{
	private UserDAO dataservice;
	public UserServiceImpl(UserDAO dataservice) {
		this.dataservice = dataservice;
	}
	public boolean login(String username, String password) {
		return password.equals(dataservice.findByUserName(username).getPassword());
	}
}
