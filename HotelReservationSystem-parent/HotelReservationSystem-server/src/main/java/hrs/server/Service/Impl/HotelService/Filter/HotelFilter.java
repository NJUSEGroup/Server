package hrs.server.Service.Impl.HotelService.Filter;

import java.util.List;
import java.util.Map;

import hrs.common.Controller.UserController.FilterCondition;
import hrs.common.VO.HotelVO;
import hrs.common.VO.RoomVO;

public interface HotelFilter {
	void doFilter(Map<HotelVO, List<RoomVO>> hotels);
	void setFilterCondition(FilterCondition condition);
}
