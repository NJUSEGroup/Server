package hrs.server.Service.Impl.CreditRecordService;

import java.util.List;

import hrs.common.VO.CreditRecordVO;
import hrs.common.util.ResultMessage;
import hrs.server.DAO.Interface.CreditRecordDAO;
import hrs.server.Service.Interface.CreditRecordService.CreditRecordService;

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
