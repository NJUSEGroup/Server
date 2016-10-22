package hrs.client.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import hrs.client.Service.CreditRecordService;
import hrs.client.Service.OrderService;
import hrs.client.Service.PromotionService.WebDiscountService;

@Controller
public class WebMarketController {
	@Autowired
	private OrderService orderService;
	@Autowired
	private UserController userController;
	@Autowired
	private CreditRecordService creditRecordService;
	@Autowired
	private WebDiscountService webDiscountService;
	public WebMarketController() {
		// TODO Auto-generated constructor stub
	}
}
