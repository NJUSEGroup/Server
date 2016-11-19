package hrs.server.Controller.HotelController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import hrs.common.Controller.HotelController.IHotelController;
import hrs.common.Exception.HotelService.HotelNotFoundException;
import hrs.common.VO.HotelVO;
import hrs.server.Service.Interface.HotelService.HotelService;
@Controller
public class HotelController implements IHotelController{
	@Autowired
	private HotelService hotelService;
	
	@Override
	public HotelVO findHotelByID(int hotelID) throws HotelNotFoundException {
		return hotelService.findByID(hotelID);
	}

	@Override
	public void updateHotel(HotelVO hotelvo) {
		hotelService.update(hotelvo);
	}
}
