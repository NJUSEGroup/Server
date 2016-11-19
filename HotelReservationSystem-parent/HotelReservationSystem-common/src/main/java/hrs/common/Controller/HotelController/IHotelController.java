package hrs.common.Controller.HotelController;

import hrs.common.Exception.HotelService.HotelNotFoundException;
import hrs.common.VO.HotelVO;

public interface IHotelController {
	HotelVO findHotelByID(int hotelID) throws HotelNotFoundException;
	void updateHotel(HotelVO hotelvo);
}
