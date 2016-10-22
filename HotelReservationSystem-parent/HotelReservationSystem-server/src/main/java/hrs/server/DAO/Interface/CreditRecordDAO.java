package hrs.server.DAO.Interface;

import java.util.List;

import hrs.common.util.ResultMessage;
import hrs.server.POJO.CreditRecordPO;

public interface CreditRecordDAO {
	 List<CreditRecordPO> findByUsername(String username);
	 ResultMessage add(CreditRecordPO creditrecordpo);
}
