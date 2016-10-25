package hrs.common.Controller.UserController;

import hrs.common.util.type.FilterType;

public abstract class FilterCondition {
	private FilterType type;
	public FilterType getType() {
		return type;
	}
	public void setType(FilterType type) {
		this.type = type;
	}
	public FilterCondition(FilterType type) {
		this.type = type;
	}
}
