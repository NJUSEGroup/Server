package hrs.StubAndDriver.Service.HotelService;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;

import hrs.StubAndDriver.DAO.HotelDAO.HotelDAOStub;
import hrs.client.Service.OrderService;
import hrs.client.Service.RoomService;
import hrs.client.Service.HotelService.AvailableRoomService;
import hrs.client.Service.HotelService.HotelService;
import hrs.client.VO.HotelVO;
import hrs.client.VO.OrderVO;
import hrs.client.VO.RoomVO;
import hrs.common.DAO.HotelDAO.HotelDAO;
import hrs.common.PO.HotelPO;
import hrs.common.util.ResultMessage;
import hrs.common.util.type.RoomType;

public class HotelServiceStub implements HotelService{
	private HotelDAO dao;
	private OrderService orderService;
	private RoomService roomService;
	private AvailableRoomService availableRoomService;
	private Date defaultDate;
	
	public HotelServiceStub() {
		dao = new HotelDAOStub();
		Calendar c = Calendar.getInstance();
		c.set(2016, 10, 14, 8, 0, 0);
		defaultDate = c.getTime();
	}
	
	
	@Override
	public HotelVO findByID(int hotelID) {
		HotelPO po = dao.findByID(hotelID);
		HotelVO vo = new HotelVO();
		BeanUtils.copyProperties(po, vo);
		return vo;
	}

	@Override
	public ResultMessage update(HotelVO hotelvo) {
		HotelPO po = new HotelPO();
		BeanUtils.copyProperties(hotelvo, po);
		return dao.update(po);
	}

	@Override
	public ResultMessage add(HotelVO hotelvo) {
		HotelPO po = new HotelPO();
		BeanUtils.copyProperties(hotelvo, po);
		return dao.add(po);
	}
	
	@Override
	public List<Map<HotelVO, List<OrderVO>>> findOrderedHotelAndOrder(String username) {
		
		return null;
	}

	@Override
	public List<Map<HotelVO, List<RoomVO>>> find(int loc, int circle, Date begin, Date end) {
		List<HotelPO> pos = dao.find(loc, circle);
		HotelVO vo = null;
		List<Map<HotelVO, List<RoomVO>>> res = new ArrayList<>();
		Map<HotelVO, List<RoomVO>> map;
		for(HotelPO po:pos){
			vo = new HotelVO();
			BeanUtils.copyProperties(po,vo);
			roomService.findByHotelID(vo.getId());
		}
		return null;
	}
	
	
	@Override
	public List<Map<HotelVO, List<RoomVO>>> filterName(List<Map<HotelVO, List<RoomVO>>> list, String hotelname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<HotelVO, List<RoomVO>>> filterStar(List<Map<HotelVO, List<RoomVO>>> list, int star) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<HotelVO, List<RoomVO>>> filterScore(List<Map<HotelVO, List<RoomVO>>> list, double low,
			double high) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<HotelVO, List<RoomVO>>> orderByStar(List<Map<HotelVO, List<RoomVO>>> list, boolean isDecrease) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<HotelVO, List<RoomVO>>> orderByScore(List<Map<HotelVO, List<RoomVO>>> list, boolean isDecrease) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<HotelVO, List<RoomVO>> displayRoomDetail(List<Map<HotelVO, List<RoomVO>>> list, int hotelID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<HotelVO, List<OrderVO>> displayOrderDetail(int hotelID, String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<HotelVO, List<RoomVO>>> filterIfOrdered(List<Map<HotelVO, List<RoomVO>>> list) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<HotelVO, List<RoomVO>>> filterRoomType(List<Map<HotelVO, List<RoomVO>>> list, RoomType roomtype) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<HotelVO, List<RoomVO>>> filterValue(List<Map<HotelVO, List<RoomVO>>> list, double low,
			double high) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<HotelVO, List<RoomVO>>> orderByValue(List<Map<HotelVO, List<RoomVO>>> list) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
