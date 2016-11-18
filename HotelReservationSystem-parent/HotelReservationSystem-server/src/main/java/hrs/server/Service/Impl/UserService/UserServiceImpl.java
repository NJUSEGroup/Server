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
import hrs.server.util.DesUtil;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO dao;
	@Autowired
	private EnterpriseService enterpriseService;

	@Transactional
	@Override
	public UserVO findByUsername(String username) {

		UserPO po = dao.findByUserName(DesUtil.encodeStr(username));
		if (po == null) {
			throw new UserNotFoundException();
		} else {
			// 从数据库取出的要解密
			return decrypt(new UserVO((po)));
		}
	}

	@Transactional
	@Override
	public void register(UserVO uservo) {
		// 从界面拿到的要加密
		UserPO po = new UserPO(encrypt(uservo));
		if (dao.add(po) == ResultMessage.EXISTED) {
			throw new UserExistedException();
		} else {
			enterpriseService.add(new EnterpriseVO(po.getEnterprise()));
		}
	}

	@Transactional
	@Override
	public void update(UserVO uservo) {
		// 从界面拿到的要加密
		dao.update((new UserPO(encrypt(uservo))));
	}

	@Transactional
	@Override
	public UserVO login(String username, String password) {
		UserPO po = dao.findByUserName(DesUtil.encodeStr(username));
		if (po == null) {
			throw new UserNotFoundException();
		} else if (!po.getPassword().equals(DesUtil.encodeStr(password))) {
			throw new UserPasswordErrorException();
		} else {
			return decrypt(new UserVO((po)));
			// 从数据库取出的要解密
		}
	}

	@Transactional
	@Override
	public boolean validateCredit(String username) {
		return findByUsername(username).credit >= 0;
	}

	private UserVO decrypt(UserVO vo) {
		vo.username = DesUtil.decodeStr(vo.username);
		vo.password = DesUtil.decodeStr(vo.password);
		vo.phone = DesUtil.decodeStr(vo.phone);
		vo.name = DesUtil.decodeStr(vo.name);
		return vo;
	}

	private UserVO encrypt(UserVO vo) {
		vo.username = DesUtil.encodeStr(vo.username);
		vo.password = DesUtil.encodeStr(vo.password);
		vo.phone = DesUtil.encodeStr(vo.phone);
		vo.name = DesUtil.encodeStr(vo.name);
		return vo;
	}
}
