package hrs.StubAndDriver.DAO.OrderDAO;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import hrs.common.DAO.OrderDAO;
import hrs.common.PO.OrderPO;
import hrs.common.util.ResultMessage;
import hrs.common.util.type.OrderStatus;
import hrs.common.util.type.RoomType;

public class OrderDAOStub implements OrderDAO {
	private Map<Integer,OrderPO> map;
	private Date defaultDate;
	public OrderDAOStub() {
		map = new HashMap<>();
		Calendar c = Calendar.getInstance();
		c.set(2016, 10, 14, 8, 0, 0);
		defaultDate = c.getTime();
		map.put(0, new OrderPO(0,defaultDate,defaultDate,OrderStatus.Unexecuted,0,300,RoomType.Single,1,false,"admin"));
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
			if(po.getUsername().equals(username) && po.getStatus().equals(status)){
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
			if(po.getHotelID() == hotelID && po.getUsername().equals(username)){
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
			if(po.getUsername().equals(username)){
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
			if(po.getHotelID() == hotelID && (po.getExecTime().compareTo(begin) >=0 && po.getExpectedCheckoutTime().compareTo(end) <= 0 )){
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
