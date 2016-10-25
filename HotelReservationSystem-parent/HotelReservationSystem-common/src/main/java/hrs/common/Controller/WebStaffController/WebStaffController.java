package hrs.common.Controller.WebStaffController;

import hrs.common.VO.HotelVO;
import hrs.common.VO.StaffVO;
import hrs.common.util.ResultMessage;

public interface WebStaffController {
	ResultMessage addHotel(HotelVO hotelvo);
	ResultMessage updateStaff(StaffVO staffvo);
	ResultMessage addStaff(StaffVO staffvo);
	StaffVO findStaffByUsername(String username);
	StaffVO findStaffByHotelName(String hotelName);
}
