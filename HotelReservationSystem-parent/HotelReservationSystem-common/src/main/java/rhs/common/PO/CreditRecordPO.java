package rhs.common.PO;

import java.io.Serializable;

import rhs.common.util.CreditRecordType;

public class CreditRecordPO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String username;
	private CreditRecordType type;
	private int variation;
	private int currCredit;
	public CreditRecordPO() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
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
