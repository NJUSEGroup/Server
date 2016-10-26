package hrs.common.Controller.HotelController;

import hrs.common.VO.HotelVO;
import hrs.common.util.ResultMessage;

public interface IHotelController {
	HotelVO findHotelByID(int hotelID);
	ResultMessage updateHotel(HotelVO hotelvo);
}
