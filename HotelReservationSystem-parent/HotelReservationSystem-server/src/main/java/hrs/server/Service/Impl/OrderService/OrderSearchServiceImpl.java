package hrs.server.Service.Impl.OrderService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import hrs.common.Exception.OrderService.OrderNotFoundException;
import hrs.common.POJO.OrderPO;
import hrs.common.VO.OrderVO;
import hrs.common.util.DesUtil;
import hrs.common.util.type.OrderStatus;
import hrs.server.DAO.Interface.OrderDAO;
import hrs.server.Service.Interface.OrderService.OrderSearchService;

@Service
public class OrderSearchServiceImpl implements OrderSearchService {
	@Autowired
	private OrderDAO dao;
	
	@Transactional
	@Override
	public OrderVO findByID(int id) throws OrderNotFoundException {
		OrderPO po  = dao.findByID(id);
		if(po == null){
			throw new OrderNotFoundException();
		}else{
			return new OrderVO(po);
		}
	}

	@Transactional
	@Override
	public List<OrderVO> findByHotelAndStatus(int hotelID, OrderStatus status) throws OrderNotFoundException {
		List<OrderPO> pos = dao.findByHotelAndStatus(hotelID,status);
		if(pos.size() == 0){
			throw new OrderNotFoundException();
		}else{
			return tranfer(pos);
		}
	}

	@Transactional
	@Override
	public List<OrderVO> findByUsernameAndStatus(String username, OrderStatus status) throws OrderNotFoundException {
		List<OrderPO> pos = dao.findByUsernameAndStatus(DesUtil.encode(username),status);
		if(pos.size() == 0){
			throw new OrderNotFoundException();
		}else{
			return tranfer(pos);
		}
	}

	@Transactional
	@Override
	public List<OrderVO> findByUsername(String username) throws OrderNotFoundException {
		List<OrderPO> pos = dao.findByUsername(DesUtil.encode(username));
		if(pos.size() == 0){
			throw new OrderNotFoundException();
		}else{
			return tranfer(pos);
		}
	}

	@Transactional
	@Override
	public List<OrderVO> findByHotelAndUsername(int hotelID, String username) throws OrderNotFoundException {
		List<OrderPO> pos = dao.findByHotelAndUsername(hotelID, DesUtil.encode(username));
		if(pos.size() == 0){
			throw new OrderNotFoundException();
		}else{
			return tranfer(pos);
		}
	}

	@Transactional
	@Override
	public List<OrderVO> findByOrderStatus(OrderStatus status) throws OrderNotFoundException {
		List<OrderPO> pos = dao.findByOrderStatus(status);
		if(pos.size() == 0){
			throw new OrderNotFoundException();
		}else{
			return tranfer(pos);
		}
	}

	@Transactional
	@Override
	public List<OrderVO> findByHotelAndTime(int hotelID, Date begin, Date end) throws OrderNotFoundException {
		List<OrderPO> pos = dao.findByHotelAndTime(hotelID, begin, end);
		if(pos.size() == 0){
			throw new OrderNotFoundException();
		}else{
			return tranfer(pos);
		}
	}
	
	private List<OrderVO> tranfer(List<OrderPO> pos){
		List<OrderVO> vos = new ArrayList<>();
		OrderVO vo = null;
		for(OrderPO po : pos){
			vo = new OrderVO(po);
			vos.add(vo);
		}
		return vos;
	}
}
