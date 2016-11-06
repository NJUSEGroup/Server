package hrs.server.DAO.Interface;

import java.util.Date;
import java.util.List;

import hrs.common.util.ResultMessage;
import hrs.common.util.type.RoomType;
import hrs.server.POJO.RoomPO;

public interface RoomDAO {
	 ResultMessage update(RoomPO roompo);
	 ResultMessage add(RoomPO roompo);
	 List<RoomPO> findByHotelID(int hotelID);
	 int findAvailableRoom(int hotelID,RoomType type,Date date);
}
