package hrs.client.Service;

import java.util.Date;
import java.util.List;

import hrs.client.VO.OrderVO;
import hrs.common.util.ResultMessage;
import hrs.common.util.type.OrderStatus;

public interface OrderService {
	OrderVO findByID(int id);
	List<OrderVO> findByUsernameAndType(String username, OrderStatus type);
	List<OrderVO> findByUsername(String username);
	List<OrderVO> findByHotelAndUsername(int hotelID,String username);
	List<OrderVO> findByOrderType(OrderStatus status);
	List<OrderVO> findByHotelAndTime(int hotelID,Date begin,Date end);
	OrderVO placeOrder(OrderVO ordervo);
	ResultMessage add(OrderVO ordervo);
	ResultMessage update(OrderVO ordervo);
}
