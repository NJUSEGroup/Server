package hrs.server.Service.Impl.PromotionService.HotelDiscountService;

import hrs.common.VO.OrderVO;
import hrs.server.util.DateFormatter;

public class BirthdayHotelDiscount extends HotelDiscount {
	

	@Override
	public OrderVO discount(OrderVO order) {
		if(DateFormatter.format(order.placeTime).equals(DateFormatter.format(order.user.birthDate))){
			order.hotelDiscounts.put(hotelDiscount, order.roomNum*order.value*hotelDiscount.discount);
		}
		return order;
	}
	
}
