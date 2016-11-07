package hrs.server.Service.Impl.OrderService;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import hrs.common.VO.HotelDiscountVO;
import hrs.common.VO.OrderVO;
import hrs.common.util.ResultMessage;
import hrs.server.DAO.Interface.OrderDAO;
import hrs.server.Service.Impl.PromotionService.HotelDiscountService.HotelDiscount;
import hrs.server.Service.Interface.CreditRecordService.CreditRecordService;
import hrs.server.Service.Interface.OrderService.OrderService;
import hrs.server.Service.Interface.PromotionService.HotelDiscountService;
import hrs.server.Service.Interface.PromotionService.WebDiscountService;

public class OrderServiceImpl implements OrderService {
	private OrderDAO dao;
	private HotelDiscountService hotelDiscountService;
	private WebDiscountService webDiscountService;
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
		if (order.user.credit < 0) {
			return null;
		}
		List<HotelDiscount> strategies = hotelDiscountService.createAllStrategies(order.hotel.id);
		for (HotelDiscount strategy : strategies) {
			strategy.discount(order);
		}
		double min = Double.MAX_VALUE;
		double value = 0;
		for (HotelDiscountVO vo : order.hotelDiscounts.keySet()) {
			value = order.hotelDiscounts.get(vo);
			if (value < min) {
				min = value;
			}
		}
		order.value = min;
		return order;
	}

	@Transactional
	@Override
	public ResultMessage add(OrderVO ordervo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	@Override
	public ResultMessage checkin(OrderVO ordervo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	@Override
	public ResultMessage checkout(OrderVO ordervo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	@Override
	public ResultMessage revoke(OrderVO ordervo) {
		// TODO Auto-generated method stub
		return null;
	}

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

	public void setHotelDiscountService(HotelDiscountService hotelDiscountService) {
		this.hotelDiscountService = hotelDiscountService;
	}

	public void setWebDiscountService(WebDiscountService webDiscountService) {
		this.webDiscountService = webDiscountService;
	}

	public void setCreditRecordService(CreditRecordService creditRecordService) {
		this.creditRecordService = creditRecordService;
	}

	public void setDao(OrderDAO dao) {
		this.dao = dao;
	}
}
