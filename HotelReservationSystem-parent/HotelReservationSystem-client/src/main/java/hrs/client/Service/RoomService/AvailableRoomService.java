package hrs.client.Service.RoomService;


import java.util.Date;

import hrs.common.util.type.RoomType;

public interface AvailableRoomService {
	int findAvailableRoomNum(int hotelID,RoomType type,Date begin,Date end);
}
