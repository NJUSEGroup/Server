package hrs.common.Controller.UserController;

import java.util.Date;
import java.util.List;
import java.util.Map;

import hrs.common.Exception.HotelService.HotelNotFoundException;
import hrs.common.VO.CommercialCircleVO;
import hrs.common.VO.HotelVO;
import hrs.common.VO.LocationVO;
import hrs.common.VO.OrderVO;
import hrs.common.VO.RoomVO;
import hrs.common.util.FilterCondition.FilterCondition;
import hrs.common.util.type.OrderRule;

public interface IUserHotelController {

	/**
	 * 前两个方法是为了显示酒店详细信息准备的
	 * 
	 * @param hotelID
	 * @param username
	 * @return
	 */
	List<OrderVO> findOrderByHotelAndUsername(int hotelID, String username);

	List<RoomVO> getRoomDetail(int hotelID) throws HotelNotFoundException;

	Map<HotelVO, List<OrderVO>> findOrderedHotelAndOrder(String username);

	Map<HotelVO, List<RoomVO>> findHotels(int loc, int circle, Date begin, Date end,String username) throws HotelNotFoundException;

	Map<HotelVO, List<RoomVO>> filterHotels(List<FilterCondition> conditions);

	Map<HotelVO, List<RoomVO>> orderHotels(OrderRule rule, boolean isDecrease);

	List<LocationVO> findAllLocations();

	List<CommercialCircleVO> findCircleByLoc(int locID);

}
