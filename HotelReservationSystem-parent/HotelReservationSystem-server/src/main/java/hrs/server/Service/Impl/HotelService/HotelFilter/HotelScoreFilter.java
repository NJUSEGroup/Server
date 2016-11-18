package hrs.server.Service.Impl.HotelService.HotelFilter;

import java.util.List;
import java.util.Map;

import hrs.common.VO.HotelVO;
import hrs.common.VO.RoomVO;
import hrs.common.util.FilterCondition.ScoreFilterCondition;

public class HotelScoreFilter extends HotelFilter{

	@Override
	public void doFilter(Map<HotelVO, List<RoomVO>> hotels) {
		ScoreFilterCondition condition = (ScoreFilterCondition) super.condition;
		List<RoomVO> rooms = null;
		for(HotelVO vo: hotels.keySet()){
			rooms = hotels.get(vo);
			for(RoomVO room:rooms){
				if(room.roomValue < condition.getLow() || room.roomNum > condition.getHigh()){
					rooms.remove(room);
					if(rooms.size() == 0){
						hotels.remove(vo);
					}
				}
			}
		}
	}

}
