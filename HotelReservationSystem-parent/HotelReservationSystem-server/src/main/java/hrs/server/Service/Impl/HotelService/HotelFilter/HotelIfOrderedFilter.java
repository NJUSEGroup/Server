package hrs.server.Service.Impl.HotelService.HotelFilter;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import hrs.common.VO.HotelVO;
import hrs.common.VO.RoomVO;

public class HotelIfOrderedFilter extends HotelFilter{
	
 	@Override
	public void doFilter(Map<HotelVO, List<RoomVO>> hotels) {
 		Iterator<HotelVO> it = hotels.keySet().iterator();
		HotelVO vo = null;
 		while(it.hasNext()){
 			vo = it.next();
 			if(vo.status.size() == 0){
 				it.remove();
 			}
 		}
	}

}
