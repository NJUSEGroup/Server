package hrs.server.Service.Impl.HotelService;

import java.util.List;
import java.util.Map;

import hrs.common.VO.HotelVO;
import hrs.common.VO.RoomVO;
import hrs.common.util.FilterCondition.FilterCondition;
import hrs.common.util.type.OrderRule;
import hrs.server.Service.Impl.HotelService.HotelFilter.HotelFilter;

public class AvailableHotel {
	private Map<HotelVO, List<RoomVO>> data;
	
	public Map<HotelVO, List<RoomVO>> filter(List<FilterCondition> conditions) {
		HotelFilter filter = null;
		Class<?> clazz = null;
		try {
			for (FilterCondition condition : conditions) {
				clazz = Class.forName("hrs.server.Service.Impl.HotelService.HotelFilter.Hotel" + condition.getType().toString() + "Filter");
				filter = (HotelFilter) clazz.newInstance();
				filter.setFilterCondition(condition);
				filter.doFilter(data);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return data;
	}
	
	public Map<HotelVO, List<RoomVO>> order(OrderRule rule, boolean isDecrease) {
		return data;
	}
	
	public Map<HotelVO, List<RoomVO>> getData() {
		return data;
	}

	public void setData(Map<HotelVO, List<RoomVO>> data) {
		this.data = data;
	}
}
