package hrs.server.Service.Impl.HotelService.HotelFilter;

import java.util.List;
import java.util.Map;

import hrs.common.VO.HotelVO;
import hrs.common.VO.RoomVO;

public class HotelIfOrderedFilter extends HotelFilter{
	
 	@Override
	public void doFilter(Map<HotelVO, List<RoomVO>> hotels) {
 		for(HotelVO hotel:hotels.keySet()){
 			if(hotel.status.size() == 0){
 				hotels.remove(hotel);
 			}
 		}
	}

}
