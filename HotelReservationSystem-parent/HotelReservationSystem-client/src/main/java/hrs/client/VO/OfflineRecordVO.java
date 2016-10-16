package hrs.client.VO;

import java.io.Serializable;
import java.util.Date;

import hrs.common.util.type.RoomType;

public class OfflineRecordVO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public int id;
	public int hotelId;
	public Date checkinTime;
	public Date expectedCheckoutTime;
	public Date checkoutTime;
	public RoomType type;
	public int num;
	public OfflineRecordVO() {
		// TODO Auto-generated constructor stub
	}
	public OfflineRecordVO(int id, int hotelId, Date inDate, Date expectedOutDate, Date outDate, RoomType type, int num){
		this.id = id;
		this.hotelId = hotelId;
		this.checkinTime = inDate;
		this.expectedCheckoutTime = expectedOutDate;
		this.checkoutTime = outDate;
		this.type = type;
		this.num = num;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((checkinTime == null) ? 0 : checkinTime.hashCode());
		result = prime * result + ((checkoutTime == null) ? 0 : checkoutTime.hashCode());
		result = prime * result + ((expectedCheckoutTime == null) ? 0 : expectedCheckoutTime.hashCode());
		result = prime * result + hotelId;
		result = prime * result + id;
		result = prime * result + num;
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
		OfflineRecordVO other = (OfflineRecordVO) obj;
		if (checkinTime == null) {
			if (other.checkinTime != null)
				return false;
		} else if (!checkinTime.equals(other.checkinTime))
			return false;
		if (checkoutTime == null) {
			if (other.checkoutTime != null)
				return false;
		} else if (!checkoutTime.equals(other.checkoutTime))
			return false;
		if (expectedCheckoutTime == null) {
			if (other.expectedCheckoutTime != null)
				return false;
		} else if (!expectedCheckoutTime.equals(other.expectedCheckoutTime))
			return false;
		if (hotelId != other.hotelId)
			return false;
		if (id != other.id)
			return false;
		if (num != other.num)
			return false;
		if (type != other.type)
			return false;
		return true;
	}
	
}
