package hrs.client.VO;

import java.io.Serializable;

import hrs.common.util.type.RoomType;

public class RoomVO implements Serializable {
	public RoomVO(int hotelId, RoomType type, int roomNum, double roomValue) {
		super();
		this.hotelId = hotelId;
		this.type = type;
		this.roomNum = roomNum;
		this.roomValue = roomValue;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public int hotelId;
	public RoomType type;
	public int roomNum;
	public double roomValue;
	public int availRoomNum;

	public RoomVO() {
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

	public int getAvailRoomNum() {
		return availRoomNum;
	}

	public void setAvailRoomNum(int availRoomNum) {
		this.availRoomNum = availRoomNum;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + hotelId;
		result = prime * result + roomNum;
		long temp;
		temp = Double.doubleToLongBits(roomValue);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RoomVO other = (RoomVO) obj;
		if (hotelId != other.hotelId)
			return false;
		if (roomNum != other.roomNum)
			return false;
		if (Double.doubleToLongBits(roomValue) != Double.doubleToLongBits(other.roomValue))
			return false;
		if (type != other.type)
			return false;
		return true;
	}

}
