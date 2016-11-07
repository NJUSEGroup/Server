package hrs.server.Service.Impl.StaffService;

import org.springframework.transaction.annotation.Transactional;

import hrs.common.VO.StaffVO;
import hrs.common.util.ResultMessage;
import hrs.server.DAO.Interface.StaffDAO;
import hrs.server.Service.Interface.StaffService.StaffService;

public class StaffServiceImpl implements StaffService {
	private StaffDAO dao;

	@Transactional
	@Override
	public StaffVO login(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	@Override
	public ResultMessage update(StaffVO staffvo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	@Override
	public ResultMessage add(StaffVO staffvo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	@Override
	public StaffVO findByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	@Override
	public StaffVO findByHotelName(String hotelName) {
		// TODO Auto-generated method stub
		return null;
	}

	public void setDao(StaffDAO dao) {
		this.dao = dao;
	}
}
