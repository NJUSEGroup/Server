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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((hotel == null) ? 0 : hotel.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
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
		StaffVO other = (StaffVO) obj;
		if (hotel == null) {
			if (other.hotel != null)
				return false;
		} else if (!hotel.equals(other.hotel))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (type != other.type)
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "StaffVO [id=" + id + ", username=" + username + ", password=" + password + ", name=" + name + ", type="
				+ type + ", hotel=" + hotel + "]";
	}
	
	

}

