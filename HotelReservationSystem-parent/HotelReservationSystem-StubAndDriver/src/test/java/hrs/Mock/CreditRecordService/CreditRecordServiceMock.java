package hrs.Mock.CreditRecordService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import hrs.Mock.UserService.UserServiceMock;
import hrs.StubAndDriver.DAO.CreditRecordDAO.CreditRecordDAOStub;
import hrs.common.VO.CreditRecordVO;
import hrs.common.VO.UserVO;
import hrs.common.util.ResultMessage;
import hrs.common.util.VIPLevel;
import hrs.server.DAO.Interface.CreditRecordDAO;
import hrs.server.POJO.CreditRecordPO;
import hrs.server.Service.Interface.CreditRecordService.CreditRecordService;
import hrs.server.Service.Interface.UserService.UserService;

public class CreditRecordServiceMock implements CreditRecordService {

	private CreditRecordDAO creditRecordDAO;
	private UserService userService;

	public CreditRecordServiceMock() {
		creditRecordDAO = new CreditRecordDAOStub();	
		userService = new UserServiceMock();
	}

	@Override
	public List<CreditRecordVO> findByUsername(String username) {
		List<CreditRecordPO> pos = creditRecordDAO.findByUsername(username);
		if(pos == null){
			return null;
		}
		List<CreditRecordVO> vos = new ArrayList<>(pos.size());
		CreditRecordVO vo = null;
		for(CreditRecordPO po:pos){
			vo = new CreditRecordVO();
			BeanUtils.copyProperties(po, vo);
			vos.add(vo);
		}
		return vos;
	}

	@Override
	public ResultMessage add(CreditRecordVO creditrecordvo) {
		CreditRecordPO po = new CreditRecordPO();
		BeanUtils.copyProperties(creditrecordvo, po);
		UserVO user = userService.findByUsername(creditrecordvo.user.username);
		po.setCurrCredit(po.getVariation()+user.credit);
		user.credit = po.getCurrCredit();
		user.VIPLevel = VIPLevel.getLevel(user.credit);
		userService.update(user);
		return creditRecordDAO.add(po);
	}

}
