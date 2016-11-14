package hrs.server.DAO.Interface;

import hrs.common.POJO.StaffPO;
import hrs.common.util.ResultMessage;

public interface StaffDAO {
	 ResultMessage update(StaffPO staffpo);
	 ResultMessage add(StaffPO staffpo);
	 StaffPO findByUsername(String username);
	 StaffPO findByHotelName(String hotelName);
}
