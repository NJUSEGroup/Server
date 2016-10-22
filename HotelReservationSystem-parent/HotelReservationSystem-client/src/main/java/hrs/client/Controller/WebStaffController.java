package hrs.client.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import hrs.client.Service.StaffService;
import hrs.client.Service.UserService;
import hrs.client.Service.HotelService.HotelService;

@Controller
public class WebStaffController {
	@Autowired
	private HotelService hotelService;
	@Autowired
	private StaffService staffService;
	@Autowired
	private UserService userService;
	public WebStaffController() {
		// TODO Auto-generated constructor stub
	}
}
