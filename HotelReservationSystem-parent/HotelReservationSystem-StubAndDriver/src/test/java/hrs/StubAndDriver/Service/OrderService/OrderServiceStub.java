package hrs.StubAndDriver.Service.OrderService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.BeanUtils;

import hrs.StubAndDriver.DAO.OrderDAO.OrderDAOStub;
import hrs.StubAndDriver.Service.CreditRecordService.CreditRecordServiceStub;
import hrs.StubAndDriver.Service.HotelDiscountService.HotelDiscountServiceStub;
import hrs.StubAndDriver.Service.UserService.UserServiceStub;
import hrs.StubAndDriver.Service.WebDiscountService.WebDiscountServiceStub;
import hrs.common.VO.CreditRecordVO;
import hrs.common.VO.OrderVO;
import hrs.common.util.ResultMessage;
import hrs.common.util.type.CreditRecordType;
import hrs.common.util.type.OrderStatus;
import hrs.server.DAO.Interface.OrderDAO;
import hrs.server.POJO.OrderPO;
import hrs.server.Service.Interface.CreditRecordService.CreditRecordService;
import hrs.server.Service.Interface.OrderService.OrderService;
import hrs.server.Service.Interface.PromotionService.HotelDiscountService;
import hrs.server.Service.Interface.PromotionService.WebDiscountService;
import hrs.server.Service.Interface.UserService.UserService;

public class OrderServiceStub implements OrderService {
	private OrderDAO dao;
	private HotelDiscountService hotelDiscountService;
	private WebDiscountService webDiscountService;
	private UserService userService;
	private CreditRecordService creditRecordService;

	public OrderServiceStub() {
		dao = new OrderDAOStub();
		webDiscountService = new WebDiscountServiceStub();
		hotelDiscountService = new HotelDiscountServiceStub();
		creditRecordService = new CreditRecordServiceStub();
		userService = new UserServiceStub();
	}


	@Override
	public OrderVO placeOrder(OrderVO ordervo) {
		// 读取优惠策略，并对订单进行处理
		// hotelDiscountService.findAllByHotelID(ordervo.getHotelID());
		// webDiscountService.findAll();
		// 读取用户的信息：生日、所在企业、原始信用值
		// 合并后进行优惠
		// 每种优惠策略都设置优惠值
		return ordervo;
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
