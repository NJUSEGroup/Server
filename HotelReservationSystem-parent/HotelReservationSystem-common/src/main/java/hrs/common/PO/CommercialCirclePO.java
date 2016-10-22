package hrs.common.PO;

import java.io.Serializable;

import hrs.common.util.IDTemplate;

public class CommercialCirclePO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private LocationPO location;
	private String name;

	public CommercialCirclePO(int id, LocationPO loc, String name) {
		super();
		this.id = id;
		this.location = loc;
		this.name = name;
	}

	public CommercialCirclePO() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocationPO getLocation() {
		return location;
	}

	public void setLocation(LocationPO location) {
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
