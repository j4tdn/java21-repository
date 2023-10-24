package homework;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ex02WeekdayCalculator {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern("d/M/yyyy");
		LocalDate localDate = null;

		do {
			System.out.print("Enter according to the form: Day/Month/Year -> ");
			String input = ip.nextLine();
			try {
				localDate = LocalDate.parse(input, df);
				break;
			} catch (DateTimeParseException e) {
				System.out.println("Day/Month/Year Invalid Input !");
			}
		} while (true);
		//System.out.println(localDate.getDayOfMonth() + " " + localDate.getMonthValue() + " " + localDate.getYear() + " done");
		
		//convert LocalDate -> Calendar
        ZonedDateTime zonedDateTime = localDate.atStartOfDay(ZoneId.systemDefault());
        Instant instant = zonedDateTime.toInstant();
        Date date = Date.from(instant);
        Calendar c = Calendar.getInstance();
        c.setTime(date);
		
        output(c);
        
        ip.close();
	}
	
	private static void output(Calendar c) {
		String weekDay = new SimpleDateFormat("EEEE").format(c.getTime());
		String monthAsString = new SimpleDateFormat("MMMM").format(c.getTime());
		System.out.println(c.get(Calendar.DAY_OF_MONTH) + " " + (monthAsString) + " " + c.get(Calendar.YEAR) + " is a " + weekDay);
		
		int dayOfYear = c.get(Calendar.DAY_OF_YEAR);
		int remanningDays = c.getActualMaximum(Calendar.DAY_OF_YEAR) - dayOfYear;
		System.out.println("It is day number " + dayOfYear + " of the year, " + remanningDays + " day left");
		
		int weekOfYear = c.get(Calendar.WEEK_OF_YEAR);
		int weeksInYear = c.getActualMaximum(Calendar.WEEK_OF_YEAR);
		int year = c.get(Calendar.YEAR);
		System.out.println("It is " + weekDay + " number " + weekOfYear + " out of " + weeksInYear + " in " + year);
		
		int weekOfMonth = c.get(Calendar.DAY_OF_WEEK_IN_MONTH);
		int weeksInMonth = c.getActualMaximum(Calendar.DAY_OF_WEEK_IN_MONTH);
		System.out.println("It is " + weekDay + " number " + weekOfMonth + " out of " + weeksInMonth + " in " 
							+ monthAsString + " " + year);
	
		System.out.println("Year " + year + " has " + c.getActualMaximum(Calendar.DAY_OF_YEAR) + " days");
		
		System.out.println(monthAsString + " " + year + " has " + c.getActualMaximum(Calendar.DAY_OF_MONTH) + " days");
	}
}
