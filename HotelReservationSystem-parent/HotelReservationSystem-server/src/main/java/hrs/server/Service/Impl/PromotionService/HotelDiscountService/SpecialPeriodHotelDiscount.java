package hrs.server.Service.Impl.PromotionService.HotelDiscountService;

import hrs.common.VO.OrderVO;

public class SpecialPeriodHotelDiscount extends HotelDiscount {

	@Override
	public OrderVO discount(OrderVO order) {
		if(hotelDiscount.beginTime.after(order.placeTime) && hotelDiscount.endTime.before(order.placeTime)){
			order.hotelDiscounts.put(hotelDiscount, hotelDiscount.discount*order.value*order.roomNum);
		}
		return order;
	}

}
