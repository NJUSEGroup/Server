package hrs.server.DAO.Interface;

import hrs.common.util.ResultMessage;
import hrs.server.POJO.OfflineRecordPO;

public interface OfflineRecordDAO {
	 OfflineRecordPO findByID(int id);
	 ResultMessage add(OfflineRecordPO offlinerecordpo);
	 ResultMessage update(OfflineRecordPO offlinerecordpo);
}
