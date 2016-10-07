package rhs.common.util;

public enum OrderStatus {
	Unexecuted, Executed, Revoked, Abnormal;
	public static OrderStatus getOrderStatus(String status) {
		switch (status) {
		case "Unexecuted":
			return Unexecuted;
		case "Executed":
			return Executed;
		case "Revoked":
			return Revoked;
		case "Abnormal":
			return Abnormal;
		default:
			return null;
		}
	}
}
