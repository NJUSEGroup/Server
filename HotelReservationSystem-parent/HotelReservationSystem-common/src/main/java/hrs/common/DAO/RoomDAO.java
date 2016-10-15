package hrs.common.DAO;

import java.util.List;

import hrs.common.PO.RoomPO;
import hrs.common.util.ResultMessage;
import hrs.common.util.type.RoomType;

public interface RoomDAO {
	 RoomPO findByHotelAndType(int hotelID,RoomType type);
	 ResultMessage update(RoomPO roompo);
	 ResultMessage add(RoomPO roompo);
	 List<RoomPO> findByHotelID(int hotelID);
}
