package ex03;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Functions {

	static Calendar c = Calendar.getInstance();
	static DateFormat df;

	public static String getTimNow(Calendar c) {
		df = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
		return "Time now --> " + df.format(c.getTime());
	}

	public static String getLastDayOfCurrentMonth(Calendar c) {
		Calendar temp = (Calendar) c.clone();
		temp.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
		df = new SimpleDateFormat("dd/MM/yyy");
		return "Last day of month --> " + df.format(temp.getTime());
	}

	public static String getFirstDayAndLastDayOfCurrentWeek(Calendar c) {
		int fdowAsInt = c.getFirstDayOfWeek();
		int currentDowAsInt = c.get(Calendar.DAY_OF_WEEK);

		Calendar startDayOfWeek = Calendar.getInstance();
		startDayOfWeek.setTime(c.getTime());

		startDayOfWeek.add(Calendar.DAY_OF_MONTH, fdowAsInt - currentDowAsInt);
		df = new SimpleDateFormat("dd/MM/yyyy EEEE");

		Calendar endDayOfWeek = Calendar.getInstance();
		endDayOfWeek.setTime(startDayOfWeek.getTime());
		endDayOfWeek.add(Calendar.WEEK_OF_MONTH, 1);
		endDayOfWeek.add(Calendar.DAY_OF_MONTH, -1);

		return "Start day of week --> " + df.format(startDayOfWeek.getTime()) + "\n" + "End day of week --> "
				+ df.format(endDayOfWeek.getTime());
	}

	public static String getCurrentWeekOfDay(Calendar c) {
		return "Current day is at week --> " + c.get(Calendar.WEEK_OF_YEAR);
	}

	public static String getDayAfterNday(Calendar c, int days) {
		df = new SimpleDateFormat("dd/MM/yyyy");
		Calendar cal = Calendar.getInstance();
		cal.setTime(c.getTime());
		cal.add(Calendar.DATE, days);
		return "After " + days + " days --> " + df.format(cal.getTime());
	}

	public static String getYourDayAlive() {
		Scanner ip = new Scanner(System.in);
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date convertedStartDate = null;
		String startDate;
		do {
			try {
				System.out.print("Enter your birthday (dd/MM/yyyy): ");
				startDate = ip.nextLine();
				convertedStartDate = df.parse(startDate);
				break;
			} catch (ParseException e) {
				System.out.println("Không đúng định dạng");
			}
		} while (true);

		long diff = c.getTime().getTime() - convertedStartDate.getTime();
		return "You live " + (diff / (1000 * 60 * 60 * 24)) + " days.";
	}

	public static void main(String[] args) {
		System.out.println(getTimNow(c));
		System.out.println(getLastDayOfCurrentMonth(c));
		System.out.println(getFirstDayAndLastDayOfCurrentWeek(c));
		System.out.println(getCurrentWeekOfDay(c));
		System.out.println(getDayAfterNday(c, 20));
		System.out.println(getYourDayAlive());
	}

}
