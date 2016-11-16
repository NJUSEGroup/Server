package hrs.server.Service.Impl.OrderService;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import hrs.common.POJO.OrderPO;
import hrs.common.VO.CreditRecordVO;
import hrs.common.VO.HotelDiscountVO;
import hrs.common.VO.OrderVO;
import hrs.common.util.ResultMessage;
import hrs.common.util.type.CreditRecordType;
import hrs.common.util.type.OrderStatus;
import hrs.server.DAO.Interface.OrderDAO;
import hrs.server.Service.Impl.PromotionService.HotelDiscountService.HotelDiscount;
import hrs.server.Service.Interface.CreditRecordService.CreditRecordService;
import hrs.server.Service.Interface.OrderService.OrderService;
import hrs.server.Service.Interface.PromotionService.HotelDiscountService;
import hrs.server.Service.Interface.PromotionService.WebDiscountService;
@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	private OrderDAO dao;
	@Autowired
	private HotelDiscountService hotelDiscountService;
	@Autowired
	private WebDiscountService webDiscountService;
	@Autowired
	private CreditRecordService creditRecordService;

	
	@Transactional
	@Override
	public OrderVO placeOrder(OrderVO order) {
		// 读取优惠策略，并对订单进行处理
		// hotelDiscountService.findAllByHotelID(ordervo.getHotelID());
		// webDiscountService.findAll();
		// 读取用户的信息：生日、所在企业、原始信用值
		// 合并后进行优惠
		// 每种优惠策略都设置优惠值
		List<HotelDiscount> strategies = hotelDiscountService.createAllStrategies(order.hotel.id);
		for (HotelDiscount strategy : strategies) {
			strategy.discount(order);//这里传入对象是为了保持一致，因为不同策略需要不同的数据
		}
		for (HotelDiscountVO vo : order.hotelDiscounts.keySet()) {
			order.value -= order.hotelDiscounts.get(vo);
		}
		return order;
	}

	@Transactional
	@Override
	public ResultMessage add(OrderVO ordervo) {
		return dao.add(new OrderPO(ordervo));
	}
	/**
	 * 
	 * @Title: checkin 
	 * @Description:入住，更新信用记录
	 * @param ordervo
	 * @return ResultMessage
	 * @see hrs.server.Service.Interface.OrderService.OrderService#checkin(hrs.common.VO.OrderVO)
	 */
	@Transactional
	@Override
	public ResultMessage checkin(OrderVO ordervo) {
		ordervo.checkinTime = new Date();
		ordervo.status = OrderStatus.Executed;
		creditRecordService.add(new CreditRecordVO(ordervo, ordervo.user, CreditRecordType.Execute, (int)ordervo.value));
		return dao.update(new OrderPO(ordervo));
	}

	
	@Transactional
	@Override
	public ResultMessage checkout(OrderVO ordervo) {
		ordervo.checkoutTime = new Date();
		return dao.update(new OrderPO(ordervo));
	}

	@Transactional
	@Override
	public ResultMessage revoke(OrderVO ordervo) {
		ordervo.revokeTime = new Date();
		creditRecordService.add(creditrecordvo);
		
		return null;
	}
	
	/**
	 * 
	 * @Title: remark 
	 * @Description:前置条件是评价和评分已经set进入order
	 * @param ordervo
	 * @return 
	 * @see hrs.server.Service.Interface.OrderService.OrderService#remark(hrs.common.VO.OrderVO)
	 */
	@Transactional
	@Override
	public ResultMessage remark(OrderVO ordervo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	@Override
	public ResultMessage delayCheckin(OrderVO ordervo) {
		// TODO Auto-generated method stub
		return null;
	}

}
