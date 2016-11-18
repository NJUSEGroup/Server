package hrs.server.Service.Impl.HotelService.HotelFilter;

import java.util.List;
import java.util.Map;

import hrs.common.VO.HotelVO;
import hrs.common.VO.RoomVO;
import hrs.common.util.FilterCondition.FilterCondition;

public abstract class HotelFilter {
	protected FilterCondition condition;

	public abstract void doFilter(Map<HotelVO, List<RoomVO>> hotels);

	public void setFilterCondition(FilterCondition condition) {
		this.condition = condition;
	}

}
