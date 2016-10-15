package hrs.client.VO;

import java.io.Serializable;
import java.util.Date;

import hrs.common.util.type.OrderStatus;
import hrs.common.util.type.RoomType;

public class OrderVO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private Date placeTime;
	private Date execTime;
	private Date checkinTime;
	private Date expectedCheckoutTime;
	private Date checkoutTime;
	private Date revokeTime;
	private OrderStatus status;
	private int  hotelID;
	public int getHotelID() {
		return hotelID;
	}
	public void setHotelID(int hotelID) {
		this.hotelID = hotelID;
	}
	private double value;
	private RoomType type;
	private int num;
	private boolean hasChild;
	private String username;
	private int score;
	private String evaluation;
	public OrderVO() {
		// TODO Auto-generated constructor stub
	}
	
	
	public OrderVO(int id, Date execTime, Date expectedCheckoutTime, OrderStatus status, int hotelID, double value,
			RoomType type, int num, boolean hasChild, String username) {
		super();
		this.id = id;
		this.execTime = execTime;
		this.expectedCheckoutTime = expectedCheckoutTime;
		this.status = status;
		this.hotelID = hotelID;
		this.value = value;
		this.type = type;
		this.num = num;
		this.hasChild = hasChild;
		this.username = username;
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
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public boolean isHasChild() {
		return hasChild;
	}
	public void setHasChild(boolean hasChild) {
		this.hasChild = hasChild;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
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
		result = prime * result + hotelID;
		result = prime * result + id;
		result = prime * result + num;
		result = prime * result + ((placeTime == null) ? 0 : placeTime.hashCode());
		result = prime * result + ((revokeTime == null) ? 0 : revokeTime.hashCode());
		result = prime * result + score;
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		long temp;
		temp = Double.doubleToLongBits(value);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		if (hotelID != other.hotelID)
			return false;
		if (id != other.id)
			return false;
		if (num != other.num)
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
		if (score != other.score)
			return false;
		if (status != other.status)
			return false;
		if (type != other.type)
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		if (Double.doubleToLongBits(value) != Double.doubleToLongBits(other.value))
			return false;
		return true;
	}
	
	
}
