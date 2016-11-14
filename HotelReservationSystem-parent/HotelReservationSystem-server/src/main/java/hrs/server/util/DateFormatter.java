package hrs.server.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatter {
	private static SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");
	public static String format(Date date){
		return formatter.format(date);
	}
	public static Date parse(String date,boolean hasHMS) throws ParseException{
		Date res = null;
		if(hasHMS){
			formatter.applyPattern("yyyy-MM-dd hh:mm:ss");
			res = formatter.parse(date);
			formatter.applyPattern("yyyy-mm-dd");
		}else{
			res = formatter.parse(date);
		}
		return res;
	}
}
