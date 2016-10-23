package hrs.common.Service.PromotionService;

import hrs.common.VO.HotelDiscountVO;
import hrs.common.VO.OrderVO;

public abstract class HotelDiscount {
	protected HotelDiscountVO hotelDiscount;
	
	public void setHotelDiscount(HotelDiscountVO hotelDiscount) {
		this.hotelDiscount = hotelDiscount;
	}

	public abstract OrderVO discount(OrderVO order);
}
