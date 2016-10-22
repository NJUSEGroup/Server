package hrs.common.PO;

import java.io.Serializable;
import java.util.Date;

import hrs.common.util.type.WebsiteDiscountType;

public  class WebDiscountPO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private double discount;
	private boolean status;
	private WebsiteDiscountType type;
	private CommercialCirclePO commercialCircle;
	private Date beginTime;
	private Date endTime;
	private int VIPlevel;
	
	public WebDiscountPO() {
		// TODO Auto-generated constructor stub
	}

	public WebDiscountPO(int id, double discount, boolean status, WebsiteDiscountType type,
			CommercialCirclePO commercialCircle, Date beginTime, Date endTime, int vIPlevel) {
		super();
		this.id = id;
		this.discount = discount;
		this.status = status;
		this.type = type;
		this.commercialCircle = commercialCircle;
		this.beginTime = beginTime;
		this.endTime = endTime;
		VIPlevel = vIPlevel;
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

	public WebsiteDiscountType getType() {
		return type;
	}

	public void setType(WebsiteDiscountType type) {
		this.type = type;
	}

	public CommercialCirclePO getCommercialCircle() {
		return commercialCircle;
	}

	public void setCommercialCircle(CommercialCirclePO commercialCircle) {
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
	
}
