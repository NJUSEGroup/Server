package hrs.server.DAO.Interface;

import java.util.Date;
import java.util.List;

import hrs.common.util.ResultMessage;
import hrs.common.util.type.OrderStatus;
import hrs.server.POJO.OrderPO;

public interface OrderDAO {
	 OrderPO findByID(int ID);
	 List<OrderPO> findByUsernameAndType(String username,OrderStatus status);
	 List<OrderPO> findByHotelAndUsername(int hotelID,String username);
	 List<OrderPO> findByUsername(String username);
	 List<OrderPO> findByOrderType(OrderStatus status);
	 List<OrderPO> findByHotelAndTime(int hotelID,Date begin,Date end);
	 ResultMessage add(OrderPO orderpo);
	 ResultMessage update(OrderPO orderpo);
}
