package hrs.client.VO;

import java.io.Serializable;
import java.util.List;

import hrs.common.util.type.OrderStatus;

public class HotelVO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public int id;
	public String name;
	public int star;
	public double score;
	public int loc;
	public int commCircle;
	public String profile;
	public String service;
	public List<OrderStatus> status;// 只在VO中，没有在PO中

	public HotelVO() {
		// TODO Auto-generated constructor stub
	}

	public HotelVO(int id, String name, int loc, int commCircle) {
		super();
		this.id = id;
		this.name = name;
		this.loc = loc;
		this.commCircle = commCircle;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStar() {
		return star;
	}

	public void setStar(int star) {
		this.star = star;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public int getLoc() {
		return loc;
	}

	public void setLoc(int loc) {
		this.loc = loc;
	}

	public int getCommCircle() {
		return commCircle;
	}

	public void setCommCircle(int commCircle) {
		this.commCircle = commCircle;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public List<OrderStatus> getStatus() {
		return status;
	}

	public void setStatus(List<OrderStatus> status) {
		this.status = status;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + commCircle;
		result = prime * result + id;
		result = prime * result + loc;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((profile == null) ? 0 : profile.hashCode());
		long temp;
		temp = Double.doubleToLongBits(score);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((service == null) ? 0 : service.hashCode());
		result = prime * result + star;
		result = prime * result + ((status == null) ? 0 : status.hashCode());
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
		HotelVO other = (HotelVO) obj;
		if (commCircle != other.commCircle)
			return false;
		if (id != other.id)
			return false;
		if (loc != other.loc)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (profile == null) {
			if (other.profile != null)
				return false;
		} else if (!profile.equals(other.profile))
			return false;
		if (Double.doubleToLongBits(score) != Double.doubleToLongBits(other.score))
			return false;
		if (service == null) {
			if (other.service != null)
				return false;
		} else if (!service.equals(other.service))
			return false;
		if (star != other.star)
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		return true;
	}

}
