package hrs.client.VO;

import java.io.Serializable;

import hrs.common.util.type.CreditRecordType;

public class CreditRecordVO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public int id;
	public String username;
	public CreditRecordType type;
	public int variation;
	public int currCredit;
	
	
	public CreditRecordVO() {
		// TODO Auto-generated constructor stub
	}
	
	
	public CreditRecordVO(int id, String username, CreditRecordType type, int variation, int currCredit) {
		super();
		this.id = id;
		this.username = username;
		this.type = type;
		this.variation = variation;
		this.currCredit = currCredit;
	}


	public CreditRecordVO(int id, String username, CreditRecordType type, int variation) {
		super();
		this.id = id;
		this.username = username;
		this.type = type;
		this.variation = variation;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + currCredit;
		result = prime * result + id;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		result = prime * result + variation;
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
		CreditRecordVO other = (CreditRecordVO) obj;
		if (currCredit != other.currCredit)
			return false;
		if (id != other.id)
			return false;
		if (type != other.type)
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		if (variation != other.variation)
			return false;
		return true;
	}
	
}
