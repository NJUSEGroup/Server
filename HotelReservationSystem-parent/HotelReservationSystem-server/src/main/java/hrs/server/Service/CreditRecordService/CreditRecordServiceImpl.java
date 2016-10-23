package hrs.server.Service.CreditRecordService;

import java.util.List;

import hrs.common.Service.CreditRecordService.CreditRecordService;
import hrs.common.VO.CreditRecordVO;
import hrs.common.util.ResultMessage;
import hrs.server.DAO.Interface.CreditRecordDAO;

public class CreditRecordServiceImpl implements CreditRecordService {
	private CreditRecordDAO creditRecordDAO;
	@Override
	public List<CreditRecordVO> findByUsername(String username) {
		return null;
	}

	@Override
	public ResultMessage add(CreditRecordVO creditrecordvo) {
		// TODO Auto-generated method stub
		return null;
	}

}
