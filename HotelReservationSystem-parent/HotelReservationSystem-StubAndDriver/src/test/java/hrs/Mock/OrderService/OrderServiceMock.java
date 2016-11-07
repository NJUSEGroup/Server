package hrs.Mock.OrderService;

import java.util.List;

import org.springframework.beans.BeanUtils;

import hrs.Mock.CreditRecordService.CreditRecordServiceMock;
import hrs.Mock.HotelDiscountService.HotelDiscountServiceMock;
import hrs.Mock.UserService.UserServiceMock;
import hrs.Mock.WebDiscountService.WebDiscountServiceMock;
import hrs.StubAndDriver.DAO.OrderDAO.OrderDAOStub;
import hrs.common.VO.HotelDiscountVO;
import hrs.common.VO.OrderVO;
import hrs.common.util.ResultMessage;
import hrs.server.DAO.Interface.OrderDAO;
import hrs.server.POJO.OrderPO;
import hrs.server.Service.Impl.PromotionService.HotelDiscountService.HotelDiscount;
import hrs.server.Service.Interface.CreditRecordService.CreditRecordService;
import hrs.server.Service.Interface.OrderService.OrderService;
import hrs.server.Service.Interface.PromotionService.HotelDiscountService;
import hrs.server.Service.Interface.PromotionService.WebDiscountService;
import hrs.server.Service.Interface.UserService.UserService;

public class OrderServiceMock implements OrderService {
	private OrderDAO dao;
	private HotelDiscountService hotelDiscountService;
	private WebDiscountService webDiscountService;
	private UserService userService;
	private CreditRecordService creditRecordService;

	public OrderServiceMock() {
		dao = new OrderDAOStub();
		webDiscountService = new WebDiscountServiceMock();
		hotelDiscountService = new HotelDiscountServiceMock();
		creditRecordService = new CreditRecordServiceMock();
		userService = new UserServiceMock();
	}


	@Override
	public OrderVO placeOrder(OrderVO order) {
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

	/*@Override
	public ResultMessage update(OrderVO ordervo) {
		OrderPO po = new OrderPO();
		BeanUtils.copyProperties(ordervo, po);
		// 如果网站营销人员撤销订单或者执行订单或者异常，那么添加一条信用记录
		CreditRecordVO creditRecord = null;
		switch (po.getStatus()) {
		case Executed:
			creditRecord = new CreditRecordVO(0, po.getUsername(), CreditRecordType.Execute, (int) ordervo.value);
			break;
		case Abnormal:
			creditRecord = new CreditRecordVO(0, po.getUsername(), CreditRecordType.Execute, -((int) ordervo.value));
			break;
		case UserRevoked:
			if (ordervo.expectedCheckoutTime.getTime() - System.currentTimeMillis() < 6 * 3600)
				creditRecord = new CreditRecordVO(0, ordervo.username, CreditRecordType.Overtime,
						-((int) (po.getValue() / 2)));
			break;
		case RevokedHalfValue:
			creditRecord = new CreditRecordVO(0, po.getUsername(), CreditRecordType.Revoke, (int) (po.getValue() / 2));
			break;
		case RevokedFullValue:
			creditRecord = new CreditRecordVO(0, po.getUsername(), CreditRecordType.Revoke, (int) po.getValue());
			break;
		default:
			break;
		}
		if (creditRecord != null) {
			creditRecordService.add(creditRecord);
		}
		return dao.update(po);
	}*/

	@Override
	public ResultMessage add(OrderVO ordervo) {
		OrderPO po = new OrderPO();
		BeanUtils.copyProperties(ordervo, po);
		return dao.add(po);
	}


	@Override
	public ResultMessage checkin(OrderVO ordervo) {
		// TODO Auto-generated method stub
		return ResultMessage.SUCCESS;
	}


	@Override
	public ResultMessage checkout(OrderVO ordervo) {
		// TODO Auto-generated method stub
		return ResultMessage.SUCCESS;
	}


	@Override
	public ResultMessage revoke(OrderVO ordervo) {
		// TODO Auto-generated method stub
		return ResultMessage.SUCCESS;
	}


	@Override
	public ResultMessage remark(OrderVO ordervo) {
		// TODO Auto-generated method stub
		return ResultMessage.SUCCESS;
	}


	@Override
	public ResultMessage delayCheckin(OrderVO ordervo) {
		// TODO Auto-generated method stub
		return ResultMessage.SUCCESS;
	}
}
