package hrs.server.Service.Interface.PromotionService;

import java.util.List;

import hrs.common.VO.WebDiscountVO;
import hrs.common.util.ResultMessage;
import hrs.server.Service.Impl.PromotionService.WebDiscountService.WebDiscount;

public interface WebDiscountService {
	List<WebDiscountVO> findAll();
	ResultMessage add (WebDiscountVO webdiscountvo);
	ResultMessage update(WebDiscountVO webdiscountvo);
	ResultMessage delete(int id);
	List<WebDiscount> createAllStrategies();
}
