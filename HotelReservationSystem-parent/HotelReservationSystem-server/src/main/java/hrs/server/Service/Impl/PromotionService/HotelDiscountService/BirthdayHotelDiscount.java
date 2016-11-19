package hrs.server.Service.Impl.PromotionService.HotelDiscountService;

import hrs.common.VO.OrderVO;
import hrs.server.util.DateHelper;
/**
 * 生日折扣
 * @author NewSong
 *
 */
public class BirthdayHotelDiscount extends HotelDiscount {
	

	@Override
	public OrderVO discount(OrderVO order) {
		if(DateHelper.formatWithMD(order.placeTime).equals(DateHelper.formatWithMD(order.user.birthDate))){
			order.hotelDiscounts.put(hotelDiscount, order.value*(1-hotelDiscount.discount));
		}
		return order;
	}
	
}
