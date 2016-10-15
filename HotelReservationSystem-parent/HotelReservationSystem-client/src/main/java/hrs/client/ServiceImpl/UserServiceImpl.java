package hrs.client.ServiceImpl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrs.client.Service.UserService;
import hrs.client.VO.UserVO;
import hrs.common.DAO.UserDAO;
import hrs.common.PO.UserPO;
import hrs.common.util.ResultMessage;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDAO dao;

	@Override
	public UserVO findByUsername(String username) {
		UserVO vo = null;
		BeanUtils.copyProperties(dao.findByUserName(username), vo);
		return vo;
	}

	@Override
	public ResultMessage register(UserVO uservo) {
		UserPO po = null;
		BeanUtils.copyProperties(uservo, po);
		return dao.add(po);
	}

	@Override
	public ResultMessage update(UserVO uservo) {
		UserPO po = null;
		BeanUtils.copyProperties(uservo, po);
		return dao.update(po);
	}

	@Override
	public UserVO login(String username, String password) {
		UserPO po = dao.findByUserName(username);
		if(po == null){
			return null;
		}else{
			UserVO vo = null;
			BeanUtils.copyProperties(po, vo);
			return vo;
		}
	}
}
