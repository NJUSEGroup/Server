package hrs.common.Service.RoomService;

import java.util.Date;
import java.util.List;

import hrs.common.VO.RoomVO;
import hrs.common.util.ResultMessage;
import hrs.common.util.type.RoomType;

public interface RoomService {
	RoomVO findByHotelAndType(int hotelID,RoomType type);
	List<RoomVO> findAvailableByHotelID(int hotelID,Date begin,Date end);
	ResultMessage update(RoomVO roomvo);
	ResultMessage add(RoomVO roomvo);
	List<RoomType> findNotAddedRoomType(int hotelID);
	int findAvailableRoomNum(int hotelID,RoomType type,Date begin,Date end);
}
