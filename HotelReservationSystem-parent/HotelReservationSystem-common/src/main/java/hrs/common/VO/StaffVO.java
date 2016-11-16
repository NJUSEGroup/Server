package hrs.common.VO;

import java.io.Serializable;

import hrs.common.POJO.StaffPO;
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
	
	public StaffVO(StaffPO po){
		this.id = po.getId();
		this.username = po.getUsername();
		this.password = po.getPassword();
		this.name = po.getName();
		this.type = po.getType();
		this.hotel = po.getHotel() != null ? new HotelVO(po.getHotel(),this):null;
	}
	
	public StaffVO(String username, String password, String name, StaffType type, HotelVO hotel) {
		super();
		this.username = username;
		this.password = password;
		this.name = name;
		this.type = type;
		this.hotel = hotel;
	}

	
	@Override
	public String toString() {
		return "StaffVO [id=" + id + ", username=" + username + ", password=" + password + ", name=" + name + ", type="
				+ type + ", hotel=" + hotel + "]";
	}
	
	

}

