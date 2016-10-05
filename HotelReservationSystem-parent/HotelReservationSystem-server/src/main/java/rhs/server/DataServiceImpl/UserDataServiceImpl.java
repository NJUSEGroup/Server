package rhs.server.DataServiceImpl;


import rhs.common.DataService.UserDataService;
import rhs.common.PO.UserPO;
import rhs.server.DatabaseUtility.JDBCTemplateHelper;

public class UserDataServiceImpl implements UserDataService{
	public UserPO findByUserName(String username) {
		String sql = "select user_username as username,user_pwd as password from user where user_username = ?";
		return JDBCTemplateHelper.find(sql, UserPO.class, username);
	}
	
}
