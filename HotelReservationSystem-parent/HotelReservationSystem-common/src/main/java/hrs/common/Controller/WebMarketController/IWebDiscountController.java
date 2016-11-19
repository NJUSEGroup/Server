package hrs.common.Controller.WebMarketController;

import java.util.List;

import hrs.common.VO.WebDiscountVO;
import hrs.common.util.ResultMessage;

public interface IWebDiscountController {
	List<WebDiscountVO> findAll();
	void add (WebDiscountVO webdiscountvo);
	void update(WebDiscountVO webdiscountvo);
	void delete(int id);
}
