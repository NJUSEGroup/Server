package hrs.client.Controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import hrs.client.Service.OrderService;
import hrs.client.Service.UserService;
import hrs.client.VO.OrderVO;
import hrs.client.VO.UserVO;

@Controller
public class OrderController {
	@Autowired
	private OrderService orderService;
	@Autowired
	private UserService userService;
	
	public Map.Entry<UserVO,OrderVO> findByOrderIDRetEntry(int orderID){
		Map<UserVO,OrderVO> map = new HashMap<>();
		OrderVO order = orderService.findByID(orderID);
		UserVO user = userService.findByUsername(order.username);
		map.put(user, order);
		for(Map.Entry<UserVO, OrderVO> entry:map.entrySet()){
			return entry;
		}
		return null;
	}
	
	
}
