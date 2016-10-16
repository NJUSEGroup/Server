package hrs.StubAndDriver.Service.StaffService;

import org.springframework.beans.BeanUtils;

import hrs.StubAndDriver.DAO.StaffDAO.StaffDAOStub;
import hrs.client.Service.StaffService;
import hrs.client.VO.StaffVO;
import hrs.common.DAO.StaffDAO;
import hrs.common.PO.StaffPO;
import hrs.common.util.ResultMessage;

public class StaffServiceStub implements StaffService {
	StaffDAO staffDao;
	
	public StaffServiceStub(){
		staffDao = new StaffDAOStub();
	}
	
	@Override
	public StaffVO login(String username, String password) {
		StaffVO vo = new StaffVO();
		StaffPO po = staffDao.findByUsername(username);
		BeanUtils.copyProperties(po, vo);
		if(vo.password.equals(password)){
			return vo;
		}
		else
			return null;
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
