package hrs.server.Service.Impl.PromotionService.HotelDiscountService;

import hrs.common.VO.OrderVO;

public class SpecialPeriodHotelDiscount extends HotelDiscount {

	@Override
	public OrderVO discount(OrderVO order) {
		System.out.println(order.placeTime);
		System.out.println(hotelDiscount.beginTime);
		System.out.println(hotelDiscount.endTime);
		if(hotelDiscount.beginTime.before(order.placeTime) && hotelDiscount.endTime.after(order.placeTime)){
			order.hotelDiscounts.put(hotelDiscount, (1-hotelDiscount.discount)*order.value);
		}
		return order;
	}
}
