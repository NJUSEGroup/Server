package hrs.server.util.FilterCondition;

import hrs.common.util.FilterCondition.FilterCondition;
import hrs.common.util.type.FilterType;

public class StarFilterCondition extends FilterCondition {
	private int star;

	public StarFilterCondition(FilterType type) {
		super(type);
	}

	public int getStar() {
		return star;
	}

	public void setStar(int star) {
		this.star = star;
	}
}
