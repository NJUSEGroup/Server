package hrs.common.util.FilterCondition;

import hrs.common.util.type.FilterType;

public class ValueFilterCondition extends FilterCondition {
	private double low;
	private double high;

	public ValueFilterCondition(FilterType type) {
		super(type);
		// TODO Auto-generated constructor stub
	}

	public double getLow() {
		return low;
	}

	public void setLow(double low) {
		this.low = low;
	}

	public double getHigh() {
		return high;
	}

	public void setHigh(double high) {
		this.high = high;
	}

}
