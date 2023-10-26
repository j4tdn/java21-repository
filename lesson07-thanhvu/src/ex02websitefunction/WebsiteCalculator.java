package ex02websitefunction;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class WebsiteCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập ngày (dd-MM-yyyy): ");
		String dateString = scanner.nextLine();

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(parseDate(dateString));

		// Định dạng ngày
		DateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy 'is a' EEEE", Locale.getDefault());
		System.out.println(dateFormat.format(calendar.getTime()));

		// Tính toán thông tin
		int dayOfYear = calendar.get(Calendar.DAY_OF_YEAR);
		int daysLeft = calendar.getActualMaximum(Calendar.DAY_OF_YEAR) - dayOfYear;
		int weekNumber = calendar.get(Calendar.WEEK_OF_YEAR);
		int weekNumberInMonth = calendar.get(Calendar.WEEK_OF_MONTH);
		int numberOfWeeksInYear = calendar.getActualMaximum(Calendar.WEEK_OF_YEAR);
		int numberOfWeeksInMonth = calendar.getActualMaximum(Calendar.WEEK_OF_MONTH);
		int numberOfDaysInYear = calendar.getActualMaximum(Calendar.DAY_OF_YEAR);
		int numberOfDaysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

		System.out.println("It is day number " + dayOfYear + " of the year, " + daysLeft + " day left");
		System.out.println("It is " + getWeekNumberOrdinal(weekNumber) + " out of " + numberOfWeeksInYear + " in "
				+ calendar.get(Calendar.YEAR));
		System.out.println("It is " + getWeekNumberOrdinal(weekNumberInMonth) + " out of " + numberOfWeeksInMonth
				+ " in " + calendar.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.getDefault()) + " "
				+ calendar.get(Calendar.YEAR));
		System.out.println("Year " + calendar.get(Calendar.YEAR) + " has " + numberOfDaysInYear + " days");
		System.out.println(calendar.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.getDefault()) + " "
				+ calendar.get(Calendar.YEAR) + " has " + numberOfDaysInMonth + " days");

		scanner.close();
	}

	private static Date parseDate(String dateString) {
		try {
			return new SimpleDateFormat("dd-MM-yyyy").parse(dateString);
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}

	private static String getWeekNumberOrdinal(int weekNumber) {
		if (weekNumber >= 11 && weekNumber <= 13) {
			return weekNumber + "th";
		}

		switch (weekNumber % 10) {
		case 1:
			return weekNumber + "st";
		case 2:
			return weekNumber + "nd";
		case 3:
			return weekNumber + "rd";
		default:
			return weekNumber + "th";
		}
	}

}
