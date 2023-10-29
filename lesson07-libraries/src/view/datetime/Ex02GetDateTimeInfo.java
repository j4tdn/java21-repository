package view.datetime;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Ex02GetDateTimeInfo {
	public static void main(String[] args) {
		// lấy thông tin thời gian hiện tại
		
		Calendar c = Calendar.getInstance();
		
		int day = c.get(Calendar.DAY_OF_MONTH);
		int month = c.get(Calendar.MONTH) + 1; //0-11
		int year = c.get(Calendar.YEAR);
		
		// giờ 12-24, phút, giây
		int hour12 = c.get(Calendar.HOUR);
		int ap = c.get(Calendar.AM_PM);
		System.out.println("2. Giờ " + hour12 + (ap == 1 ? "PM" : "AM"));
		
		// ngày trong tuần
		int dow = c.get(Calendar.DAY_OF_WEEK);
		System.out.println("dow " + dow);
		String[] dayofWeeks = {"Chủ nhật", "Thứ hai", "Thứ ba", "Thứ tư", "Thứ năm", "Thứ sáu", "Thứ bảy", "Chủ nhật"};
		String dowAsString = dayofWeeks[dow-1];
		System.out.println("dowAsString --> " + dowAsString);
		
		// đếm số ngày trong tháng, năm hiện tại >> Calendar
		int daysInMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("daysInMonth: " + daysInMonth);
		
		int daysInYear = c.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println("daysInYEAR: " + daysInYear);
		
		// kiểm tra năm hiện tại có phải năm nhuận không
		GregorianCalendar gc = new GregorianCalendar();
		boolean isLeapYear = gc.isLeapYear(year);
		System.out.println("isLeapYear: " + isLeapYear);
		
		// ngày đầu tiên trong tuần là ngày thứ mấy
		String fdow = dayofWeeks[c.getFirstDayOfWeek() - 1];
		System.out.println("fdow: " + fdow);
		
		// ngày đầu tiên trong tuần hiện tại là ngày mấy
		Calendar cloned = Calendar.getInstance(new Locale("vi", "VN"));
		cloned.setTimeInMillis(c.getTimeInMillis());
		
		int duration = cloned.getFirstDayOfWeek() - dow;
		cloned.add(Calendar.DAY_OF_MONTH,
				dow == Calendar.SUNDAY ? duration - 7 : duration);
		
		int fdowAsNumber = cloned.get(Calendar.DAY_OF_MONTH);
		int fmonth = cloned.get(Calendar.MONTH) + 1;
		
		System.out.println("fdowAsNumber: " + fdowAsNumber);
		
		
	}
}
