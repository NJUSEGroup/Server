package hrs.server.DAOImpl;


import hrs.common.DAO.UserDAO;
import hrs.common.PO.UserPO;
import hrs.server.DatabaseUtility.JDBCTemplate;

public class UserDAOImpl implements UserDAO{
	public UserPO findByUserName(String username) {
		String sql = "select user_username as username,user_pwd as password from user where user_username = ?";
		return JDBCTemplate.find(sql, UserPO.class, username);
	}
	
}
