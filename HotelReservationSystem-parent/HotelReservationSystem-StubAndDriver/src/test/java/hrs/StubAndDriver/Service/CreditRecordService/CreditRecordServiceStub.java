package hrs.StubAndDriver.Service.CreditRecordService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import hrs.StubAndDriver.DAO.CreditRecordDAO.CreditRecordDAOStub;
import hrs.StubAndDriver.Service.UserService.UserServiceStub;
import hrs.client.Service.CreditRecordService.CreditRecordService;
import hrs.client.Service.UserService.UserService;
import hrs.client.VO.CreditRecordVO;
import hrs.client.VO.UserVO;
import hrs.common.DAO.CreditRecordDAO;
import hrs.common.util.ResultMessage;
import hrs.common.util.VIPLevel;
import hrs.server.POJO.CreditRecordPO;

public class CreditRecordServiceStub implements CreditRecordService {

	private CreditRecordDAO creditRecordDAO;
	private UserService userService;

	public CreditRecordServiceStub() {
		creditRecordDAO = new CreditRecordDAOStub();
		userService = new UserServiceStub();
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
		UserVO user = userService.findByUsername(creditrecordvo.username);
		po.setCurrCredit(po.getVariation()+user.credit);
		user.credit = po.getCurrCredit();
		user.VIPLevel = VIPLevel.getLevel(user.credit);
		userService.update(user);
		return creditRecordDAO.add(po);
	}

}
