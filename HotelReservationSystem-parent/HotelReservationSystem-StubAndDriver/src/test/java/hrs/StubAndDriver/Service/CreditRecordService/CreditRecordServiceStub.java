package hrs.StubAndDriver.Service.CreditRecordService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import hrs.StubAndDriver.DAO.CreditRecordDAO.CreditRecordDAOStub;
import hrs.client.Service.CreditRecordService;
import hrs.client.VO.CreditRecordVO;
import hrs.client.VO.HotelDiscountVO;
import hrs.common.DAO.CreditRecordDAO;
import hrs.common.PO.CreditRecordPO;
import hrs.common.PO.HotelDiscountPO;
import hrs.common.util.ResultMessage;

public class CreditRecordServiceStub implements CreditRecordService {
	private CreditRecordDAO creditRecordDAO=new CreditRecordDAOStub();

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
		return creditRecordDAO.add(po);
	}

}
