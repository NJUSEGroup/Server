package hrs.common.Service.PromotionService;

import java.util.List;

import hrs.common.VO.HotelDiscountVO;
import hrs.common.util.ResultMessage;
import hrs.common.util.type.HotelDiscountType;

public interface HotelDiscountService {
	ResultMessage add(HotelDiscountVO hoteldiscountvo);
	ResultMessage update(HotelDiscountVO hoteldiscountvo);
	ResultMessage delete(int id);
	List<HotelDiscountVO> findAllByHotelID(int hotelID);
	List<HotelDiscountType> findNotAddedType(int hotelID);
	List<HotelDiscount> createAllStrategies(int hotelID);
}
