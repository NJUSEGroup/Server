package hrs.common.VO;

import java.io.Serializable;

import hrs.common.util.type.RoomType;

public class RoomVO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public  HotelVO hotel;
	public RoomType type;
	public int roomNum;
	public double roomValue;
	public int availableRoomNum;
	
	public RoomVO(HotelVO hotel, RoomType type, int roomNum, double roomValue) {
		super();
		this.hotel = hotel;
		this.type = type;
		this.roomNum = roomNum;
		this.roomValue = roomValue;
	}
	
	public RoomVO() {
	}

	public HotelVO getHotel() {
		return hotel;
	}
	public void setHotel(HotelVO hotel) {
		this.hotel = hotel;
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + availableRoomNum;
		result = prime * result + ((hotel == null) ? 0 : hotel.hashCode());
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
		if (availableRoomNum != other.availableRoomNum)
			return false;
		if (hotel == null) {
			if (other.hotel != null)
				return false;
		} else if (!hotel.equals(other.hotel))
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
