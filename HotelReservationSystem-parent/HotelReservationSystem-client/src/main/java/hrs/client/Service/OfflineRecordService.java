package hrs.client.Service;

import hrs.client.VO.OfflineRecordVO;
import hrs.common.util.ResultMessage;

public interface OfflineRecordService {
	OfflineRecordVO findByID(int id);
	ResultMessage add(OfflineRecordVO offlinerecordvo);
	ResultMessage update(OfflineRecordVO offlinerecordvo);
	
}
