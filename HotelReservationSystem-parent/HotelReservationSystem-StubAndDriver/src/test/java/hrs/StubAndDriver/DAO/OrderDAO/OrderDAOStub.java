package hrs.StubAndDriver.DAO.OrderDAO;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import hrs.common.POJO.HotelPO;
import hrs.common.POJO.OrderPO;
import hrs.common.POJO.UserPO;
import hrs.common.util.ResultMessage;
import hrs.common.util.type.OrderStatus;
import hrs.common.util.type.RoomType;
import hrs.server.DAO.Interface.OrderDAO;

public class OrderDAOStub implements OrderDAO {
	private Map<Integer,OrderPO> map;
	private Date defaultDate;
	public OrderDAOStub() {
		map = new HashMap<>();
		Calendar c = Calendar.getInstance();
		c.set(2016, 10, 14, 8, 0, 0);
		defaultDate = c.getTime();
		HotelPO hotel = new HotelPO();
		hotel.setId(0);
		UserPO user = new UserPO();
		user.setId(0);
		map.put(0, new OrderPO(0,defaultDate,defaultDate,OrderStatus.Unexecuted,hotel,300,RoomType.Single,1,false,user,1));
		map.put(1, new OrderPO(1,defaultDate,defaultDate,OrderStatus.Unexecuted,hotel,300,RoomType.Single,1,false,user,1));
	}
	
	@Override
	public OrderPO findByID(int ID) {
		return map.get(ID);
	}

	@Override
	public List<OrderPO> findByUsernameAndType(String username, OrderStatus status) {
		List<OrderPO> list = new ArrayList<>();
		OrderPO po = null;
		Set<Integer> set = map.keySet();
		for(Integer i:set){
			po = map.get(i);
			if(po.getUser().getUsername().equals(username) && po.getStatus().equals(status)){
				list.add(po);
			}
		}
		return list;
	}

	@Override
	public List<OrderPO> findByHotelAndUsername(int hotelID, String username) {
		List<OrderPO> list = new ArrayList<>();
		OrderPO po = null;
		Set<Integer> set = map.keySet();
		for(Integer i:set){
			po = map.get(i);
			if(po.getHotel().getId() == hotelID && po.getUser().getUsername().equals(username)){
				list.add(po);
			}
		}
		return list;
	}

	@Override
	public List<OrderPO> findByUsername(String username) {
		List<OrderPO> list = new ArrayList<>();
		OrderPO po = null;
		Set<Integer> set = map.keySet();
		for(Integer i:set){
			po = map.get(i);
			if(po.getUser().getUsername().equals(username)){
				list.add(po);
			}
		}
		return list;
	}

	@Override
	public List<OrderPO> findByOrderType(OrderStatus status) {
		List<OrderPO> list = new ArrayList<>();
		OrderPO po = null;
		Set<Integer> set = map.keySet();
		for(Integer i:set){
			po = map.get(i);
			if(po.getStatus().equals(status)){
				list.add(po);
			}
		}
		return list;
	}

	@Override
	public List<OrderPO> findByHotelAndTime(int hotelID, Date begin, Date end) {
		List<OrderPO> list = new ArrayList<>();
		OrderPO po = null;
		Set<Integer> set = map.keySet();
		for(Integer i:set){
			po = map.get(i);
			if(po.getHotel().getId() == hotelID && (po.getExecTime().compareTo(begin) >=0 && po.getExpectedCheckoutTime().compareTo(end) <= 0 )){
				list.add(po);
			}
		}
		return list;
	}

	@Override
	public ResultMessage add(OrderPO orderpo) {
		map.put(orderpo.getId(), orderpo);
		return ResultMessage.SUCCESS;
	}

	@Override
	public ResultMessage update(OrderPO orderpo) {
		map.put(orderpo.getId(),orderpo);
		return ResultMessage.SUCCESS;
	}
	
}
