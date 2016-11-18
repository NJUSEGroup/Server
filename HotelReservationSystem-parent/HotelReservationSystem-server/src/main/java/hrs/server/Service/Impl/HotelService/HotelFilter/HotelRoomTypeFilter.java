package hrs.server.Service.Impl.HotelService.HotelFilter;

import java.util.List;
import java.util.Map;

import hrs.common.VO.HotelVO;
import hrs.common.VO.RoomVO;
import hrs.common.util.FilterCondition.RoomTypeFilterCondition;

public class HotelRoomTypeFilter extends HotelFilter {
	
	@Override
	public void doFilter(Map<HotelVO, List<RoomVO>> hotels) {
		RoomTypeFilterCondition condition = (RoomTypeFilterCondition) super.condition;
		List<RoomVO> rooms = null;
		for(HotelVO vo: hotels.keySet()){
			rooms = hotels.get(vo);
			for(RoomVO room:rooms){
				if(room.type != condition.getRoomType()){
					rooms.remove(room);
					if(rooms.size() == 0){
						hotels.remove(vo);
					}
				}
			}
		}
	}

}
