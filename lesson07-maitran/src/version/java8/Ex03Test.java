package version.java8;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.WeekFields;
import java.util.Scanner;

public class Ex03Test {

	private static LocalDate now = LocalDate.now();
	private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public static String currentTime(String timezone) {
		LocalDateTime currentTime = LocalDateTime.now(ZoneId.of(timezone));
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		return currentTime.format(dtf);
	}

	public static String lastDayOfMonth() {
		LocalDate lastDayOfMonth = now.withDayOfMonth(now.lengthOfMonth());
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return lastDayOfMonth.format(dtf);
	}

	public static String[] viewFirstLastDayOfCurrentWeek() {
		LocalDate startOfWeek = now.with(DayOfWeek.MONDAY);
		LocalDate lastOfWeek = now.with(DayOfWeek.SUNDAY);
		String fmStartDay = startOfWeek.format(dtf);
		String fmLastDay = lastOfWeek.format(dtf);
		return new String[] { fmStartDay, fmLastDay };
	}

	public static int currentWeekNumber() {
		return now.get(WeekFields.ISO.weekOfYear());
	}

	public static String[] checkAfter(int days) {
		LocalDate futureDate = now.plusDays(days);
		String fdmFutureDate = futureDate.format(dtf);
		String futureWeekday = futureDate.getDayOfWeek().toString();
		return new String[] { fdmFutureDate, futureWeekday };
	}

	public static long calAgeByDay(LocalDate birthDate) {
		long daysLived = ChronoUnit.DAYS.between(birthDate, now);
		return daysLived;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter timezone (Continent/City): ");
		// Asia/Ho_Chi_Minh
		// America/New_York

		String timezone = sc.nextLine();
		sc.close();
		System.out.println("Current Time: " + currentTime(timezone));

		System.out.println("Last Day of Month: " + lastDayOfMonth());

		String[] weekDates = viewFirstLastDayOfCurrentWeek();
		System.out.println("First Day of Week: " + weekDates[0]);
		System.out.println("Last Day of Week: " + weekDates[1]);

		int weekNumber = currentWeekNumber();
		System.out.println("Current Week Number: " + weekNumber);

		int days = 20;
		String[] futureDate = checkAfter(days);
		System.out.println("Date after " + days + " days: " + futureDate[0]);
		System.out.println("Weekday of the future date: " + futureDate[1]);

		LocalDate birthDate = LocalDate.of(2002, 9, 03);
		long daysLived = calAgeByDay(birthDate);
		System.out.println("Age in days: " + daysLived);
	}
}