package utils;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

public class DateUtils {
	private DateUtils() {
	}
	
	public static Date toDate(Calendar c) {
		Objects.requireNonNull(c, "c should noy be null");
		return c.getTime();
	}
	
	public static Date toDate(String text, String pattern, boolean isLenient) {
		Objects.requireNonNull(text, "text should not be null");
		Objects.requireNonNull(pattern, "Pattern is invalid");
		
		DateFormat df = new SimpleDateFormat(pattern);
		df.setLenient(isLenient);
		Date date = null;
		
		try {
			date = df.parse(text);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return date;
	}
	
	
	public static LocalDateTime toDate(String text, String pattern) {
		Objects.requireNonNull(text, "text should not be null");
		Objects.requireNonNull(pattern, "Pattern is invalid");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
		LocalDateTime localDateTime = null;
		try {
			localDateTime = LocalDateTime.parse(text, dtf);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return localDateTime;

	}
	
	public static LocalDate toDateLocalDate(String text, String pattern) {
		Objects.requireNonNull(text, "text should not be null");
		Objects.requireNonNull(pattern, "Pattern is invalid");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
		LocalDate localDate = null;
		try {
			localDate = LocalDate.parse(text, dtf);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return localDate;
	}
	
	public static String optional(long value, String unit) {
		if (value == 0) {
			return "";

		}
		return value + "" + unit + (value > 1 ? "s" : "");
	}
	
	
	public static String format(Calendar c, String pattern) {
		Objects.requireNonNull(c, "c should not be null");
		Objects.requireNonNull(pattern, "Pattern is invalid");
		
		DateFormat df = new SimpleDateFormat(pattern);
		return df.format(toDate(c));
	}
	
	public static String format(LocalDateTime localDateTime, String pattern) {
		Objects.requireNonNull(localDateTime, "date should not be null");
		Objects.requireNonNull(pattern, "pattern is invalid");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
		return dtf.format(localDateTime);
		
	}
	
	public static String format(Date date, String pattern) {
		Objects.requireNonNull(date, "date should not be null");
		Objects.requireNonNull(pattern, "Pattern is invalid");
		
		DateFormat df = new SimpleDateFormat(pattern);
		return df.format(date);
	}
}
