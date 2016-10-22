package hrs.server.DAO.Interface.HotelDAO;

import java.util.List;

import hrs.common.util.ResultMessage;
import hrs.server.POJO.HotelPO;

public interface HotelDAO {
	 HotelPO findByID(int hotelID);
	 ResultMessage update(HotelPO hotelpo);
	 ResultMessage add(HotelPO hotelpo);
	 List<HotelPO> find (int loc,int circle);
}
