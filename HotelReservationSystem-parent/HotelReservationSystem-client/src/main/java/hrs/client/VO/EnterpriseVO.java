package hrs.client.VO;

import java.io.Serializable;

public class EnterpriseVO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public int id;
	public String name;
	public EnterpriseVO() {
		// TODO Auto-generated constructor stub
	}
	public EnterpriseVO(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		EnterpriseVO other = (EnterpriseVO) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}
