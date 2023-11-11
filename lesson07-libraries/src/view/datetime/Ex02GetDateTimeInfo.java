package view.datetime;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Ex02GetDateTimeInfo {
	
	public static void main(String[] args) {
	
		// lấy thông tin thời gian hiện tại với [timezone]
		Calendar c = Calendar.getInstance(new Locale("vi", "VN"));
		
		// 1.Ngày tháng năm
		int day = c.get(Calendar.DAY_OF_MONTH);
		int month = c.get(Calendar.MONTH) + 1;
		int year = c.get(Calendar.YEAR);
		String dmy =  day + "/" + month + "/" + year;
		System.out.println(dmy);
		
		// 2.Giờ phút giây
		int hour12 = c.get(Calendar.HOUR);
		int ap = c.get(Calendar.AM_PM);
		System.out.println("time: " + hour12 + (ap == 1 ? "PM" : "AM"));
		
		// 3.Ngày trong tuần(thứ mấy): 1(sunday), 2,3,4,5,6,7(saturday)
		int dow = c.get(Calendar.DAY_OF_WEEK);
		String[] dayOfAWeeks = {"Chủ Nhật", "Thứ Hai", "Thứ Ba", "Thứ Tư", "Thứ Năm", "Thứ Sáu", "Thứ Bảy"};
		String dowAsString = dayOfAWeeks[dow - 1];
		System.out.println("dowAsString --> " + dowAsString);
		
		// 4. Đếm số ngày trong tháng, năm hiện tại >> Calendar
		int dayInMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("dayInMonth --> " + dayInMonth);
		
		int dayInYear = c.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println("dayInYear -->" + dayInYear);
		
		// 5. Kiểm tra năm hiện tại có phải năm nhuận không?
		GregorianCalendar gc = new GregorianCalendar();
		boolean isLeapYear = gc.isLeapYear(year);
		System.out.println("isLeapYear: " + isLeapYear);
		
		// 6. Ngày đầu tiên trong tuần hiện tại là ngày thứ mấy
		String fdow = dayOfAWeeks[c.getFirstDayOfWeek() - 1];
		System.out.println("fdow: " + fdow);
		
		// 7. Ngày đầu tiên trong tuần hiện tại là ngày mấy?
		Calendar cloned = Calendar.getInstance(new Locale("vi", "VN"));
		cloned.setTimeInMillis(c.getTimeInMillis());
		
		int duration = cloned.getFirstDayOfWeek() - dow;
		cloned.add(Calendar.DAY_OF_MONTH, dow == Calendar.SUNDAY ? duration - 7 : duration);
		
		int fdowAsNumber = cloned.get(Calendar.DAY_OF_MONTH);
		System.out.println("fdowAsNumber: " + fdowAsNumber);
		
	}
}
