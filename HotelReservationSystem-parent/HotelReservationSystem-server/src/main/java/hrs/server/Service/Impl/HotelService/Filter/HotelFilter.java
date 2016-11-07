package hrs.server.Service.Impl.HotelService.Filter;

import java.util.List;
import java.util.Map;

import hrs.common.Controller.UserController.FilterCondition;
import hrs.common.VO.HotelVO;
import hrs.common.VO.RoomVO;

public abstract class HotelFilter {
	protected FilterCondition condition;

	public abstract void doFilter(Map<HotelVO, List<RoomVO>> hotels);

	public void setFilterCondition(FilterCondition condition) {
		this.condition = condition;
	}

}
