package hrs.client.Service.HotelService;

import java.util.Date;
import java.util.List;
import java.util.Map;

import hrs.client.VO.HotelVO;
import hrs.client.VO.OrderVO;
import hrs.client.VO.RoomVO;
import hrs.common.util.ResultMessage;
import hrs.common.util.type.RoomType;

public interface HotelService {
	HotelVO findByID(int hotelID);

	ResultMessage update(HotelVO hotelvo);

	ResultMessage add(HotelVO hotelvo);

	Map<HotelVO, List<OrderVO>> findOrderedHotelAndOrder(String username);

	Map<HotelVO, List<RoomVO>> find(int loc, int circle, Date begin, Date end);

	Map<HotelVO, List<RoomVO>> filterName(Map<HotelVO, List<RoomVO>> map, String hotelname);

	Map<HotelVO, List<RoomVO>> filterStar(Map<HotelVO, List<RoomVO>> map, int star);

	Map<HotelVO, List<RoomVO>> filterScore(Map<HotelVO, List<RoomVO>> map, double low, double high);

	Map<HotelVO, List<RoomVO>> orderByStar(Map<HotelVO, List<RoomVO>> map, boolean isDecrease);

	Map<HotelVO, List<RoomVO>> orderByScore(Map<HotelVO, List<RoomVO>> map, boolean isDecrease);

	Map.Entry<HotelVO, List<RoomVO>> displayRoomDetail(Map<HotelVO, List<RoomVO>> map, int hotelID);

	Map<HotelVO, List<RoomVO>> filterIfOrdered(Map<HotelVO, List<RoomVO>> list);

	Map<HotelVO, List<RoomVO>> filterRoomType(Map<HotelVO, List<RoomVO>> map, RoomType roomtype);

	Map<HotelVO, List<RoomVO>> filterValue(Map<HotelVO, List<RoomVO>> map, double low, double high);

	Map<HotelVO, List<RoomVO>> orderByValue(Map<HotelVO, List<RoomVO>> list);

}
