package utils;

import java.time.LocalDate;
import java.util.Objects;

public class DateUtils {

	private DateUtils() {
	}

	// Sao tên hàm toSqlDate mà return String ?
	public static String toSqlDate(LocalDate ldate) {
		Objects.requireNonNull(ldate);
		return java.sql.Date.valueOf(ldate).toString();
	}
}
