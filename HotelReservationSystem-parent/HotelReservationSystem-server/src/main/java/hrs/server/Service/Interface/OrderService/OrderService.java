package hrs.server.Service.Interface.OrderService;

import java.util.Date;
import java.util.List;

import hrs.common.VO.OrderVO;
import hrs.common.util.ResultMessage;
import hrs.common.util.type.OrderStatus;

public interface OrderService {
	OrderVO findByID(int id);

	List<OrderVO> findByHotelAndType(int hotelID, OrderStatus type);

	List<OrderVO> findByUsernameAndType(String username, OrderStatus type);

	List<OrderVO> findByUsername(String username);

	List<OrderVO> findByHotelAndUsername(int hotelID, String username);

	List<OrderVO> findByOrderType(OrderStatus status);

	List<OrderVO> findByHotelAndTime(int hotelID, Date begin, Date end);

	OrderVO placeOrder(OrderVO ordervo);

	ResultMessage add(OrderVO ordervo);

	ResultMessage checkin(OrderVO ordervo);

	ResultMessage checkout(OrderVO ordervo);

	ResultMessage revoke(OrderVO ordervo);

	ResultMessage remark(OrderVO ordervo);

	ResultMessage delayCheckin(OrderVO ordervo);
}
