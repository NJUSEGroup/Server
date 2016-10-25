package hrs.server.Service.Impl.PromotionService.HotelDiscountService;

import hrs.common.VO.OrderVO;

public class EnterpriseHotelDiscount extends HotelDiscount{
	
	

	@Override
	public OrderVO discount(OrderVO order) {
		if(order.user.enterprise.equals(hotelDiscount.enterprise)){
			order.hotelDiscounts.put(hotelDiscount, hotelDiscount.discount*order.value*order.roomNum);
		}
		return order;
	}

}
