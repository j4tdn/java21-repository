package utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

public class DateUtils {

	public DateUtils() {
	}
	
	public static Date toDate(Calendar c) {
		Objects.requireNonNull(c, "c should not be null");
		return c.getTime();
	}
	
	public static Date toDate(String text, String pattern, boolean isLenient) {
		Objects.requireNonNull(text, "c should not be null");
		Objects.requireNonNull(pattern, "patern is invalid");
		DateFormat df = new SimpleDateFormat(pattern);
		df.setLenient(isLenient);
		Date date = null;
		try {
			date = df.parse(text);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
	
	public static String format(Calendar c, String pattern) {
		Objects.requireNonNull(c, "c should not be null");
		Objects.requireNonNull(pattern, "patern is invalid");
		DateFormat df = new SimpleDateFormat(pattern);
		return df.format(toDate(c));
	}
	
	public static String format(Date date, String pattern) {
		Objects.requireNonNull(date, "c should not be null");
		Objects.requireNonNull(pattern, "patern is invalid");
		DateFormat df = new SimpleDateFormat(pattern);
		return df.format(date);
	}
	
	public static String optional(long value, String unit) {
		if (value == 0)
			return "";
		return value + " " + unit + (value > 1 ? "s" : "") + " ";
	}
	
	public static Calendar toCalendar(Date date) {
		Objects.requireNonNull(date, "date should not be null");
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		return c;
	}
}
