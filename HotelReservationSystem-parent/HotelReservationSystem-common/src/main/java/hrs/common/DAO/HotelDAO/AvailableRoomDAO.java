package hrs.common.DAO.HotelDAO;

import java.util.Date;

import hrs.common.util.type.RoomType;

public interface AvailableRoomDAO {
	 int findAvailableRoom(int hotelID,RoomType type,Date date);
}	
