package rhs.common.PO;

import java.io.Serializable;
import java.util.Date;

import rhs.common.util.WebsiteDiscountType;

public  class WebDiscountPO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private double discount;
	private boolean status;
	private WebsiteDiscountType type;
	private String commercialCircle;
	private Date beginTime;
	private Date endTime;
	private int VIPlevel;
	

	public String getCommercialCircle() {
		return commercialCircle;
	}

	public void setCommercialCircle(String commercialCircle) {
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

	public WebsiteDiscountType getType() {
		return type;
	}

	public void setType(WebsiteDiscountType type) {
		this.type = type;
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

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
