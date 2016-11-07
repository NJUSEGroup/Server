package hrs.server.Service.Impl.HotelService;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.transaction.annotation.Transactional;

import hrs.common.Controller.UserController.FilterCondition;
import hrs.common.VO.HotelVO;
import hrs.common.VO.OrderVO;
import hrs.common.VO.RoomVO;
import hrs.common.util.ResultMessage;
import hrs.common.util.type.OrderRule;
import hrs.server.DAO.Interface.HotelDAO.HotelDAO;
import hrs.server.Service.Interface.HotelService.HotelService;
import hrs.server.Service.Interface.OrderService.OrderService;
import hrs.server.Service.Interface.RoomService.RoomService;

public class HotelServiceImpl implements HotelService {
	private HotelDAO dao;
	private AvailableHotel hotel;
	private RoomService roomService;
	private OrderService orderService;

	@Transactional
	@Override
	public HotelVO findByID(int hotelID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	@Override
	public ResultMessage update(HotelVO hotelvo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	@Override
	public ResultMessage add(HotelVO hotelvo) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 查询出来的OrderVO就需要按价格升序排列
	 */
	@Transactional
	@Override
	public Map<HotelVO, List<OrderVO>> findOrderedHotelAndOrder(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	@Override
	public Map<HotelVO, List<RoomVO>> find(int loc, int circle, Date begin, Date end) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	@Override
	public Map<HotelVO, List<RoomVO>> filter(List<FilterCondition> conditions) {
		return hotel.filter(conditions);
	}

	@Transactional
	@Override
	public List<RoomVO> getRoomDetail(int hotelID) {
		return null;
	}

	@Transactional
	@Override
	public Map<HotelVO, List<RoomVO>> order(OrderRule rule, boolean isDecrease) {
		return hotel.order(rule, isDecrease);
	}

	public void setRoomService(RoomService roomService) {
		this.roomService = roomService;
	}

	public void setOrderService(OrderService orderService) {
		this.orderService = orderService;
	}

	public void setDao(HotelDAO dao) {
		this.dao = dao;
	}

}
