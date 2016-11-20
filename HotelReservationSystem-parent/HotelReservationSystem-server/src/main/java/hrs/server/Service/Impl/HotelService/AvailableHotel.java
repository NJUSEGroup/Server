	package hrs.server.Service.Impl.HotelService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import hrs.common.VO.HotelVO;
import hrs.common.VO.RoomVO;
import hrs.common.util.FilterCondition.FilterCondition;
import hrs.common.util.type.OrderRule;
import hrs.server.Service.Impl.HotelService.HotelComparator.HotelComparator;
import hrs.server.Service.Impl.HotelService.HotelFilter.HotelFilter;
/**
 * 
* @ClassName: AvailableHotel
* @Description: TODO
* @author NewSong
* @date 2016年11月19日 下午10:03:33
*
 */
public class AvailableHotel {
	/**
	 * 存储一个酒店和房间列表的键值对
	 */
	private Map<HotelVO, List<RoomVO>> data;
	
	/**
	 * 
	 * @Title: filter
	 * @Description: 过滤酒店和房间
	 * @param  conditions
	 * @param    
	 * @return Map<HotelVO,List<RoomVO>>   
	 * @throws
	 */
	public Map<HotelVO, List<RoomVO>> filter(List<FilterCondition> conditions) {
		//拷贝一份，每次过滤都不修改原始的缓存
		Map<HotelVO, List<RoomVO>> res = new HashMap<>();
		res.putAll(data);
		HotelFilter filter = null;
		Class<?> clazz = null;
		try {
			for (FilterCondition condition : conditions) {
				clazz = Class.forName("hrs.server.Service.Impl.HotelService.HotelFilter.Hotel"
						+ condition.getType().toString() + "Filter");
				filter = (HotelFilter) clazz.newInstance();
				filter.setFilterCondition(condition);
				filter.doFilter(res);
			}
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return res;
	}
	
	/**
	 * 
	 * @Title: order
	 * @Description: 按照给定的排序规则和升降序对酒店进行排序
	 * @param  rule
	 * @param  isDecrease
	 * @return Map<HotelVO,List<RoomVO>>   
	 * @throws
	 */
	public Map<HotelVO, List<RoomVO>> order(OrderRule rule, boolean isDecrease) {
		HotelComparator comp = null;
		try {
			comp = (HotelComparator) Class
					.forName("hrs.server.Service.Impl.HotelService.HotelComparator." + rule.toString() + "Comparator")
					.newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		comp.setDecrease(isDecrease);
		Map<HotelVO, List<RoomVO>> res = new TreeMap<>(comp);
		res.putAll(data);
		return res;
	}

	public Map<HotelVO, List<RoomVO>> getData() {
		return data;
	}

	public void setData(Map<HotelVO, List<RoomVO>> data) {
		this.data = data;
	}
}
