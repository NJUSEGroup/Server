package hrs.client.VO;

import java.io.Serializable;
import java.util.Date;

import hrs.common.util.type.HotelDiscountType;

public  class HotelDiscountVO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public int id;
	public int hotelId;
	public double discount;
	public HotelDiscountType type;
	public int enterpriseId;//合作企业
	public int minQty;//满几间房有优惠
	public Date beginTime;//特定期间优惠
	public Date endTime;
	
	public HotelDiscountVO() {
		// TODO Auto-generated constructor stub
	}
	public HotelDiscountVO(int id, int hotelId, double discount, HotelDiscountType type, int enterpriseId, int minQty,
			Date beginTime, Date endTime) {
		super();
		this.id = id;
		this.hotelId = hotelId;
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((beginTime == null) ? 0 : beginTime.hashCode());
		long temp;
		temp = Double.doubleToLongBits(discount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((endTime == null) ? 0 : endTime.hashCode());
		result = prime * result + enterpriseId;
		result = prime * result + hotelId;
		result = prime * result + id;
		result = prime * result + minQty;
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
		HotelDiscountVO other = (HotelDiscountVO) obj;
		if (beginTime == null) {
			if (other.beginTime != null)
				return false;
		} else if (!beginTime.equals(other.beginTime))
			return false;
		if (Double.doubleToLongBits(discount) != Double.doubleToLongBits(other.discount))
			return false;
		if (endTime == null) {
			if (other.endTime != null)
				return false;
		} else if (!endTime.equals(other.endTime))
			return false;
		if (enterpriseId != other.enterpriseId)
			return false;
		if (hotelId != other.hotelId)
			return false;
		if (id != other.id)
			return false;
		if (minQty != other.minQty)
			return false;
		if (type != other.type)
			return false;
		return true;
	}
	
}
