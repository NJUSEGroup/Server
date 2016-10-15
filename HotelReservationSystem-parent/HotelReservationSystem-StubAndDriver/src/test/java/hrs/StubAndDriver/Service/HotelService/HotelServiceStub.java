package hrs.StubAndDriver.Service.HotelService;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

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

public class HotelServiceStub implements HotelService {
	private HotelDAO dao;
	private OrderService orderService;
	private RoomService roomService;
	private AvailableRoomService availableRoomService;

	public HotelServiceStub() {
		dao = new HotelDAOStub();
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
	public Map<HotelVO, List<OrderVO>> findOrderedHotelAndOrder(String username) {
		Map<HotelVO,List<OrderVO>> map = new HashMap<>();
		List<OrderVO> orders = orderService.findByUsername(username);
		List<OrderVO> orderForTheHotel = null;
		for(OrderVO order:orders){
			HotelVO hotel = findByID(order.getHotelID());
			if(map.containsKey(hotel)){
				map.get(hotel).add(order);
			}else{
				orderForTheHotel = new ArrayList<>();
				orderForTheHotel.add(order);
				map.put(hotel, orderForTheHotel);
			}
		}
		return map;
	}

	@Override
	public Map<HotelVO, List<RoomVO>> find(int loc, int circle, Date begin, Date end) {
		List<HotelPO> pos = dao.find(loc, circle);
		HotelVO vo = null;
		Map<HotelVO, List<RoomVO>> map = new HashMap<>();
		for (HotelPO po : pos) {
			vo = new HotelVO();
			BeanUtils.copyProperties(po, vo);
			List<RoomVO> rooms = roomService.findByHotelID(vo.getId());
			for(RoomVO room:rooms){
				if(!availableRoomService.hasAvailableRoom(po.getId(), room.getType(), begin, end)){
					rooms.remove(room);
				}
			}
			map.put(vo,rooms);
		}
		return map;
	}

	@Override
	public Map<HotelVO, List<RoomVO>> filterName(Map<HotelVO, List<RoomVO>> map, String hotelname) {
		for (HotelVO vo : map.keySet()) {
			if (!vo.getName().matches(".*" + hotelname + ".*")) {
				map.remove(vo);
			}
		}
		return map;
	}

	@Override
	public Map<HotelVO, List<RoomVO>> filterStar(Map<HotelVO, List<RoomVO>> map, int star) {
		for (HotelVO vo : map.keySet()) {
			if (vo.getStar() != star) {
				map.remove(vo);
			}
		}
		return map;
	}

	@Override
	public Map<HotelVO, List<RoomVO>> filterScore(Map<HotelVO, List<RoomVO>> map, double low, double high) {
		for (HotelVO vo : map.keySet()) {
			if (vo.getScore() < low || vo.getScore() > high) {
				map.remove(vo);
			}
		}
		return map;
	}

	@Override
	public Map<HotelVO, List<RoomVO>> orderByStar(Map<HotelVO, List<RoomVO>> map, boolean isDecrease) {
		Map<HotelVO,List<RoomVO>> res = new TreeMap<>(new Comparator<HotelVO>() {

			@Override
			public int compare(HotelVO o1, HotelVO o2) {
				if(isDecrease){
					return o1.getStar()-o2.getStar();
				}else{
					return o2.getStar()-o1.getStar();
				}
			}
		});
		for(HotelVO vo:map.keySet()){
			res.put(vo, map.get(vo));
		}
		return res;
	}

	@Override
	public Map<HotelVO, List<RoomVO>> orderByScore(Map<HotelVO, List<RoomVO>> map, boolean isDecrease) {
		Map<HotelVO,List<RoomVO>> res = new TreeMap<>(new Comparator<HotelVO>() {

			@Override
			public int compare(HotelVO o1, HotelVO o2) {
				if(isDecrease){
					return o1.getScore() >= o2.getScore() ? 1:-1;
				}else{
					return o2.getScore() >= o1.getScore() ? 1:-1;
				}
			}
		});
		for(HotelVO vo:map.keySet()){
			res.put(vo, map.get(vo));
		}
		return res;
	}

	@Override
	public Map.Entry<HotelVO, List<RoomVO>> displayRoomDetail(Map<HotelVO, List<RoomVO>> map, int hotelID) {
		for(Entry<HotelVO,List<RoomVO>> e:map.entrySet()){
			if(e.getKey().getId() == hotelID){
				return e;
			}
		}
		return null;
	}

	@Override
	public Map.Entry<HotelVO, List<OrderVO>> displayOrderDetail(HotelVO vo, String username) {
		Map<HotelVO,List<OrderVO>> map = new HashMap<>();
		map.put(vo, orderService.findByHotelAndUsername(vo.getId(), username));
		for(Entry<HotelVO,List<OrderVO>> e:map.entrySet()){
			return e;
		}
		return null;
	}

	@Override
	public Map<HotelVO, List<RoomVO>> filterIfOrdered(Map<HotelVO, List<RoomVO>> map) {
		for (HotelVO vo : map.keySet()) {
			if (vo.getStatus() == null || vo.getStatus().size() == 0) {
				map.remove(vo);
			}
		}
		return map;
	}

	@Override
	public Map<HotelVO, List<RoomVO>> filterRoomType(Map<HotelVO, List<RoomVO>> map, RoomType roomtype) {
		List<RoomVO> list;
		for(HotelVO hotel:map.keySet()){
			list = map.get(hotel);
			for(RoomVO room:list){
				if(room.getType() != roomtype){
					list.remove(room);
				}
			}
		}
		return map;
	}

	@Override
	public Map<HotelVO, List<RoomVO>> filterValue(Map<HotelVO, List<RoomVO>> map, double low, double high) {
		List<RoomVO> list;
		for(HotelVO hotel:map.keySet()){
			list = map.get(hotel);
			for(RoomVO room:list){
				if(room.getRoomValue() < low || room.getRoomValue() > high){
					list.remove(room);
				}
			}
		}
		return map;
	}

	@Override
	public Map<HotelVO, List<RoomVO>> orderByValue(Map<HotelVO, List<RoomVO>> map) {
		Map<HotelVO,List<RoomVO>> res = new TreeMap<>(new ValueComparator(map));
		return res;
	}
	
	class ValueComparator implements Comparator<HotelVO> {  
		  
		Map<HotelVO,List<RoomVO>> base;  
	    public ValueComparator(Map<HotelVO,List<RoomVO>> base) {  
	        this.base = base;  
	    }  
	  
	    // Note: this comparator imposes orderings that are inconsistent with equals.      
	    public int compare(HotelVO a, HotelVO b) {  
	        if (findMin(base.get(a)) > findMin(base.get(b))) {  
	            return -1;  
	        } else {  
	            return 1;  
	        } // returning 0 would merge keys  
	    }  
	}  
	
	private double findMin(List<RoomVO> list){
		double min = list.get(0).getRoomValue();
		for(RoomVO vo:list){
			if(vo.getRoomValue() < min){
				min = vo.getRoomValue();
			}
		}
		return min;
	}
}
