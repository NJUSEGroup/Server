package hrs.server.Service.Impl.HotelService.Filter;

import java.util.List;
import java.util.Map;

import hrs.common.Controller.UserController.FilterCondition;
import hrs.common.VO.HotelVO;
import hrs.common.VO.RoomVO;
import hrs.server.Service.Interface.HotelService.Filter.NameFilterCondition;

public class HotelNameFilter implements HotelFilter {
	private NameFilterCondition condition;
	public HotelNameFilter() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void doFilter(Map<HotelVO, List<RoomVO>> hotels) {
		for(HotelVO vo:hotels.keySet()){
			if(!vo.name.matches("^.*\\["+condition.getHotelName()+"\\].*$")){
				hotels.remove(vo);
			}
		}
	}

	@Override
	public void setFilterCondition(FilterCondition condition) {
		this.condition = (NameFilterCondition)condition;
	}
}
