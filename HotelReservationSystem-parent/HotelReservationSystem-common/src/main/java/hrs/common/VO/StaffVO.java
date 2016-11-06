package hrs.common.VO;

import java.io.Serializable;

import hrs.common.util.type.StaffType;

public class StaffVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public int id;
	public String username;
	public String password;
	public String name;
	public StaffType type;
	public HotelVO hotel;

	public StaffVO() {
		// TODO Auto-generated constructor stub
	}
	
	public StaffVO(String username, String password, String name, StaffType type, HotelVO hotel) {
		super();
		this.username = username;
		this.password = password;
		this.name = name;
		this.type = type;
		this.hotel = hotel;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public StaffType getType() {
		return type;
	}

	public void setType(StaffType type) {
		this.type = type;
	}

	public HotelVO getHotel() {
		return hotel;
	}

	public void setHotel(HotelVO hotel) {
		this.hotel = hotel;
	}
	
	

}

