package utils;
// Hàm dùng để conver
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

public class DateUtils {
	private DateUtils() {
		
	}
	public static String optional(long value, String unit) {
		if (value == 0 ) {
			return  "";
		}
		return value + " " + unit + (value > 1 ? "s" : "") + " ";
	}
	public static Date toDate(Calendar c) {
		Objects.requireNonNull(c, "c shuold not be null");
		return c.getTime();
	}
	
	public static Date toDate(String text , String pattern, boolean isLient) {
		Objects.requireNonNull(text, "textshuold not be null");
		Objects.requireNonNull(pattern, "pattern is invalid");
		
		DateFormat df = new SimpleDateFormat(pattern);
		df.setLenient(isLient);
		Date date = null;
		try {
			date = df.parse(text);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	
		return date;
	}
	
	public static String format(Calendar c, String pattern) {
		Objects.requireNonNull(c, "c shuold not be null");
		Objects.requireNonNull(pattern, "pattern is invalid");
		
		DateFormat df = new SimpleDateFormat(pattern);
		
		return df.format(toDate(c));
	}
	public static String format(Date date, String pattern) {
		Objects.requireNonNull(date, "c shuold not be null");
		Objects.requireNonNull(pattern, "pattern is invalid");
		
		DateFormat df = new SimpleDateFormat(pattern);
		
		return df.format(date);
	}
	
}