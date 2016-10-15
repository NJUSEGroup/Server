package hrs.client.Service;

import java.util.List;

import hrs.client.VO.CreditRecordVO;
import hrs.common.util.ResultMessage;

public interface CreditRecordService {
	List<CreditRecordVO> findByUsername(String username);
	ResultMessage add(CreditRecordVO creditrecordvo);
}	
