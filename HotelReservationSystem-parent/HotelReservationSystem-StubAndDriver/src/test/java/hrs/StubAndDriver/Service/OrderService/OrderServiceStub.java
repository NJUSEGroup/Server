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
import hrs.client.VO.OrderVO;
import hrs.common.DAO.OrderDAO;
import hrs.common.PO.OrderPO;
import hrs.common.util.ResultMessage;
import hrs.common.util.type.OrderStatus;

public class OrderServiceStub implements OrderService{
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
		for(OrderPO po:pos){
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
		for(OrderPO po:pos){
			vo = new OrderVO();
			BeanUtils.copyProperties(po, vo);
			vos.add(vo);
		}
		return vos;
	}
	@Override
	public List<OrderVO> findByHotelAndUsername(int hotelID, String username) {
		List<OrderPO> pos = dao.findByHotelAndUsername(hotelID,username);
		List<OrderVO> vos = new ArrayList<>(pos.size());
		OrderVO vo = null;
		for(OrderPO po:pos){
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
		for(OrderPO po:pos){
			vo = new OrderVO();
			BeanUtils.copyProperties(po, vo);
			vos.add(vo);
		}
		return vos;
	}
	
	@Override
	public List<OrderVO> findByHotelAndTime(int hotelID, Date begin, Date end) {
		List<OrderPO> pos = dao.findByHotelAndTime(hotelID,begin,end);
		List<OrderVO> vos = new ArrayList<>(pos.size());
		OrderVO vo = null;
		for(OrderPO po:pos){
			vo = new OrderVO();
			BeanUtils.copyProperties(po, vo);
			vos.add(vo);
		}
		return vos;
	}
	
	@Override
	public ResultMessage placeOrder(OrderVO ordervo) {
		OrderPO po = new OrderPO();
		
		BeanUtils.copyProperties(ordervo, po);
		return dao.add(po);
	}
	
	@Override
	public ResultMessage update(OrderVO ordervo) {
		OrderPO po = new OrderPO();
		BeanUtils.copyProperties(ordervo, po);
		return dao.update(po);
	}
	
}	