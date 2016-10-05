package rhs.common.PO;

import java.util.Date;

public class UserPO {
	private String username;
	private String password;
	private String phone;
	private String name;
	private int credit;
	private Date birthDate;
	private String enterprise;
	private int VIPLevel;
	public UserPO() {
		// TODO Auto-generated constructor stub
	}
	
	public UserPO(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public String getEnterprise() {
		return enterprise;
	}
	public void setEnterprise(String enterprise) {
		this.enterprise = enterprise;
	}
	public int getVIPLevel() {
		return VIPLevel;
	}
	public void setVIPLevel(int vIPLevel) {
		VIPLevel = vIPLevel;
	}
	
}
