package hrs.server.Service.Impl.PromotionService.WebDiscountService;

import hrs.common.VO.OrderVO;
import hrs.common.VO.WebDiscountVO;

public abstract class WebDiscount {
protected WebDiscountVO webDiscount;
	
	public void setWebDiscountVO(WebDiscountVO webDiscount) {
		this.webDiscount = webDiscount;
	}
	public abstract OrderVO discount(OrderVO order);
}
