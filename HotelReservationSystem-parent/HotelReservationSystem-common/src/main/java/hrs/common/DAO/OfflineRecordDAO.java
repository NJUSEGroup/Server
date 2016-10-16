package hrs.common.DAO;

import hrs.common.PO.OfflineRecordPO;
import hrs.common.util.ResultMessage;

public interface OfflineRecordDAO {
	 OfflineRecordPO findByID(int id);
	 ResultMessage add(OfflineRecordPO offlinerecordpo);
	 ResultMessage update(OfflineRecordPO offlinerecordpo);
}
