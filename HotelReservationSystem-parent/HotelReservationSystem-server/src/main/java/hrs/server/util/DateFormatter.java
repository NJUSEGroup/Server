package hrs.server.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatter {
	private static SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

	public static String format(Date date) {
		return formatter.format(date);
	}
	/**
	 * 按照MM-dd的格式format日期
	 * @param date
	 * @return
	 */
	public static String formatWithMD(Date date){
		String res = null;
		formatter.applyPattern("MM-dd");
		res = formatter.format(date);
		formatter.applyPattern("yyyy-MM-dd");
		return res;
	}
	/**
	 * 
	 * @param date
	 * @return
	 * @throws ParseException
	 */
	public static Date parse(String date) throws ParseException {
		return formatter.parse(date);
	}

	public static Date parseWithHMS(String date) throws ParseException {
		Date res = null;
		formatter.applyPattern("yyyy-MM-dd hh:mm:ss");
		res = formatter.parse(date);
		formatter.applyPattern("yyyy-MM-dd");
		return res;
	}

}
