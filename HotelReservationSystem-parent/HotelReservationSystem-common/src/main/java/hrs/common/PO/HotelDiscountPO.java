package hrs.common.PO;

import java.io.Serializable;
import java.util.Date;

import hrs.common.util.type.HotelDiscountType;

public  class HotelDiscountPO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private HotelPO hotel;
	private double discount;
	private HotelDiscountType type;
	private int enterpriseId;//合作企业
	private int minQty;//满几间房有优惠
	private Date beginTime;//特定期间优惠
	private Date endTime;
	public HotelDiscountPO() {
		// TODO Auto-generated constructor stub
	}
	
	public HotelDiscountPO(int id, HotelPO hotel, double discount, HotelDiscountType type, int enterpriseId, int minQty,
			Date beginTime, Date endTime) {
		super();
		this.id = id;
		this.hotel = hotel;
		this.discount = discount;
		this.type = type;
		this.enterpriseId = enterpriseId;
		this.minQty = minQty;
		this.beginTime = beginTime;
		this.endTime = endTime;
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
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public HotelDiscountType getType() {
		return type;
	}
	public void setType(HotelDiscountType type) {
		this.type = type;
	}
	public int getEnterpriseId() {
		return enterpriseId;
	}
	public void setEnterpriseId(int enterpriseId) {
		this.enterpriseId = enterpriseId;
	}
	public int getMinQty() {
		return minQty;
	}
	public void setMinQty(int minQty) {
		this.minQty = minQty;
	}
	public Date getBeginTime() {
		return beginTime;
	}
	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
		
}
