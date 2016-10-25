package hrs.common.Controller.WebMarketController;

import java.util.List;

import hrs.common.VO.WebDiscountVO;
import hrs.common.util.ResultMessage;

public interface WebDiscountController {
	List<WebDiscountVO> findAll();
	ResultMessage add (WebDiscountVO webdiscountvo);
	ResultMessage update(WebDiscountVO webdiscountvo);
	ResultMessage delete(int id);
}
