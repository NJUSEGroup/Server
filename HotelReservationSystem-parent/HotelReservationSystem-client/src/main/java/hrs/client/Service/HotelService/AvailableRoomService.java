package hrs.client.Service.HotelService;

import java.util.Date;

import hrs.common.util.type.RoomType;

public interface AvailableRoomService {
	boolean hasAvailableRoom(int hotelID,RoomType type,Date begin,Date end);
}
