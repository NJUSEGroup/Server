package hrs.common.PO;

import java.io.Serializable;
import java.util.Date;

import hrs.common.util.type.OrderStatus;
import hrs.common.util.type.RoomType;

public class OrderPO implements Serializable {
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
	private HotelPO hotel;
	private double value;
	private RoomType type;
	private int roomNum;
	private boolean hasChild;
	private UserPO user;
	private int score;
	private String evaluation;
	private int peopleNum;

	public OrderPO() {
		// TODO Auto-generated constructor stub
	}

	public OrderPO(int id, Date placeTime, Date execTime, Date checkinTime, Date expectedCheckoutTime,
			Date checkoutTime, Date revokeTime, OrderStatus status, HotelPO hotel, double value, RoomType type, int num,
			boolean hasChild, UserPO user, int score, String evaluation) {
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
		this.roomNum = num;
		this.hasChild = hasChild;
		this.user = user;
		this.score = score;
		this.evaluation = evaluation;
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

	public HotelPO getHotel() {
		return hotel;
	}

	public void setHotel(HotelPO hotel) {
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

	public int getNum() {
		return roomNum;
	}

	public void setNum(int num) {
		this.roomNum = num;
	}

	public boolean isHasChild() {
		return hasChild;
	}

	public void setHasChild(boolean hasChild) {
		this.hasChild = hasChild;
	}

	public UserPO getUser() {
		return user;
	}

	public void setUser(UserPO user) {
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
}
