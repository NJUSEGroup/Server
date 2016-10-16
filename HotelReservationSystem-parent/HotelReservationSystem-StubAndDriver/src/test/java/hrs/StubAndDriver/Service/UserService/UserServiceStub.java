package hrs.StubAndDriver.Service.UserService;

import org.springframework.beans.BeanUtils;

import hrs.StubAndDriver.DAO.UserDAO.UserDAOStub;
import hrs.client.Service.UserService;
import hrs.client.VO.UserVO;
import hrs.common.DAO.UserDAO;
import hrs.common.PO.UserPO;
import hrs.common.util.ResultMessage;

public class UserServiceStub implements UserService{
	private UserDAO userDao = new UserDAOStub();
	
	@Override
	public UserVO findByUsername(String username) {
		UserPO po =  userDao.findByUserName(username);
		if(po == null){
			return null;
		}
		UserVO vo = new UserVO();
		BeanUtils.copyProperties(po,vo);
		return vo;
	}

	@Override
	public ResultMessage register(UserVO uservo) {
		UserPO po = new UserPO();
		BeanUtils.copyProperties(uservo, po);
		return userDao.add(po);
	}

	@Override
	public ResultMessage update(UserVO uservo) {
		UserPO po = new UserPO();
		BeanUtils.copyProperties(uservo, po);
		return userDao.update(po);
	}

	@Override
	public UserVO login(String username, String password) {
		 UserPO po = userDao.findByUserName(username);
		 if(po == null || !po.getPassword().equals(password)){
			 return null;
		 }
		 UserVO vo = new UserVO();
		 BeanUtils.copyProperties(po, vo);
		 return vo;
	}
}
