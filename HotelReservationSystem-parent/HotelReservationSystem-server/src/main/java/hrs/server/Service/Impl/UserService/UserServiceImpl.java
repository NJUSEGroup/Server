package hrs.server.Service.Impl.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import hrs.common.Exception.UserService.UserExistedException;
import hrs.common.Exception.UserService.UserNotFoundException;
import hrs.common.Exception.UserService.UserPasswordErrorException;
import hrs.common.POJO.UserPO;
import hrs.common.VO.EnterpriseVO;
import hrs.common.VO.UserVO;
import hrs.common.util.ResultMessage;
import hrs.server.DAO.Interface.UserDAO;
import hrs.server.Service.Interface.PromotionService.EnterpriseService;
import hrs.server.Service.Interface.UserService.UserService;
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDAO dao;
	@Autowired
	private EnterpriseService enterpriseService;


	@Transactional
	@Override
	public UserVO findByUsername(String username) {
		UserPO po = dao.findByUserName(username);
		if(po == null){
			throw new UserNotFoundException();
		}else{
			return new UserVO(po);
		}
	}

	@Transactional
	@Override
	public ResultMessage register(UserVO uservo) {
		UserPO po = new UserPO(uservo);
		if(dao.add(po) == ResultMessage.EXISTED){
			throw new UserExistedException();
		}else{
			//这里还需要测试一下
			enterpriseService.add(new EnterpriseVO(po.getEnterprise()));
			return ResultMessage.SUCCESS;
		}
	}

	
	@Transactional
	@Override
	public ResultMessage update(UserVO uservo) {
		return dao.update(new UserPO(uservo));
	}

	@Transactional
	@Override
	public UserVO login(String username, String password) {
		UserPO po = dao.findByUserName(username);
		if(po == null ){
			throw new UserNotFoundException();
		}else if ( !po.getPassword().equals(password)) {
			throw new UserPasswordErrorException();
		} else {
			return new UserVO(po);
		}
	}
}
