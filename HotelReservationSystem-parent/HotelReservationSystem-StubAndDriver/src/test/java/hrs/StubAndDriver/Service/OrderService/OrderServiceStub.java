package hrs.StubAndDriver.Service.OrderService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.BeanUtils;

import hrs.StubAndDriver.DAO.OrderDAO.OrderDAOStub;
import hrs.client.Service.CreditRecordService;
import hrs.client.Service.OrderService;
import hrs.client.Service.UserService;
import hrs.client.Service.WebDiscountService;
import hrs.client.Service.HotelDiscountService.HotelDiscountService;
import hrs.client.VO.CreditRecordVO;
import hrs.client.VO.OrderVO;
import hrs.common.DAO.OrderDAO;
import hrs.common.PO.OrderPO;
import hrs.common.util.ResultMessage;
import hrs.common.util.type.CreditRecordType;
import hrs.common.util.type.OrderStatus;

public class OrderServiceStub implements OrderService {
	private OrderDAO dao;
	private HotelDiscountService hotelDiscountService;
	private WebDiscountService webDiscountService;
	private UserService userService;
	private CreditRecordService creditRecordService;

	public OrderServiceStub() {
		dao = new OrderDAOStub();
	}

	@Override
	public OrderVO findByID(int id) {
		OrderPO po = dao.findByID(id);
		OrderVO vo = new OrderVO();
		BeanUtils.copyProperties(po, vo);
		return vo;
	}

	@Override
	public List<OrderVO> findByUsernameAndType(String username, OrderStatus type) {
		List<OrderPO> pos = dao.findByUsernameAndType(username, type);
		List<OrderVO> vos = new ArrayList<>(pos.size());
		OrderVO vo = null;
		for (OrderPO po : pos) {
			vo = new OrderVO();
			BeanUtils.copyProperties(po, vo);
			vos.add(vo);
		}
		return vos;
	}

	@Override
	public List<OrderVO> findByUsername(String username) {
		List<OrderPO> pos = dao.findByUsername(username);
		List<OrderVO> vos = new ArrayList<>(pos.size());
		OrderVO vo = null;
		for (OrderPO po : pos) {
			vo = new OrderVO();
			BeanUtils.copyProperties(po, vo);
			vos.add(vo);
		}
		return vos;
	}

	@Override
	public List<OrderVO> findByHotelAndUsername(int hotelID, String username) {
		List<OrderPO> pos = dao.findByHotelAndUsername(hotelID, username);
		List<OrderVO> vos = new ArrayList<>(pos.size());
		OrderVO vo = null;
		for (OrderPO po : pos) {
			vo = new OrderVO();
			BeanUtils.copyProperties(po, vo);
			vos.add(vo);
		}
		return vos;
	}

	@Override
	public List<OrderVO> findByOrderType(OrderStatus status) {
		List<OrderPO> pos = dao.findByOrderType(status);
		List<OrderVO> vos = new ArrayList<>(pos.size());
		OrderVO vo = null;
		for (OrderPO po : pos) {
			vo = new OrderVO();
			BeanUtils.copyProperties(po, vo);
			vos.add(vo);
		}
		return vos;
	}

	@Override
	public List<OrderVO> findByHotelAndTime(int hotelID, Date begin, Date end) {
		List<OrderPO> pos = dao.findByHotelAndTime(hotelID, begin, end);
		List<OrderVO> vos = new ArrayList<>(pos.size());
		OrderVO vo = null;
		for (OrderPO po : pos) {
			vo = new OrderVO();
			BeanUtils.copyProperties(po, vo);
			vos.add(vo);
		}
		return vos;
	}

	@Override
	public ResultMessage placeOrder(OrderVO ordervo) {
		OrderPO po = new OrderPO();
		// 读取优惠策略，并对订单进行处理
		// hotelDiscountService.findAllByHotelID(ordervo.getHotelID());
		// webDiscountService.findAll();
		// 读取用户的信息：生日、所在企业、原始信用值
		// 合并后进行优惠

		BeanUtils.copyProperties(ordervo, po);
		return dao.add(po);
	}

	@Override
	public ResultMessage update(OrderVO ordervo) {
		// TODO Auto-generated method stub
		return null;
	}

	/*@Override
	public ResultMessage update(OrderVO ordervo) {
		OrderPO po = new OrderPO();
		BeanUtils.copyProperties(ordervo, po);
		//如果网站营销人员撤销订单或者执行订单或者异常，那么添加一条信用记录
		CreditRecordVO creditRecord;
		switch(po.getStatus()){
		case Executed:
			creditRecord = new CreditRecordVO(0,po.getUsername(),CreditRecordType.Execute,(int)ordervo.getValue());
			break;
		case Abnormal:
			creditRecord = new CreditRecordVO(0,po.getUsername(),CreditRecordType.Execute,-((int)ordervo.getValue()));
			break;
		case UserRevoked:
			if(ordervo.getExpectedCheckoutTime() - System.currentTimeMillis() < )
				creditRecord = new CreditRecordVO();
		}
		if(po.getStatus() == OrderStatus.Executed){
			creditRecordService.add(new CreditRecordVO(0,po.getUsername(),CreditRecordType.Execute,(int)ordervo.getValue()));
		}else if(po.getStatus() == OrderStatus.Abnormal){
			
		}else(OrderStatus.Abnormal && po.getStatus() == OrderStatus.Revoked){
			creditRecordService.add(new CreditRecordVO(1, po.getUsername(), CreditRecordType.Revoke, ))
		}
		return dao.update(po);
	}
	*/
}
