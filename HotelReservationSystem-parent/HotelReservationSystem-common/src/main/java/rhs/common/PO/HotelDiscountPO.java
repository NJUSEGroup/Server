package rhs.common.PO;

import java.io.Serializable;
import java.util.Date;

import rhs.common.util.HotelDiscountType;

public  class HotelDiscountPO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private int hotelId;
	private double discount;
	private HotelDiscountType type;
	private int enterpriseId;//合作企业
	private int minQty;//满几间房有优惠
	private Date beginTime;//特定期间优惠
	private Date endTime;
	
	
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
	
}
