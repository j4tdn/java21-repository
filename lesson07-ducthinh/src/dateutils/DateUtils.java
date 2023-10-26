package dateutils;



import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

public class DateUtils {
	private DateUtils() {

	}
	
	public static String optional(int value, String unit) {
		if(value == 0) {
			return "";
		}
		return value + " " + unit + (value > 1 ? "s" :" ");
	}

	public static Date todate(Calendar c) {
		Objects.requireNonNull(c, " c should not be null.");
		return c.getTime();
	}

	public static Date toDate(String text, String pattern, boolean inLenient) {
		Objects.requireNonNull(text, " text should not be null");
		Objects.requireNonNull(pattern, " pattern is invaild");
		DateFormat df = new SimpleDateFormat(pattern);
		df.setLenient(inLenient);
		Date date = null;
		try {
			date = df.parse(text);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

	public static String format(Calendar c, String pattern) {
		Objects.requireNonNull(c, "c should not be utils ");
		Objects.requireNonNull(pattern, "pattern is invalid");
		DateFormat df = new SimpleDateFormat(pattern);
		return df.format(todate(c));
	}
}
