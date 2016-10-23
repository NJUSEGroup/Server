package hrs.server.Service.OrderService;

import java.util.Date;
import java.util.List;

import hrs.common.Service.OrderService.OrderService;
import hrs.common.Service.PromotionService.HotelDiscount;
import hrs.common.Service.PromotionService.HotelDiscountService;
import hrs.common.Service.PromotionService.WebDiscountService;
import hrs.common.Service.UserService.UserService;
import hrs.common.VO.HotelDiscountVO;
import hrs.common.VO.OrderVO;
import hrs.common.VO.UserVO;
import hrs.common.util.ResultMessage;
import hrs.common.util.type.OrderStatus;

public class OrderServiceImpl implements OrderService {
	private HotelDiscountService hotelDiscountService;
	private WebDiscountService webDiscountService;
	
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
	public OrderVO placeOrder(OrderVO order) {
		// 读取优惠策略，并对订单进行处理
		// hotelDiscountService.findAllByHotelID(ordervo.getHotelID());
		// webDiscountService.findAll();
		// 读取用户的信息：生日、所在企业、原始信用值
		// 合并后进行优惠
		// 每种优惠策略都设置优惠值
		if(order.user.credit < 0){
			return null;
		}
		List<HotelDiscount> strategies = hotelDiscountService.createAllStrategies(order.hotel.id);
		for(HotelDiscount strategy:strategies){
			strategy.discount(order);
		}
		double min = Double.MAX_VALUE;
		double value = 0;
		for(HotelDiscountVO vo:order.hotelDiscounts.keySet()){
			value = order.hotelDiscounts.get(vo);
			if(value < min){
				min =  value;
			}
		}
		order.value = min;
		return order;
	}
	
	
	@Override
	public ResultMessage add(OrderVO ordervo) {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public ResultMessage checkin(OrderVO ordervo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage checkout(OrderVO ordervo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage revoke(OrderVO ordervo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage remark(OrderVO ordervo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage delayCheckin(OrderVO ordervo) {
		// TODO Auto-generated method stub
		return null;
	}

}
