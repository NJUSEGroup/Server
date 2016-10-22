package hrs.common.VO;

import java.io.Serializable;
import java.util.Date;

import hrs.common.util.type.WebsiteDiscountType;

public  class WebDiscountVO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public int id;
	public double discount;
	public WebsiteDiscountType type;
	public CommercialCircleVO commercialCircle;
	public Date beginTime;
	public Date endTime;
	public int VIPlevel;
	
	public WebDiscountVO() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public WebsiteDiscountType getType() {
		return type;
	}

	public void setType(WebsiteDiscountType type) {
		this.type = type;
	}

	public CommercialCircleVO getCommercialCircle() {
		return commercialCircle;
	}

	public void setCommercialCircle(CommercialCircleVO commercialCircle) {
		this.commercialCircle = commercialCircle;
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

	public int getVIPlevel() {
		return VIPlevel;
	}

	public void setVIPlevel(int vIPlevel) {
		VIPlevel = vIPlevel;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + VIPlevel;
		result = prime * result + ((beginTime == null) ? 0 : beginTime.hashCode());
		result = prime * result + ((commercialCircle == null) ? 0 : commercialCircle.hashCode());
		long temp;
		temp = Double.doubleToLongBits(discount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((endTime == null) ? 0 : endTime.hashCode());
		result = prime * result + id;
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
		WebDiscountVO other = (WebDiscountVO) obj;
		if (VIPlevel != other.VIPlevel)
			return false;
		if (beginTime == null) {
			if (other.beginTime != null)
				return false;
		} else if (!beginTime.equals(other.beginTime))
			return false;
		if (commercialCircle == null) {
			if (other.commercialCircle != null)
				return false;
		} else if (!commercialCircle.equals(other.commercialCircle))
			return false;
		if (Double.doubleToLongBits(discount) != Double.doubleToLongBits(other.discount))
			return false;
		if (endTime == null) {
			if (other.endTime != null)
				return false;
		} else if (!endTime.equals(other.endTime))
			return false;
		if (id != other.id)
			return false;
		if (type != other.type)
			return false;
		return true;
	}
	
	
}
