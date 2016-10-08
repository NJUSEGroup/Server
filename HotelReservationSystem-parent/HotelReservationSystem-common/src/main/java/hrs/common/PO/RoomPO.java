package hrs.common.PO;

import java.io.Serializable;

import hrs.common.util.RoomType;

public class RoomPO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int hotelId;
	private RoomType type;

	private int roomNum;
	private double roomValue;

	public RoomPO() {
		// TODO Auto-generated constructor stub
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

}
