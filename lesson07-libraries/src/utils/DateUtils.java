package utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

public class DateUtils {
	
	private DateUtils() {
		
	}
	
	public static Date toDate(Calendar c) {
		Objects.requireNonNull(c, "c should not be null");
		return c.getTime();
	}
	
	
	
}
