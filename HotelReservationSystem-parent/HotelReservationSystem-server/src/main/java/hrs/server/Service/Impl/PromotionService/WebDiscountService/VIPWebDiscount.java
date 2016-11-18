package hrs.server.Service.Impl.PromotionService.WebDiscountService;

import hrs.common.VO.OrderVO;

public class VIPWebDiscount extends WebDiscount{

	@Override
	public OrderVO discount(OrderVO order) {
		if(order.user.VIPLevel == webDiscount.VIPlevel){
			order.webDiscounts.put(webDiscount, order.value*(1-webDiscount.discount));
		}
		return order;
	}
}
