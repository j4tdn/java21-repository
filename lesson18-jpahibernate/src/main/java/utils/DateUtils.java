package utils;

import java.time.LocalDate;
import java.util.Objects;

public class DateUtils {
	
	private DateUtils() {
	}

	public static java.sql.Date toSqlDate(LocalDate ldate) {
		Objects.requireNonNull(ldate);
		return java.sql.Date.valueOf(ldate);
	}

}
