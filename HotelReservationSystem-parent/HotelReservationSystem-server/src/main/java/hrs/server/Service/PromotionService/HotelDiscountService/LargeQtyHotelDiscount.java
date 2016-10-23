package hrs.server.Service.PromotionService.HotelDiscountService;

import hrs.common.Service.PromotionService.HotelDiscount;
import hrs.common.VO.OrderVO;

public class LargeQtyHotelDiscount extends HotelDiscount {

	

	@Override
	public OrderVO discount(OrderVO order) {
		if(order.roomNum >= hotelDiscount.minQty){
			order.hotelDiscounts.put(hotelDiscount, (1-hotelDiscount.discount)*order.value*order.roomNum);
		}
		return order;
	}

}
