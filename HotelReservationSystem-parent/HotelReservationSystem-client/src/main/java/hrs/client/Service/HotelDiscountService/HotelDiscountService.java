package hrs.client.Service.HotelDiscountService;

import java.util.List;

import hrs.client.VO.HotelDiscountVO;
import hrs.common.util.ResultMessage;

public interface HotelDiscountService {
	ResultMessage add(HotelDiscountVO hoteldiscountvo);
	ResultMessage update(HotelDiscountVO hoteldiscountvo);
	ResultMessage delete(int id);
	List<HotelDiscountVO> findAllByHotelID(int hotelID);
	
}
