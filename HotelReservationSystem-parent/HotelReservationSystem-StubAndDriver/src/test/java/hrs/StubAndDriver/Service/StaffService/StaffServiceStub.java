package hrs.StubAndDriver.Service.StaffService;

import org.springframework.beans.BeanUtils;

import hrs.StubAndDriver.DAO.StaffDAO.StaffDAOStub;
import hrs.client.Service.StaffService.StaffService;
import hrs.client.VO.StaffVO;
import hrs.common.DAO.StaffDAO;
import hrs.common.util.ResultMessage;
import hrs.server.POJO.StaffPO;

public class StaffServiceStub implements StaffService {
	private StaffDAO staffDao;
	
	public StaffServiceStub(){
		staffDao = new StaffDAOStub();
	}
	
	@Override
	public StaffVO login(String username, String password) {
		StaffPO po = staffDao.findByUsername(username);
		if(po == null || !po.getPassword().equals(password)){
			return null;
		}
		StaffVO vo = new StaffVO();
		BeanUtils.copyProperties(po, vo);
		return vo;
	}

	@Override
	public ResultMessage update(StaffVO staffvo) {
		StaffPO po = new StaffPO();
		BeanUtils.copyProperties(staffvo, po);
		return staffDao.update(po);
	}

	@Override
	public ResultMessage add(StaffVO staffvo) {
		StaffPO po = new StaffPO();
		BeanUtils.copyProperties(staffvo, po);
		return staffDao.add(po);
	}

}
