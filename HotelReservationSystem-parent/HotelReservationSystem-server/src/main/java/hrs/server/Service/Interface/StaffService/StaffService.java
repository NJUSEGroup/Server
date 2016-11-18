package hrs.server.Service.Interface.StaffService;

import hrs.common.VO.StaffVO;
import hrs.common.util.ResultMessage;

public interface StaffService {
	StaffVO login(String username, String password);
	void update(StaffVO staffvo);
	void add(StaffVO staffvo);
	StaffVO findByUsername(String username);
	StaffVO findByHotelName(String hotelName);
	
}
