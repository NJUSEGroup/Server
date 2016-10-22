package hrs.client.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import hrs.client.Service.CreditRecordService;
import hrs.client.Service.OrderService;
import hrs.client.Service.UserService;
import hrs.client.VO.CreditRecordVO;
import hrs.client.VO.OrderVO;
import hrs.client.VO.UserVO;
import hrs.common.util.ResultMessage;
import hrs.common.util.type.OrderStatus;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	@Autowired
	private OrderService orderService;
	@Autowired
	private CreditRecordService creditRecordService;
	
	
	public UserVO findUserByUsername(String username){
		return userService.findByUsername(username);
	}
	public ResultMessage register(UserVO uservo){
		return userService.register(uservo);
	}
	public ResultMessage updateUser(UserVO uservo){
		return userService.update(uservo);
	}
	public List<OrderVO> findByUsernameAndType(String username, OrderStatus type){
		return orderService.findByUsernameAndType(username, type);
	}
	public ResultMessage updateOrder(OrderVO ordervo){
		return orderService.update(ordervo);
	}
	public OrderVO placeOrder(OrderVO ordervo){
		return orderService.placeOrder(ordervo);
	}
	public ResultMessage addOrder(OrderVO ordervo){
		return orderService.add(ordervo);
	}
	public List<CreditRecordVO> findCreditRecordByUsername(String username){
		return creditRecordService.findByUsername(username);
	}
}
