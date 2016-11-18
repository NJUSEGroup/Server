package hrs.server.util.FilterCondition;

import hrs.common.util.FilterCondition.FilterCondition;
import hrs.common.util.type.FilterType;

public class ScoreFilterCondition extends FilterCondition {
	private double low;

	private double high;

	public ScoreFilterCondition(FilterType type) {
		super(type);
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
