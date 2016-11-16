package hrs.server.Service.Impl.PromotionService.HotelDiscountService;

import hrs.common.VO.HotelDiscountVO;
import hrs.common.VO.OrderVO;
/**
 * 所有酒店折扣的共同基类
 * @author NewSong
 *
 */
public abstract class HotelDiscount {
	protected HotelDiscountVO hotelDiscount;
	
	public void setHotelDiscount(HotelDiscountVO hotelDiscount) {
		this.hotelDiscount = hotelDiscount;
	}
	
	public abstract OrderVO discount(OrderVO order);
}
