package hrs.server.Service.Impl.PromotionService.HotelDiscountService;

import hrs.common.VO.OrderVO;

public class EnterpriseHotelDiscount extends HotelDiscount{
	
	
	@Override
	public OrderVO discount(OrderVO order) {
		if(order.user.enterprise.equals(hotelDiscount.enterprise.name)){
			order.hotelDiscounts.put(hotelDiscount, (1-hotelDiscount.discount)*order.value);
		}
		return order;
	}

}
