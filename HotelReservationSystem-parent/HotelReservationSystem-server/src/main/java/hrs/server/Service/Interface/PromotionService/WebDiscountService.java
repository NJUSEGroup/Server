package hrs.server.Service.Interface.PromotionService;

import java.util.List;

import hrs.common.VO.WebDiscountVO;
import hrs.common.util.ResultMessage;
import hrs.server.Service.Impl.PromotionService.WebDiscountService.WebDiscount;

public interface WebDiscountService {
	List<WebDiscountVO> findAll();
	void add (WebDiscountVO webdiscountvo);
	void update(WebDiscountVO webdiscountvo);
	void delete(int id);
	List<WebDiscount> createAllStrategies();
}
