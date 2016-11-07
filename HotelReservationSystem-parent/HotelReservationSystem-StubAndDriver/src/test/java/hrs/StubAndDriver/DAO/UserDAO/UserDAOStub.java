package hrs.StubAndDriver.DAO.UserDAO;

import java.util.HashMap;
import java.util.Map;

import hrs.common.util.ResultMessage;
import hrs.common.util.type.UserType;
import hrs.server.DAO.Interface.UserDAO;
import hrs.server.POJO.UserPO;

public class UserDAOStub implements UserDAO {
	private Map<String,UserPO> map;
	public UserDAOStub() {
		map = new HashMap<>();
		map.put("admin", new UserPO("admin","admin", null, null, 0, 0, UserType.Normal));
	}
	@Override
	public UserPO findByUserName(String username) {
		return map.get(username);
	}

	@Override
	public ResultMessage add(UserPO userpo) {
		if(findByUserName(userpo.getUsername()) == null){
			map.put(userpo.getUsername(), userpo);
				return ResultMessage.SUCCESS;
		}else{
			return ResultMessage.EXISTED;
		}
	}

	@Override
	public ResultMessage update(UserPO userpo) {
		map.put(userpo.getUsername(), userpo);
		return ResultMessage.SUCCESS;
	}
	
}
