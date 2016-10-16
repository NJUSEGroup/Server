package hrs.StubAndDriver.Service.CreditRecordService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import hrs.StubAndDriver.DAO.CreditRecordDAO.CreditRecordDAOStub;
import hrs.StubAndDriver.Service.UserService.UserServiceStub;
import hrs.client.Service.CreditRecordService;
import hrs.client.Service.UserService;
import hrs.client.VO.CreditRecordVO;
import hrs.client.VO.HotelDiscountVO;
import hrs.client.VO.UserVO;
import hrs.common.DAO.CreditRecordDAO;
import hrs.common.PO.CreditRecordPO;
import hrs.common.PO.HotelDiscountPO;
import hrs.common.util.ResultMessage;

public class CreditRecordServiceStub implements CreditRecordService {
	private CreditRecordDAO creditRecordDAO;
	private UserService  userService;
	public CreditRecordServiceStub() {
		creditRecordDAO=new CreditRecordDAOStub();
		userService=new UserServiceStub();
	}

	@Override
	public List<CreditRecordVO> findByUsername(String username) {
		List<CreditRecordPO> po=creditRecordDAO.findByUsername(username);
		List<CreditRecordVO> vo=new ArrayList<>(po.size());
		BeanUtils.copyProperties(po, vo);
		return vo;
	}

	@Override
	public ResultMessage add(CreditRecordVO creditrecordvo) {
		CreditRecordPO po=new CreditRecordPO();
		BeanUtils.copyProperties(creditrecordvo, po);
		BeanUtils.copyProperties(userService.findByUsername(creditrecordvo.getUsername()).getCredit()+creditrecordvo.getVariation(),userService.findByUsername(creditrecordvo.getUsername()).getCredit());//userService中更新信用值
		userService.update(userService.findByUsername(creditrecordvo.getUsername()));
		return creditRecordDAO.add(po);
	}

}
