package hrs.common.Controller.HotelController;

import java.util.Date;
import java.util.List;

import hrs.common.VO.OfflineRecordVO;
import hrs.common.VO.RoomVO;
import hrs.common.util.ResultMessage;

public interface IOfflineRecordController {
	OfflineRecordVO findOfflineRecordByID(int id);
	ResultMessage addOfflineRecord(OfflineRecordVO offlinerecordvo);
	ResultMessage offlineCheckin(OfflineRecordVO offlinerecordvo);
	ResultMessage offlineCheckout(OfflineRecordVO offlinerecordvo);
	List<RoomVO> findAvailableByHotelID(int hotelID,Date begin,Date end);
}
