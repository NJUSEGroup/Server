package hrs.server.Controller.WebStaffController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import hrs.common.Controller.WebStaffController.IWebStaffController;
import hrs.common.VO.HotelVO;
import hrs.common.VO.StaffVO;
import hrs.server.Service.Interface.HotelService.HotelService;
import hrs.server.Service.Interface.StaffService.StaffService;
@Controller
public class WebStaffController implements IWebStaffController{
	@Autowired
	private StaffService staffService;
	@Autowired
	private HotelService hotelService;
	
	
	@Override
	public void addHotel(HotelVO hotelvo) {
		hotelService.add(hotelvo);
	}

	@Override
	public void updateStaff(StaffVO staffvo) {
		staffService.update(staffvo);
	}

	@Override
	public void addStaff(StaffVO staffvo) {
		staffService.add(staffvo);
	}

	@Override
	public StaffVO findStaffByUsername(String username) {
		return staffService.findByUsername(username);
	}

	@Override
	public List<StaffVO> findStaffByHotelName(String hotelName) {
		return staffService.findByHotelName(hotelName);
	}
	
}
