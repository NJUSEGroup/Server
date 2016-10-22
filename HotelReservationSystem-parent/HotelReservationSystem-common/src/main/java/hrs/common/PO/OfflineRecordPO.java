package hrs.common.PO;

import java.io.Serializable;
import java.util.Date;

import hrs.common.util.type.RoomType;

public class OfflineRecordPO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private HotelPO hotel;
	private Date checkinTime;
	private Date expectedCheckoutTime;
	private Date checkoutTime;
	private RoomType type;
	private int num;
	public OfflineRecordPO() {
		// TODO Auto-generated constructor stub
	}
	
	public OfflineRecordPO(int id, HotelPO hotel, Date checkinTime, Date expectedCheckoutTime, Date checkoutTime,
			RoomType type, int num) {
		super();
		this.id = id;
		this.hotel = hotel;
		this.checkinTime = checkinTime;
		this.expectedCheckoutTime = expectedCheckoutTime;
		this.checkoutTime = checkoutTime;
		this.type = type;
		this.num = num;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public HotelPO getHotel() {
		return hotel;
	}
	public void setHotel(HotelPO hotel) {
		this.hotel = hotel;
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
