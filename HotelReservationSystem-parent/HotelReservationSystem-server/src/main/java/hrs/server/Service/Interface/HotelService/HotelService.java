package hrs.server.Service.Interface.HotelService;

import java.util.Date;
import java.util.List;
import java.util.Map;

import hrs.common.VO.HotelVO;
import hrs.common.VO.OrderVO;
import hrs.common.VO.RoomVO;
import hrs.common.util.ResultMessage;
import hrs.common.util.FilterCondition.FilterCondition;
import hrs.common.util.type.OrderRule;

public interface HotelService {
	HotelVO findByID(int hotelID);

	ResultMessage update(HotelVO hotelvo);

	ResultMessage add(HotelVO hotelvo);

	Map<HotelVO, List<OrderVO>> findOrderedHotelAndOrder(String username);

	Map<HotelVO, List<RoomVO>> find(int loc, int circle, Date begin, Date end);

	Map<HotelVO, List<RoomVO>> filter(List<FilterCondition> conditions);

	Map<HotelVO, List<RoomVO>> order(OrderRule rule, boolean isDecrease);

	List<RoomVO> getRoomDetail(int hotelID);

	ResultMessage addRemark(HotelVO hotel, int score);
}
