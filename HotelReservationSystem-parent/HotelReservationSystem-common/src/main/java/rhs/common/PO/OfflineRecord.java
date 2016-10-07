package rhs.common.PO;

import java.io.Serializable;
import java.util.Date;

import rhs.common.util.RoomType;

public class OfflineRecord implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private int hotelId;
	private Date checkinTime;
	private Date expectedCheckoutTime;
	private Date checkoutTime;
	private RoomType type;
	private int num;
	public OfflineRecord() {
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
	
}
