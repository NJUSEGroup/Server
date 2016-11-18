package hrs.server.util.FilterCondition;

import hrs.common.util.FilterCondition.FilterCondition;
import hrs.common.util.type.FilterType;

public class NameFilterCondition extends FilterCondition {
	private String hotelName;
	public NameFilterCondition(FilterType type) {
		super(type);
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	
}
