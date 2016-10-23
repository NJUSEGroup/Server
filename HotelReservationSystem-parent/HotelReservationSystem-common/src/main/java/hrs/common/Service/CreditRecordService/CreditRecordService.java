package hrs.common.Service.CreditRecordService;

import java.util.List;

import hrs.common.VO.CreditRecordVO;
import hrs.common.util.ResultMessage;

public interface CreditRecordService {
	List<CreditRecordVO> findByUsername(String username);
	ResultMessage add(CreditRecordVO creditrecordvo);
}	
