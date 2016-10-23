package hrs.common.VO;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import hrs.common.util.type.OrderStatus;
import hrs.common.util.type.RoomType;

public class OrderVO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public int id;
	public Date placeTime;
	public Date execTime;
	public Date checkinTime;
	public Date expectedCheckoutTime;
	public Date checkoutTime;
	public Date revokeTime;
	public OrderStatus status;
	public HotelVO hotel;
	public double value;
	public RoomType type;
	public int roomNum = 1;
	public boolean hasChild;
	public UserVO user;
	public int score;
	public String evaluation;
	public int peopleNum;
	public Map<HotelDiscountVO,Double> hotelDiscounts = new HashMap<>();
	public Map<WebDiscountVO,Double> webDiscounts = new HashMap<>();
	
	public OrderVO() {
		// TODO Auto-generated constructor stub
	}
	
	public OrderVO(int id, Date placeTime, Date execTime, Date checkinTime, Date expectedCheckoutTime,
			Date checkoutTime, Date revokeTime, OrderStatus status, HotelVO hotel, double value, RoomType type,
			int roomNum, boolean hasChild, UserVO user, int score, String evaluation, int peopleNum) {
		super();
		this.id = id;
		this.placeTime = placeTime;
		this.execTime = execTime;
		this.checkinTime = checkinTime;
		this.expectedCheckoutTime = expectedCheckoutTime;
		this.checkoutTime = checkoutTime;
		this.revokeTime = revokeTime;
		this.status = status;
		this.hotel = hotel;
		this.value = value;
		this.type = type;
		this.roomNum = roomNum;
		this.hasChild = hasChild;
		this.user = user;
		this.score = score;
		this.evaluation = evaluation;
		this.peopleNum = peopleNum;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getPlaceTime() {
		return placeTime;
	}

	public void setPlaceTime(Date placeTime) {
		this.placeTime = placeTime;
	}

	public Date getExecTime() {
		return execTime;
	}

	public void setExecTime(Date execTime) {
		this.execTime = execTime;
	}

	public Date getCheckinTime() {
		return checkinTime;
	}

	public void setCheckinTime(Date checkinTime) {
		this.checkinTime = checkinTime;
	}

	public Date getExpectedCheckoutTime() {
		return expectedCheckoutTime;
	}

	public void setExpectedCheckoutTime(Date expectedCheckoutTime) {
		this.expectedCheckoutTime = expectedCheckoutTime;
	}

	public Date getCheckoutTime() {
		return checkoutTime;
	}

	public void setCheckoutTime(Date checkoutTime) {
		this.checkoutTime = checkoutTime;
	}

	public Date getRevokeTime() {
		return revokeTime;
	}

	public void setRevokeTime(Date revokeTime) {
		this.revokeTime = revokeTime;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public HotelVO getHotel() {
		return hotel;
	}

	public void setHotel(HotelVO hotel) {
		this.hotel = hotel;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
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

	public boolean isHasChild() {
		return hasChild;
	}

	public void setHasChild(boolean hasChild) {
		this.hasChild = hasChild;
	}

	public UserVO getUser() {
		return user;
	}

	public void setUser(UserVO user) {
		this.user = user;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getEvaluation() {
		return evaluation;
	}

	public void setEvaluation(String evaluation) {
		this.evaluation = evaluation;
	}

	public int getPeopleNum() {
		return peopleNum;
	}

	public void setPeopleNum(int peopleNum) {
		this.peopleNum = peopleNum;
	}


	public Map<HotelDiscountVO, Double> getHotelDiscounts() {
		return hotelDiscounts;
	}

	public void setHotelDiscounts(Map<HotelDiscountVO, Double> hotelDiscounts) {
		this.hotelDiscounts = hotelDiscounts;
	}

	public Map<WebDiscountVO, Double> getWebDiscounts() {
		return webDiscounts;
	}

	public void setWebDiscounts(Map<WebDiscountVO, Double> webDiscounts) {
		this.webDiscounts = webDiscounts;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((checkinTime == null) ? 0 : checkinTime.hashCode());
		result = prime * result + ((checkoutTime == null) ? 0 : checkoutTime.hashCode());
		result = prime * result + ((evaluation == null) ? 0 : evaluation.hashCode());
		result = prime * result + ((execTime == null) ? 0 : execTime.hashCode());
		result = prime * result + ((expectedCheckoutTime == null) ? 0 : expectedCheckoutTime.hashCode());
		result = prime * result + (hasChild ? 1231 : 1237);
		result = prime * result + ((hotel == null) ? 0 : hotel.hashCode());
		result = prime * result + ((hotelDiscounts == null) ? 0 : hotelDiscounts.hashCode());
		result = prime * result + id;
		result = prime * result + peopleNum;
		result = prime * result + ((placeTime == null) ? 0 : placeTime.hashCode());
		result = prime * result + ((revokeTime == null) ? 0 : revokeTime.hashCode());
		result = prime * result + roomNum;
		result = prime * result + score;
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		long temp;
		temp = Double.doubleToLongBits(value);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((webDiscounts == null) ? 0 : webDiscounts.hashCode());
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
		OrderVO other = (OrderVO) obj;
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
		if (evaluation == null) {
			if (other.evaluation != null)
				return false;
		} else if (!evaluation.equals(other.evaluation))
			return false;
		if (execTime == null) {
			if (other.execTime != null)
				return false;
		} else if (!execTime.equals(other.execTime))
			return false;
		if (expectedCheckoutTime == null) {
			if (other.expectedCheckoutTime != null)
				return false;
		} else if (!expectedCheckoutTime.equals(other.expectedCheckoutTime))
			return false;
		if (hasChild != other.hasChild)
			return false;
		if (hotel == null) {
			if (other.hotel != null)
				return false;
		} else if (!hotel.equals(other.hotel))
			return false;
		if (hotelDiscounts == null) {
			if (other.hotelDiscounts != null)
				return false;
		} else if (!hotelDiscounts.equals(other.hotelDiscounts))
			return false;
		if (id != other.id)
			return false;
		if (peopleNum != other.peopleNum)
			return false;
		if (placeTime == null) {
			if (other.placeTime != null)
				return false;
		} else if (!placeTime.equals(other.placeTime))
			return false;
		if (revokeTime == null) {
			if (other.revokeTime != null)
				return false;
		} else if (!revokeTime.equals(other.revokeTime))
			return false;
		if (roomNum != other.roomNum)
			return false;
		if (score != other.score)
			return false;
		if (status != other.status)
			return false;
		if (type != other.type)
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		if (Double.doubleToLongBits(value) != Double.doubleToLongBits(other.value))
			return false;
		if (webDiscounts == null) {
			if (other.webDiscounts != null)
				return false;
		} else if (!webDiscounts.equals(other.webDiscounts))
			return false;
		return true;
	}
	
}
