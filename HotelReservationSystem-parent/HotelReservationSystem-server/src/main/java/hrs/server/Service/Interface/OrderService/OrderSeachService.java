package hrs.server.Service.Interface.OrderService;

import java.util.Date;
import java.util.List;

import hrs.common.VO.OrderVO;
import hrs.common.util.type.OrderStatus;

public interface OrderSeachService {
	OrderVO findByID(int id);

	List<OrderVO> findByHotelAndType(int hotelID, OrderStatus type);

	List<OrderVO> findByUsernameAndType(String username, OrderStatus type);

	List<OrderVO> findByUsername(String username);

	List<OrderVO> findByHotelAndUsername(int hotelID, String username);

	List<OrderVO> findByOrderType(OrderStatus status);

	List<OrderVO> findByHotelAndTime(int hotelID, Date begin, Date end);
}
