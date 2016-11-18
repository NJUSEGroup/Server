package hrs.server.Service.Interface.CreditRecordService;

import java.util.List;

import hrs.common.VO.CreditRecordVO;

public interface CreditRecordService {
	List<CreditRecordVO> findByUsername(String username);
	void add(CreditRecordVO creditrecordvo);
}	
