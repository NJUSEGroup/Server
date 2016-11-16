package hrs.server.Service.Impl.PromotionService.HotelDiscountService;

import hrs.common.VO.OrderVO;
import hrs.server.util.DateFormatter;
/**
 * 生日折扣
 * @author NewSong
 *
 */
public class BirthdayHotelDiscount extends HotelDiscount {
	

	@Override
	public OrderVO discount(OrderVO order) {
		if(DateFormatter.format(order.placeTime).equals(DateFormatter.format(order.user.birthDate))){
			order.hotelDiscounts.put(hotelDiscount, order.roomNum*order.value*hotelDiscount.discount);
		}
		return order;
	}
	
}
