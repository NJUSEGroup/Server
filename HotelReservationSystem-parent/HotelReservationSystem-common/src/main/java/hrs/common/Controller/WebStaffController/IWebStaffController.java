package hrs.common.Controller.WebStaffController;

import java.util.List;

import hrs.common.VO.HotelVO;
import hrs.common.VO.StaffVO;

public interface IWebStaffController {
	void addHotel(HotelVO hotelvo);
	void updateStaff(StaffVO staffvo);
	void addStaff(StaffVO staffvo);
	StaffVO findStaffByUsername(String username);
	List<StaffVO> findStaffByHotelName(String hotelName);
}
