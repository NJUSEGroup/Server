package hrs.common.VO;

import java.io.Serializable;

import hrs.common.util.type.RoomType;

public class RoomVO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public int id;
	public int hotelId;
	public RoomType type;
	public int roomNum;
	public double roomValue;
	public int availableRoomNum;
	
	public RoomVO(int hotelId, RoomType type, int roomNum, double roomValue,int availableRoomNum) {
		super();
		this.hotelId = hotelId;
		this.type = type;
		this.roomNum = roomNum;
		this.roomValue = roomValue;
		this.availableRoomNum = availableRoomNum;
	}

	public RoomVO() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getHotelId() {
		return hotelId;
	}

	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}

	public RoomType getType() {
		return type;
	}

	public void setType(RoomType type) {
		this.type = type;
	}

	public int getRoomNum() {
		return roomNum;
	}

	public void setRoomNum(int roomNum) {
		this.roomNum = roomNum;
	}

	public double getRoomValue() {
		return roomValue;
	}

	public void setRoomValue(double roomValue) {
		this.roomValue = roomValue;
	}
	public int getAvailableRoomNum() {
		return availableRoomNum;
	}

	public void setAvailableRoomNum(int availableRoomNum) {
		this.availableRoomNum = availableRoomNum;
	}

	public RoomVO(int id, int hotelId, RoomType type, int roomNum, double roomValue, int availableRoomNum) {
		super();
		this.id = id;
		this.hotelId = hotelId;
		this.type = type;
		this.roomNum = roomNum;
		this.roomValue = roomValue;
		this.availableRoomNum = availableRoomNum;
	}
	

}
