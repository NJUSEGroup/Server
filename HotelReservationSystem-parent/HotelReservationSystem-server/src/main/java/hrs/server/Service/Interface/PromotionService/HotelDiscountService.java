package hrs.server.Service.Interface.PromotionService;

import java.util.List;

import hrs.common.VO.HotelDiscountVO;
import hrs.common.util.ResultMessage;
import hrs.server.Service.Impl.PromotionService.HotelDiscountService.HotelDiscount;

public interface HotelDiscountService {
	void add(HotelDiscountVO hoteldiscountvo);
	void update(HotelDiscountVO hoteldiscountvo);
	void delete(int id);
	List<HotelDiscountVO> findAllByHotelID(int hotelID);
	List<HotelDiscount> createAllStrategies(int hotelID);
}
