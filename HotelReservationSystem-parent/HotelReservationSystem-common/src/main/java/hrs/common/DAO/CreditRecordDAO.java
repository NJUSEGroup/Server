package hrs.common.DAO;

import java.util.List;

import hrs.common.PO.CreditRecordPO;
import hrs.common.util.ResultMessage;

public interface CreditRecordDAO {
	 List<CreditRecordPO> findByUsername(String username);
	 ResultMessage add(CreditRecordPO creditrecordpo);
}
