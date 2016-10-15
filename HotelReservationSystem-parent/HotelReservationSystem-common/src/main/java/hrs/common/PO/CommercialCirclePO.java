package hrs.common.PO;

import java.io.Serializable;

import hrs.common.util.IDTemplate;

public class CommercialCirclePO implements Serializable,IDTemplate {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private int locId;

	private String name;

	public CommercialCirclePO() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getLocId() {
		return locId;
	}

	public void setLocId(int locId) {
		this.locId = locId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + locId;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		CommercialCirclePO other = (CommercialCirclePO) obj;
		if (id != other.id)
			return false;
		if (locId != other.locId)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
