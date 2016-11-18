package hrs.server.Service.Impl.HotelService.HotelFilter;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import hrs.common.Exception.OrderService.OrderNotFoundException;
import hrs.common.VO.HotelVO;
import hrs.common.VO.RoomVO;
import hrs.common.util.FilterCondition.IfOrderedFilterCondition;
import hrs.server.Service.Interface.OrderService.OrderSearchService;

public class HotelIfOrderedFilter extends HotelFilter{
	@Autowired
	private OrderSearchService service;
	
 	@Override
	public void doFilter(Map<HotelVO, List<RoomVO>> hotels) {
 		IfOrderedFilterCondition condition = (IfOrderedFilterCondition) super.condition;
 		
 		for(HotelVO hotel:hotels.keySet()){
 			try{
 				service.findByHotelAndUsername(hotel.id, condition.getUsername());
 			}catch(OrderNotFoundException e){
 				hotels.remove(hotel);
 			}
 		}
	}

}
