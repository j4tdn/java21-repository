package homework;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Locale;

public class Ex03 {

	public static void main(String[] args) {
		String zoneId = "Asia/Dubai";
		currentTime(zoneId);
		
		getLastDayOfCurrentMonth();
		
		getFirstAndLastDayOfCurrentWeek();
		
		currentDayOfWeekInYear();
		
		get20DaysLater();
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dob = LocalDate.parse("12/05/2000", df);
		getLifeTime(dob);
	}
	
	private static void currentTime(String zoneId) {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		LocalDateTime crTime = LocalDateTime.now(ZoneId.of(zoneId));
		System.out.println("The current time in " + zoneId + ": " + crTime.format(df));
	}
	
	private static void getLastDayOfCurrentMonth() {
		Calendar c = Calendar.getInstance();
		System.out.print("The last day of the current month: ");
		System.out.println(c.getActualMaximum(Calendar.DAY_OF_MONTH) + "/" + (c.get(Calendar.MONTH)+1) + "/"
							+ c.get(Calendar.YEAR));
	}
	
	private static void getFirstAndLastDayOfCurrentWeek() {
		Calendar c = Calendar.getInstance(new Locale("vi", "VN"));
		int duration = c.getFirstDayOfWeek() - c.get(Calendar.DAY_OF_WEEK);
		c.add(Calendar.DAY_OF_MONTH, c.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY ? duration - 7 : duration);
		System.out.println("The first day of the current week: " + c.get(Calendar.DAY_OF_MONTH));
		System.out.println("The last day of the current week: " + (c.get(Calendar.DAY_OF_MONTH) + 6));
	}
	
	private static void currentDayOfWeekInYear() {
		Calendar c = Calendar.getInstance();
		System.out.println("The current day is in the " + c.get(Calendar.WEEK_OF_YEAR) + " week of the year");
	}
	
	private static void get20DaysLater() {
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DAY_OF_MONTH, 20);
		String weekDay = new SimpleDateFormat("EEEE").format(c.getTime());
		System.out.println("20 days later -> " + c.get(Calendar.DAY_OF_MONTH) + "/"
							+ c.get(Calendar.MONTH) + " " + weekDay);
	}
	
	private static void getLifeTime(LocalDate dob) {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Day of Birth: " + dob.format(df));
		
        long daysLife = ChronoUnit.DAYS.between(dob, LocalDate.now());
        System.out.println("You have lived for " + daysLife + " days");
	}
}
