package hrs.common.util;

/*
	单人房（Single）----供一人住的客房。可能有一张床或不止一张床。 
	双人房（Double）----供二人住的客房。可能有一张床或不止一张床。 
	大床间 King Size & Queen Size Room
	标准间 Standard
	套间 Suite
	豪华间 Deluxe Room
	商务标间 Business Room
	行政标间 Executive Room
*/
public enum RoomType {
	Single, Double, KingSize, Standard, Deluxe, Business, Executive;
	public static RoomType getRoomType(String type) {
		switch (type) {
		case "Single":
			return Single;
		case "Double":
			return Double;
		case "KingSize":
			return KingSize;
		case "Standard":
			return Standard;
		case "Deluxe":
			return Deluxe;
		case "Business":
			return Business;
		case "Executive":
			return Executive;
		default:
			return null;
		}
	}
}
