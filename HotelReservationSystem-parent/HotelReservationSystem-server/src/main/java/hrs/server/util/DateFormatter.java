package hrs.server.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatter {
	private static SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");
	public static String format(Date date){
		return formatter.format(date);
	}
}
