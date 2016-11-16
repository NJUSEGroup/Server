package hrs.server.Service.Interface.OfflineRecordService;

import hrs.common.VO.OfflineRecordVO;
import hrs.common.util.ResultMessage;

public interface OfflineRecordService {
	OfflineRecordVO findByID(int id);
	ResultMessage checkin(OfflineRecordVO offlinerecordvo);
	ResultMessage checkout(OfflineRecordVO offlinerecordvo);
}
