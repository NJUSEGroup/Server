package hrs.server.Service.Impl.HotelService.Filter;

import java.util.List;
import java.util.Map;

import hrs.common.VO.HotelVO;
import hrs.common.VO.RoomVO;
import hrs.server.Service.Interface.HotelService.Filter.NameFilterCondition;

public class HotelNameFilter extends  HotelFilter {
	public HotelNameFilter() {
	}
	
	@Override
	public void doFilter(Map<HotelVO, List<RoomVO>> hotels) {
		NameFilterCondition condition  = (NameFilterCondition)super.condition;
		for(HotelVO vo:hotels.keySet()){
			if(!vo.name.matches("^.*\\["+condition.getHotelName()+"\\].*$")){
				hotels.remove(vo);
			}
		}
	}

}
