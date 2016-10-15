package hrs.common.DAO.HotelDAO;

import java.util.Date;
import java.util.List;
import java.util.Map;

import hrs.common.PO.HotelPO;
import hrs.common.PO.RoomPO;
import hrs.common.util.ResultMessage;

interface HotelDAO {
	 HotelPO findByID(int hotelID);
	 ResultMessage update(HotelPO hotelpo);
	 ResultMessage add(HotelPO hotelpo);
	 List<Map<HotelPO,List<RoomPO>>> find (String loc,String circle,Date begin,Date end);
}
