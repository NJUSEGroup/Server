package hrs.client.VO;

import java.io.Serializable;
import java.util.List;

import hrs.common.util.type.OrderStatus;

public class HotelVO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private int star;
	private double score;
	private String loc;
	private String commCircle;
	private String profile;
	private String service;
	private List<OrderStatus> status;// 只在VO中，没有在PO中

	public HotelVO() {
		// TODO Auto-generated constructor stub
	}

	public List<OrderStatus> getStatus() {
		return status;
	}

	public void setStatus(List<OrderStatus> status) {
		this.status = status;
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

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public String getCommCircle() {
		return commCircle;
	}

	public void setCommCircle(String commCircle) {
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((commCircle == null) ? 0 : commCircle.hashCode());
		result = prime * result + id;
		result = prime * result + ((loc == null) ? 0 : loc.hashCode());
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
		if (commCircle == null) {
			if (other.commCircle != null)
				return false;
		} else if (!commCircle.equals(other.commCircle))
			return false;
		if (id != other.id)
			return false;
		if (loc == null) {
			if (other.loc != null)
				return false;
		} else if (!loc.equals(other.loc))
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
