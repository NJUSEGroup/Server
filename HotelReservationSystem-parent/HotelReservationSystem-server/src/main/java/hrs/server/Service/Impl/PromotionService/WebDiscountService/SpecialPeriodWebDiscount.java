package hrs.server.Service.Impl.PromotionService.WebDiscountService;

import hrs.common.VO.OrderVO;

public class SpecialPeriodWebDiscount extends WebDiscount{

	@Override
	public OrderVO discount(OrderVO order) {
		if(webDiscount.beginTime.before(order.placeTime) && webDiscount.endTime.after(order.placeTime)){
			order.webDiscounts.put(webDiscount, order.value*(1-webDiscount.discount));
		}
		return order;
	}
}
