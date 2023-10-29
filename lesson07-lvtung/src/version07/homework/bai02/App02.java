package version07.homework.bai02;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import static utils.DateUtils.*;

public class App02 {
	
	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date date = null;
		df.setLenient(false);
		String dmy = null;
		do {
			try {
				System.out.print("Nhập ngày tháng năm (dd/MM/yyyy): ");
				dmy = scanner.nextLine();
				date = df.parse(dmy);
				break;
			} catch (ParseException e) {
				System.out.println("Phải nhập ngày tháng năm theo định dạng dd/MM/yyyy.");
			}
		} while (true);
		
		System.out.println("dmy: " + dmy);
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		whatDayIsToday(c);
	}
	
	private static void whatDayIsToday(Calendar cal) {
		// Title
		String dow = format(cal, "EEEE");
		int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
		String monthAsString = format(cal, "MMMM");
		int year = cal.get(Calendar.YEAR);
		String dmy = dayOfMonth + " " + monthAsString + " " + year;
		System.out.println(dmy + " is a " + dow);
		
		// day of year
		int doy = cal.get(Calendar.DAY_OF_YEAR);
		int dayLeft = cal.getActualMaximum(Calendar.DAY_OF_YEAR) - doy;
		System.out.println("It is day number " + doy + " of the year, " + dayLeft + " days left.");
		
		// week of year
		int woy = cal.get(Calendar.WEEK_OF_YEAR);
		int weekInYear = cal.getActualMaximum(Calendar.WEEK_OF_YEAR);
		System.out.println("It is " + dow + " number " + woy + " out of " + weekInYear + " in " + year);
		
		// Day of Week in Month
		int weekOfMonth = cal.get(Calendar.DAY_OF_WEEK_IN_MONTH);
		int weekInMonth = cal.getActualMaximum(Calendar.DAY_OF_WEEK_IN_MONTH);
		System.out.println("It is " + dow + " number " + weekOfMonth + " out of " + weekInMonth 
							+ " in " + monthAsString + " " + year);
		
		// max day in year
		int maxDaysInYear = cal.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println("Year " + year + " has " + maxDaysInYear + " days.");
		
		// max day in month
		int maxDaysInMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(monthAsString + " " +  year + " has " + maxDaysInMonth + " days.");
	}
}
