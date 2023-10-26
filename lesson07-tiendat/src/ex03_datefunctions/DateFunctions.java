package ex03_datefunctions;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFunctions {
	private SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	public String getCurrentTime() {
		Date currentTime = new Date();
		return dateFormat.format(currentTime);
	}

	public String getLastDayOfMonth() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
		return dateFormat.format(calendar.getTime());
	}

	public String getFirstAndLastDayOfWeek() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_WEEK, calendar.getFirstDayOfWeek());
		Date firstDayOfWeek = calendar.getTime();

		calendar.add(Calendar.DATE, 6);
		Date lastDayOfWeek = calendar.getTime();

		return "First day of the week: " + dateFormat.format(firstDayOfWeek) + "\nLast day of the week: "
				+ dateFormat.format(lastDayOfWeek);
	}

	public String getCurrentWeekNumber() {
		Calendar calendar = Calendar.getInstance();
		return String.valueOf(calendar.get(Calendar.WEEK_OF_YEAR));
	}

	public String getDateInFuture(int days) {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DATE, days);
		Date futureDate = calendar.getTime();
		SimpleDateFormat dayOfWeekFormat = new SimpleDateFormat("EEEE");
		return "After " + days + " days, it will be " + dateFormat.format(futureDate) + " ("
				+ dayOfWeekFormat.format(futureDate) + ")";
	}

	public int calculateDaysSinceBirthday(Date birthday) {
		Calendar today = Calendar.getInstance();
		Calendar birthDate = Calendar.getInstance();
		birthDate.setTime(birthday);

		long daysInMillis = today.getTimeInMillis() - birthDate.getTimeInMillis();
		return (int) (daysInMillis / (24 * 60 * 60 * 1000));
	}
}
