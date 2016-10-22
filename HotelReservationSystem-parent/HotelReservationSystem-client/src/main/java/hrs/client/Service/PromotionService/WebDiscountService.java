package hrs.client.Service.PromotionService;

import java.util.List;

import hrs.client.VO.WebDiscountVO;
import hrs.common.util.ResultMessage;

public interface WebDiscountService {
	List<WebDiscountVO> findAll();
	ResultMessage add (WebDiscountVO webdiscountvo);
	ResultMessage update(WebDiscountVO webdiscountvo);
	ResultMessage delete(int id);
}
