package hrs.server.Service.Interface.HotelService.Filter;

import hrs.common.Controller.UserController.FilterCondition;
import hrs.common.util.type.FilterType;
import hrs.common.util.type.RoomType;

public class RoomTypeFilterCondition extends FilterCondition {
	private RoomType roomType;

	public RoomType getRoomType() {
		return roomType;
	}

	public void setRoomType(RoomType roomType) {
		this.roomType = roomType;
	}

	public RoomTypeFilterCondition(FilterType type) {
		super(type);
		// TODO Auto-generated constructor stub
	}

}
