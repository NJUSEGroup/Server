package hrs.server.Service.Impl.StaffService;

import hrs.common.VO.StaffVO;
import hrs.common.util.ResultMessage;
import hrs.server.DAO.Interface.StaffDAO;
import hrs.server.Service.Interface.StaffService.StaffService;
public class StaffServiceImpl implements StaffService {
	private StaffDAO dao;

	@Override
	public StaffVO login(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage update(StaffVO staffvo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage add(StaffVO staffvo) {
		// TODO Auto-generated method stub
		return null;
	}

	public StaffDAO getDao() {
		return dao;
	}

	public void setDao(StaffDAO dao) {
		this.dao = dao;
	}
}
