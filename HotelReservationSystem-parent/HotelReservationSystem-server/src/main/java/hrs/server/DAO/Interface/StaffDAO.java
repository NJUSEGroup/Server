package hrs.server.DAO.Interface;

import hrs.common.util.ResultMessage;
import hrs.server.POJO.StaffPO;

public interface StaffDAO {
	 ResultMessage update(StaffPO staffpo);
	 ResultMessage add(StaffPO staffpo);
	 StaffPO findByUsername(String username);
	 StaffPO findByHotelName(String hotelName);
}
