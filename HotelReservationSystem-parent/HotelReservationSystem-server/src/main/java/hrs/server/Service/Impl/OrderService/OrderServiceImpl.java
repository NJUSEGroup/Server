package hrs.server.Service.Impl.OrderService;

import java.util.Date;
import java.util.List;

import hrs.common.VO.OrderVO;
import hrs.common.util.ResultMessage;
import hrs.common.util.type.OrderStatus;
import hrs.server.Service.Interface.OrderService.OrderService;

public class OrderServiceImpl implements OrderService {

	@Override
	public OrderVO findByID(int id) {
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

	@Override
	public OrderVO placeOrder(OrderVO ordervo) {
		// 读取优惠策略，并对订单进行处理
		// hotelDiscountService.findAllByHotelID(ordervo.getHotelID());
		// webDiscountService.findAll();
		// 读取用户的信息：生日、所在企业、原始信用值
		// 合并后进行优惠
		// 每种优惠策略都设置优惠值
		
		return null;
	}

	@Override
	public ResultMessage add(OrderVO ordervo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage update(OrderVO ordervo) {
		// TODO Auto-generated method stub
		return null;
	}

}
