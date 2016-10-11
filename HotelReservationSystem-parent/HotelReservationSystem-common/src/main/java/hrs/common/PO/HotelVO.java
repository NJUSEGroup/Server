package hrs.common.PO;

import java.io.Serializable;
import java.util.List;

import hrs.common.util.OrderStatus;

public class HotelVO implements Serializable{
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
	private List<OrderStatus> status;//只在VO中，没有在PO中
	public HotelVO() {
		// TODO Auto-generated constructor stub
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
	public static void main(String[] args) {
		
	}
}
