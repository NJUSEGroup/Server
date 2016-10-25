package hrs.server.Service.Impl.CreditRecordService;

import java.util.List;

import hrs.common.VO.CreditRecordVO;
import hrs.common.util.ResultMessage;
import hrs.server.DAO.Interface.CreditRecordDAO;
import hrs.server.Service.Interface.CreditRecordService.CreditRecordService;
import hrs.server.Service.Interface.UserService.UserService;

public class CreditRecordServiceImpl implements CreditRecordService {
	private CreditRecordDAO dao;
	private UserService userService;

	public CreditRecordDAO getDao() {
		return dao;
	}

	public void setDao(CreditRecordDAO dao) {
		this.dao = dao;
	}

	@Override
	public List<CreditRecordVO> findByUsername(String username) {
		return null;
	}

	@Override
	public ResultMessage add(CreditRecordVO creditrecordvo) {
		// TODO Auto-generated method stub
		return null;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

}
