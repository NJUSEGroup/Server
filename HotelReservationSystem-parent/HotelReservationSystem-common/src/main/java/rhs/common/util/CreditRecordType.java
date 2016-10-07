package rhs.common.util;

public enum CreditRecordType {
	Register, Execute, Overtime, Recharge;
	public static CreditRecordType getCreditRecordType(String type) {
		switch (type) {
		case "Register":
			return Register;
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
