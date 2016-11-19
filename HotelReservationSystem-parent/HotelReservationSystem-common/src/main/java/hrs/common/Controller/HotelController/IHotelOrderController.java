package hrs.common.Controller.HotelController;

import java.util.List;

import hrs.common.VO.OrderVO;
import hrs.common.util.type.OrderStatus;

public interface IHotelOrderController {
	
	void checkin(OrderVO ordervo);
	void checkout(OrderVO ordervo);
	void delayCheckin(OrderVO ordervo);
	List<OrderVO> findOrderByHotelAndStatus(int hotelID, OrderStatus type);//根据类型查
	List<OrderVO> findOrderByHotelAndUsername(int hotelID,String username);//根据用户名和酒店查
	OrderVO findOrderByID(int id);
	
}
