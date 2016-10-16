package hrs.client.Service.RoomService;

import java.util.List;

import hrs.client.VO.RoomVO;
import hrs.common.util.ResultMessage;
import hrs.common.util.type.RoomType;

public interface RoomService {
	RoomVO findByHotelAndType(int hotelID,RoomType type);
	List<RoomVO> findAvailableByHotelID(int hotelID);
	ResultMessage update(RoomVO roomvo);
	ResultMessage add(RoomVO roomvo);
	List<RoomType> findNotAddedRoomType(int hotelID);
}
