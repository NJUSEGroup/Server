package hrs.common.Controller.HotelController;

import java.util.List;

import hrs.common.VO.OrderVO;
import hrs.common.util.ResultMessage;
import hrs.common.util.type.OrderStatus;

public interface IHotelOrderController {
	
	/**
	 * 与订单有关的
	 * @param ordervo
	 * @return
	 */
	ResultMessage checkin(OrderVO ordervo);
	ResultMessage checkout(OrderVO ordervo);
	ResultMessage revoke(OrderVO ordervo);
	ResultMessage delayCheckin(OrderVO ordervo);
	List<OrderVO> findOrderByHotelAndType(int hotelID, OrderStatus type);//根据类型查
	List<OrderVO> findOrderByHotelAndUsername(int hotelID,String username);//根据用户名和酒店查
	OrderVO findOrderByID(int id);
	
}
