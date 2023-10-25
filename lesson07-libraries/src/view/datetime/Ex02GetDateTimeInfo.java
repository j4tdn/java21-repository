package view.datetime;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Ex02GetDateTimeInfo {

	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		
		int day = c.get(Calendar.DAY_OF_MONTH);
		int month = c.get(Calendar.MONTH) + 1;
		int year = c.get(Calendar.YEAR);
		
		String dmy = day + "/" + month + "/" + year;
		System.out.println("Ngày, Tháng, Năm: " + dmy);
		
		int hour12 = c.get(Calendar.HOUR);
		int ap = c.get(Calendar.AM_PM);
		System.out.println("Giờ: " + hour12 + (ap == 1 ? " PM" : " AM"));
		
		int dow = c.get(Calendar.DAY_OF_WEEK);
		
		int daysInMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("daysInMonth: " + daysInMonth);
		
		int daysInYear = c.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println("daysInYear: " + daysInYear);
		
		GregorianCalendar gc = new  GregorianCalendar();
		boolean isLeapyear = gc.isLeapYear(year);
		System.out.println("isLeapyear: " + isLeapyear);
		
		//String fdow = dayOfWeeks[c.getFirstDayOfWeek() - 1];
		//System.out.println("fdow: " + fdow);
		
		Calendar cloned = Calendar.getInstance(new Locale("vi", "VN")); // set locale ở Việt Nam
		cloned.setTimeInMillis(c.getTimeInMillis());
		
		int duration = cloned.getFirstDayOfWeek() - dow;
			cloned.add(Calendar.DAY_OF_MONTH,
					dow == Calendar.SUNDAY ? duration - 7 : duration);
			
		int fdowAsNumber = cloned.get(Calendar.DAY_OF_MONTH);
		System.out.println("fdowAsNumber: " + fdowAsNumber);
		
	}
	
}
