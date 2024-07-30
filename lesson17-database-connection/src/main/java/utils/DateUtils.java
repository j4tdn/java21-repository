package utils;

import java.time.LocalDate;
import java.util.Objects;

public class DateUtils {
	
	private DateUtils() {
		
	}
	
	public static java.sql.Date toSqlDate(LocalDate lDate){
		Objects.requireNonNull(lDate);
		return java.sql.Date.valueOf(lDate);
	}
}
