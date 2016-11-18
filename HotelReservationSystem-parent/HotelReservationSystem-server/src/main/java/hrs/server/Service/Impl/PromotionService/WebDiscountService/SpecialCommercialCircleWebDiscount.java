package hrs.server.Service.Impl.PromotionService.WebDiscountService;

import hrs.common.VO.OrderVO;

public class SpecialCommercialCircleWebDiscount extends WebDiscount {

	@Override
	public OrderVO discount(OrderVO order) {
		if (order.hotel.commercialCircle.equals(webDiscount.commercialCircle)) {
			order.webDiscounts.put(webDiscount, order.value * (1-webDiscount.discount));
		}
		return order;
	}

}
