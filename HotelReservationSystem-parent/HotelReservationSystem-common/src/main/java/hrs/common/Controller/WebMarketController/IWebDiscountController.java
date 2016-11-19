package hrs.common.Controller.WebMarketController;

import java.util.List;

import hrs.common.Exception.Promotion.WebDiscountService.WebDiscountNotFoundException;
import hrs.common.VO.WebDiscountVO;

public interface IWebDiscountController {
	List<WebDiscountVO> findAll() throws WebDiscountNotFoundException;
	void add (WebDiscountVO webdiscountvo);
	void update(WebDiscountVO webdiscountvo);
	void delete(int id);
}
