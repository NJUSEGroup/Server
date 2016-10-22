package hrs.common.VO;

import java.io.Serializable;

import hrs.common.util.type.CreditRecordType;

public class CreditRecordVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public int id;
	public OrderVO order;
	public UserVO user;
	public CreditRecordType type;
	public int variation;
	public int currCredit;

	public CreditRecordVO() {
		// TODO Auto-generated constructor stub
	}
	
	public CreditRecordVO(int id, OrderVO order, UserVO user, CreditRecordType type, int variation, int currCredit) {
		super();
		this.id = id;
		this.order = order;
		this.user = user;
		this.type = type;
		this.variation = variation;
		this.currCredit = currCredit;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public OrderVO getOrder() {
		return order;
	}

	public void setOrder(OrderVO order) {
		this.order = order;
	}

	public UserVO getUser() {
		return user;
	}

	public void setUser(UserVO user) {
		this.user = user;
	}

	public CreditRecordType getType() {
		return type;
	}

	public void setType(CreditRecordType type) {
		this.type = type;
	}

	public int getVariation() {
		return variation;
	}

	public void setVariation(int variation) {
		this.variation = variation;
	}

	public int getCurrCredit() {
		return currCredit;
	}

	public void setCurrCredit(int currCredit) {
		this.currCredit = currCredit;
	}
	
}
