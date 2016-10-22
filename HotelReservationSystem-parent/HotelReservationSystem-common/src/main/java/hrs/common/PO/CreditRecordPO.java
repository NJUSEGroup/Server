package hrs.common.PO;

import java.io.Serializable;

import hrs.common.util.type.CreditRecordType;

public class CreditRecordPO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private OrderPO order;
	private UserPO user;
	private CreditRecordType type;
	private int variation;
	private int currCredit;

	public CreditRecordPO() {
		// TODO Auto-generated constructor stub
	}
	
	public CreditRecordPO(int id, OrderPO order, UserPO user, CreditRecordType type, int variation, int currCredit) {
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

	public OrderPO getOrder() {
		return order;
	}

	public void setOrder(OrderPO order) {
		this.order = order;
	}

	public UserPO getUser() {
		return user;
	}

	public void setUser(UserPO user) {
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
