package utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

public class DateUtils {

	private DateUtils() {
	}

	// calendar -> date
	public static Date toDate(Calendar c) {
		Objects.requireNonNull(c, "c should not be null");
		return c.getTime();
	}

	// String -> date
	public static Date toDate(String text, String pattern, boolean isLenient) {
		Objects.requireNonNull(text, "text should not be null");
		Objects.requireNonNull(pattern, "pattern is valid");
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

	// calendar -> date -> String
	public static String format(Calendar c, String pattern) {
		Objects.requireNonNull(c, "c should not be null");
		Objects.requireNonNull(pattern, "pattern is valid");
		DateFormat df = new SimpleDateFormat(pattern);
		return df.format(toDate(c));
	}

	// date -> String
	public static String format(Date date, String pattern) {
		Objects.requireNonNull(date, "c should not be null");
		Objects.requireNonNull(pattern, "pattern is valid");
		DateFormat df = new SimpleDateFormat(pattern);
		return df.format(date);
	}
	
	public static int enterDMY(String message) {
		Scanner scanner = new Scanner(System.in);
		System.out.print(message);
		while (!scanner.hasNextInt()) {
			System.out.println("Vui lòng nhập một số nguyên.");
			System.out.print(message);
			scanner.next();
		}
		return Integer.parseInt(scanner.nextLine());
	}
}
