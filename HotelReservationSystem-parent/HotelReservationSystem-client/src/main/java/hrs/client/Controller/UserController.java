package hrs.client.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import hrs.client.Service.UserService;
import hrs.client.VO.UserVO;
import hrs.common.util.ResultMessage;

@Controller
public class UserController {
	@Autowired
	private UserService service;
	
	public UserVO findByUsername(String username){
		return service.findByUsername(username);
	}
	public ResultMessage register(UserVO uservo){
		return service.register(uservo);
	}
	public ResultMessage update(UserVO uservo){
		return service.update(uservo);
	}
	public UserVO login(String username,String password){
		return service.login(username, password);
	}
}
