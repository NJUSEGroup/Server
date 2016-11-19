package hrs.server.Controller.UserController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import hrs.common.Controller.UserController.IUserOrderController;
import hrs.common.Exception.OrderService.OrderNotFoundException;
import hrs.common.VO.OrderVO;
import hrs.common.VO.UserVO;
import hrs.common.util.type.OrderStatus;
import hrs.server.Service.Interface.CreditRecordService.CreditRecordService;
import hrs.server.Service.Interface.OrderService.OrderSearchService;
import hrs.server.Service.Interface.OrderService.OrderService;
import hrs.server.Service.Interface.UserService.UserService;
@Controller
public class UserOrderController implements IUserOrderController {
	@Autowired
	private UserService userService;
	@Autowired
	private OrderService orderService;
	@Autowired
	private OrderSearchService orderSearchService;
	@Autowired
	private CreditRecordService creditRecordService;
	
	
	@Override
	public List<OrderVO> findOrdersByUsernameAndStatus(String username, OrderStatus type) throws OrderNotFoundException {
		return orderSearchService.findByUsernameAndStatus(username, type);
	}

	@Override
	public boolean validateCredit(String username) {
		return userService.validateCredit(username);
	}

	@Override
	public OrderVO placeOrder(OrderVO ordervo) {
		return orderService.placeOrder(ordervo);
	}

	@Override
	public void addOrder(OrderVO ordervo) {
		orderService.add(ordervo);
	}

	@Override
	public void remark(OrderVO ordervo,int score,String evaluation) {
		orderService.remark(ordervo, score, evaluation);
	}

	@Override
	public void revoke(OrderVO ordervo) {
		orderService.revokeByUser(ordervo);
	}

	@Override
	public void recharge(UserVO user, int money) {
		creditRecordService.recharge(user, money);
	}
}