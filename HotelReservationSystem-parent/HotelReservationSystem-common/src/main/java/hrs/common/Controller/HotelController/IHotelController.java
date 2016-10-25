package hrs.common.Controller.HotelController;

import java.util.List;

import hrs.common.VO.HotelVO;
import hrs.common.VO.OfflineRecordVO;
import hrs.common.VO.RoomVO;
import hrs.common.util.ResultMessage;
import hrs.common.util.type.RoomType;

public interface IHotelController {
	HotelVO findHotelByID(int hotelID);
	ResultMessage updateHotel(HotelVO hotelvo);
	OfflineRecordVO findOfflineRecordByID(int id);
	ResultMessage addOfflineRecord(OfflineRecordVO offlinerecordvo);
	ResultMessage offlineCheckin(OfflineRecordVO offlinerecordvo);
	ResultMessage offlineCheckout(OfflineRecordVO offlinerecordvo);
	ResultMessage updateRoom(RoomVO roomvo);
	ResultMessage addRoom(RoomVO roomvo);
	List<RoomType> findNotAddedRoomType(int hotelID);
	RoomVO findRoomByHotelAndType(int hotelID,RoomType type);
}
