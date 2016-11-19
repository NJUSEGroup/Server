package hrs.server.Service.Impl.HotelService.HotelFilter;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import hrs.common.VO.HotelVO;
import hrs.common.VO.RoomVO;
import hrs.common.util.FilterCondition.NameFilterCondition;

public class HotelNameFilter extends HotelFilter {
	public HotelNameFilter() {

	}

	@Override
	public void doFilter(Map<HotelVO, List<RoomVO>> hotels) {
		NameFilterCondition condition = (NameFilterCondition) super.condition;
		Iterator<HotelVO> it = hotels.keySet().iterator();
		HotelVO vo = null;
		while (it.hasNext()) {
			vo = it.next();
			if (!vo.name.matches(".*" + condition.getHotelName() +".*")) {
				it.remove();
			}
		}
	}
}
