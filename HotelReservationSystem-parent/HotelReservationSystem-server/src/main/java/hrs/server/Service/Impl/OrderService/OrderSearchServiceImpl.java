package hrs.server.Service.Impl.OrderService;

import java.util.Date;
import java.util.List;

import hrs.common.VO.OrderVO;
import hrs.common.util.type.OrderStatus;
import hrs.server.Service.Interface.OrderService.OrderSearchService;

public class OrderSearchServiceImpl implements OrderSearchService{

	@Override
	public OrderVO findByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderVO> findByHotelAndType(int hotelID, OrderStatus type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderVO> findByUsernameAndType(String username, OrderStatus type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderVO> findByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderVO> findByHotelAndUsername(int hotelID, String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderVO> findByOrderType(OrderStatus status) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderVO> findByHotelAndTime(int hotelID, Date begin, Date end) {
		// TODO Auto-generated method stub
		return null;
	}

}
