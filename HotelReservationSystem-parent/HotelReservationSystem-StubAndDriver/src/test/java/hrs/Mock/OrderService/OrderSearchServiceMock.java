package hrs.Mock.OrderService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.BeanUtils;

import hrs.StubAndDriver.DAO.OrderDAO.OrderDAOStub;
import hrs.common.POJO.OrderPO;
import hrs.common.VO.OrderVO;
import hrs.common.util.type.OrderStatus;
import hrs.server.DAO.Interface.OrderDAO;
import hrs.server.Service.Interface.OrderService.OrderSearchService;

public class OrderSearchServiceMock implements OrderSearchService {
	private OrderDAO dao;
	
	public OrderSearchServiceMock() {
		dao = new OrderDAOStub();
	}
	
	@Override
	public OrderVO findByID(int id) {
		OrderPO po = dao.findByID(id);
		if (po == null) {
			return null;
		}
		OrderVO vo = new OrderVO();
		BeanUtils.copyProperties(po, vo);
		return vo;
	}

	@Override
	public List<OrderVO> findByUsernameAndType(String username, OrderStatus type) {
		List<OrderPO> pos = dao.findByUsernameAndType(username, type);
		if (pos == null) {
			return null;
		}
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
		if (pos == null) {
			return null;
		}
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
		if (pos == null) {
			return null;
		}
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
		if (pos == null) {
			return null;
		}
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
		if (pos == null) {
			return null;
		}
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
	public List<OrderVO> findByHotelAndType(int hotelID, OrderStatus type) {
		return null;
	}


}
