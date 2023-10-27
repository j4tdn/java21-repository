package leson07hthanh;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Locale;

public class weekdayCalculator {

	public static long countDay(Calendar c, Calendar check) {
		LocalDate cLocalDate = c.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		LocalDate checkday = check.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		long day1 = ChronoUnit.DAYS.between(checkday, cLocalDate);
		return day1;
	}

	public static void main(String[] args) {
		Locale.setDefault(new Locale("vn", "VN"));
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, 1995);
		c.set(Calendar.MONTH, Calendar.SEPTEMBER);
		c.set(Calendar.DAY_OF_MONTH, 25);

		Calendar check = Calendar.getInstance();
		check.set(Calendar.YEAR, 1995);
		check.set(Calendar.MONTH, Calendar.JANUARY);
		check.set(Calendar.DAY_OF_MONTH, 1);

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy", new Locale("vn", "VN"));

		String formattedDate = dateFormat.format(c.getTime());
		System.out.print("Ngày tháng năm: " + formattedDate);
		int dow = c.get(Calendar.DAY_OF_WEEK);
		String[] dayofWeek = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
		String[] dayOfMonth = { "January", "February", "March", "April" , "May", "June", "July", "August" , "September", "October" ,"November", "December"};
		String dowAsString = dayofWeek[dow - 1];
		System.out.println(" is " + dowAsString);

		System.out.print("It is day number " + countDay(c, check) + " off the year, ");

		check.set(Calendar.YEAR, 1996);
		System.out.println(countDay(check, c) + " day lelf. ");

		check.set(Calendar.YEAR, 1995);

		Calendar cloned = Calendar.getInstance();
		cloned.setTimeInMillis(c.getTimeInMillis());

		int duration = cloned.getFirstDayOfWeek() - dow;

		cloned.add(Calendar.DAY_OF_MONTH, dow == Calendar.SUNDAY ? duration - 7 : duration);
		int fdowAsNumber = cloned.get(Calendar.DAY_OF_MONTH);
		int fmonth = cloned.get(Calendar.MONTH);
//			System.out.println("fdowAsNumber " + fdowAsNumber );
//			System.out.println("fdowAsNumber " + fmonth );
		cloned.set(Calendar.DAY_OF_WEEK, fdowAsNumber);
		cloned.set(Calendar.MONTH, fmonth);
		int count = 0;
		int countDays = 1;
		for (Calendar cal = check; cal.before(cloned); cal.add(Calendar.DAY_OF_MONTH, 1)) {
			if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.MONDAY) {
				count += 1;
			}
			countDays += 1;
		}
		System.out.print("It is Monday number " + count + " out of ");

		Calendar clone = Calendar.getInstance();
		clone.set(1995, 11, 30);
		for (Calendar cal = check; cal.before(clone); cal.add(Calendar.DAY_OF_MONTH, 1)) {
			if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.MONDAY) {
				count += 1;

			}
			countDays += 1;
		}
		System.out.println(count + " in 1995");
		System.out.println("Year 1995 has " + countDays + " days.");
		
		
		cloned = c;
		
		cloned.set(Calendar.DAY_OF_MONTH, 1);
		clone = cloned;
		
		YearMonth yearMonth = YearMonth.of(c.get(Calendar.YEAR), c.get(Calendar.MONTH)+1);
        int daysInMonth = yearMonth.lengthOfMonth();
		System.out.println(dayOfMonth[c.get(Calendar.MONTH)] +" has " +c.get(Calendar.YEAR) +" " +daysInMonth+" days.");
	
	

	}
}