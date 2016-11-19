package hrs.server.Service.Impl.HotelService.HotelFilter;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import hrs.common.VO.HotelVO;
import hrs.common.VO.RoomVO;
import hrs.common.util.FilterCondition.StarFilterCondition;

public class HotelStarFilter extends HotelFilter{

	@Override
	public void doFilter(Map<HotelVO, List<RoomVO>> hotels) {
		StarFilterCondition condition = (StarFilterCondition) super.condition;	
		Iterator<HotelVO> it = hotels.keySet().iterator();
		HotelVO vo = null;
		while(it.hasNext()){
			vo = it.next();
			if(vo.star != condition.getStar()){
				it.remove();
			}
		}
	}

}
