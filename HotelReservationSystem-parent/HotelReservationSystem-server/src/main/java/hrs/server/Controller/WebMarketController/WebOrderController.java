package hrs.server.Controller.WebMarketController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import hrs.common.Controller.WebMarketController.IWebOrderController;
import hrs.common.VO.OrderVO;
import hrs.common.util.type.OrderStatus;
import hrs.common.util.type.RestoreValueType;
import hrs.server.Service.Interface.OrderService.OrderSearchService;
import hrs.server.Service.Interface.OrderService.OrderService;
@Controller
public class WebOrderController implements IWebOrderController{
	@Autowired
	private OrderService orderService;
	@Autowired
	private OrderSearchService orderSearchService;
	
	@Override
	public List<OrderVO> findOrderByOrderStatus(OrderStatus status) {
		return orderSearchService.findByOrderStatus(status);
	}

	@Override
	public OrderVO findOrderByID(int id) {
		return orderSearchService.findByID(id);
	}

	@Override
	public void revokeOrder(OrderVO ordervo,RestoreValueType type) {
		orderService.revokeByWebMarketer(ordervo, type);
	}

	@Override
	public List<OrderVO> findOrderByUsername(String username) {
		return orderSearchService.findByUsername(username);
	}
}
