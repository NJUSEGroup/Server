package hrs.common.DAO.HotelDAO;

import java.util.List;

import hrs.common.PO.HotelPO;
import hrs.common.util.ResultMessage;

public interface HotelDAO {
	 HotelPO findByID(int hotelID);
	 ResultMessage update(HotelPO hotelpo);
	 ResultMessage add(HotelPO hotelpo);
	 List<HotelPO> find (int loc,int circle);
}
