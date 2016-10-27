package hrs.common.Controller.HotelController;

import java.util.List;

import hrs.common.VO.RoomVO;
import hrs.common.util.ResultMessage;
import hrs.common.util.type.RoomType;

public interface IRoomController {
	ResultMessage updateRoom(RoomVO roomvo);
	ResultMessage addRoom(RoomVO roomvo);
	List<RoomType> findNotAddedRoomType(int hotelID);
	List<RoomVO> findByHotelID(int hotelID);
}
