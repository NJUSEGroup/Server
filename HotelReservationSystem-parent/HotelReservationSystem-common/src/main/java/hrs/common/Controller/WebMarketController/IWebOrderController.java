package hrs.common.Controller.WebMarketController;

import java.util.List;

import hrs.common.VO.OrderVO;
import hrs.common.util.type.OrderStatus;
import hrs.common.util.type.RestoreValueType;

public interface IWebOrderController {
	List<OrderVO> findOrderByOrderStatus(OrderStatus status);
	OrderVO findOrderByID(int id);
	void revokeOrder(OrderVO ordervo,RestoreValueType type);
	List<OrderVO> findOrderByUsername(String username);
}
