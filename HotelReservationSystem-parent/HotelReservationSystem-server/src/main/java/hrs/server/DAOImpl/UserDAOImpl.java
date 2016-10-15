package hrs.server.DAOImpl;

/**
 * UserController的创建依赖于UserService
 * UserService的创建依赖于UserDAO
 * UserDAOImpl的创建依赖于JDBCTemplate，JDBCTemplate的创建依赖于DataSource
 * DataSource的创建依赖于ApplicationContext
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import hrs.common.DAO.UserDAO;
import hrs.common.PO.UserPO;
import hrs.common.util.ResultMessage;
import hrs.server.DatabaseUtility.JDBCTemplate;

@Repository
public class UserDAOImpl implements UserDAO {
	@Autowired
	private JDBCTemplate jdbcTemplate;

	@Override
	public UserPO findByUserName(String username) {
		String sql = "select user_username as username,user_pwd as password from user where user_username = ?";
		
		return jdbcTemplate.find(sql, UserPO.class, username);
	}
	@Override
	public ResultMessage add(UserPO userpo) {
		String sql = "insert into user(user_username,user_pwd,user_phone,user_credit,user_name,user_birthdate,user_enterprise,user_level,user_type) values(:username,:password,:phone,:credit,:name,:birthDate,:enterprise,:VIPLevel,:type)";
		if (findByUserName(userpo.getUsername()) == null) {
			jdbcTemplate.add(sql, userpo);
			return ResultMessage.SUCCESS;
		} else {
			return ResultMessage.EXISTED;
		}
	}

	@Override
	public ResultMessage update(UserPO userpo) {
		String sql = "update user set user_pwd = :password ,user_phone = :phone,user_credit = :credit,user_name = :name,user_birthdate = :birthDate,user_enterprise = :enterprise,user_level = :VIPLevel,user_type = :type where user_username = :username";
		jdbcTemplate.update(sql, userpo);
		return ResultMessage.SUCCESS;
	}
	
}
