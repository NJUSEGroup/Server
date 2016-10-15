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

	List<Map<HotelVO, List<OrderVO>>> findOrderedHotelAndOrder(String username);

	List<Map<HotelVO, List<RoomVO>>> find(String loc, String circle, Date begin, Date end);

	List<Map<HotelVO, List<RoomVO>>> filterName(List<Map<HotelVO, List<RoomVO>>> list, String hotelname);

	List<Map<HotelVO, List<RoomVO>>> filterStar(List<Map<HotelVO, List<RoomVO>>> list, int star);

	List<Map<HotelVO, List<RoomVO>>> filterScore(List<Map<HotelVO, List<RoomVO>>> list, double low, double high);
	List<Map<HotelVO,List<RoomVO>>> orderByStar(List<Map<HotelVO,List<RoomVO>>> list,boolean isDecrease);
	List<Map<HotelVO,List<RoomVO>>> orderByScore(List<Map<HotelVO,List<RoomVO>>> list,boolean isDecrease);
	Map<HotelVO,List<RoomVO>> displayRoomDetail(List<Map<HotelVO,List<RoomVO>>> list,int hotelID);
	Map<HotelVO,List<OrderVO>>	displayOrderDetail(int hotelID,String username);
	List<Map<HotelVO,List<RoomVO>>> filterIfOrdered(List<Map<HotelVO,List<RoomVO>>> list);
	List<Map<HotelVO,List<RoomVO>>> filterRoomType(List<Map<HotelVO,List<RoomVO>>> list,RoomType roomtype);
	List<Map<HotelVO,List<RoomVO>>>	filterValue(List<Map<HotelVO,List<RoomVO>>> list,double low,double high);
	List<Map<HotelVO,List<RoomVO>>>  orderByValue(List<Map<HotelVO,List<RoomVO>>> list);
	

	

	

}
