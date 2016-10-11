package hrs.common.util;

public enum CreditRecordType {
	Execute, Overtime, Recharge;
	public static CreditRecordType getCreditRecordType(String type) {
		switch (type) {
		case "Execute":
			return Execute;
		case "Overtime":
			return Overtime;
		case "Recharge":
			return Recharge;
		default:
			return null;
		}
	}
}
