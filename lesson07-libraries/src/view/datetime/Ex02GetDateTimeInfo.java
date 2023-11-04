package view.datetime;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Ex02GetDateTimeInfo {

	public static void main(String[] args) {
		// Lấy thông tin thời gian hiện tại với [timezone]
		
		Calendar c = Calendar.getInstance(new Locale("vi", "VN"));
		// c.set(Calendar.DAY_OF_WEEK, Calendar.TUESDAY);
		// c.set(Calendar.MONTH, Calendar.FEBRUARY);
		
		// ngay tháng năm
		int day = c.get(Calendar.DAY_OF_MONTH);
		int month = c.get(Calendar.MONTH) +1;
		int year = c.get(Calendar.YEAR);
		String dmy = day + "/" + month + "/" + year;
		System.out.println("1. Ngày, Tháng, Năm: " + dmy);
		
		// giờ 12-24 phút giây
		int hour12 = c.get(Calendar.HOUR);
		int ap = c.get(Calendar.AM_PM);
		System.out.println("2. Giờ: " + hour12 + (ap == 1? " PM" : " AM") );
		
		// ngày trong tuần(thứ mấy): 1(sunday),2,3,4,5,6,7(saturday)
		int dow = c.get(Calendar.DAY_OF_WEEK);
		System.out.println("dow: " + dow);
		String[] dayOfWeeks = {"Chủ Nhật", "Thứ Hai", "Thứ Ba", "Thứ Tư", "Thứ Năm", "Thứ Sáu", "Thứ Bảy"};
		String dowAsString = dayOfWeeks[dow -1];
		System.out.println("dowAsString -->" + dowAsString);
		
		// đếm số ngày trong tháng, năm hiện tại >> Calendar
		int daysInMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("daysInMonth: " + daysInMonth);
		
		int daysInYear = c.get(Calendar.DAY_OF_YEAR);
		System.out.println("daysInYear: " + daysInYear);
		
		// kiểm tra năm hiện tại có phải năm nhuận không
		GregorianCalendar gc = new GregorianCalendar();
		boolean isLeapYear = gc.isLeapYear(year);
		System.out.println("isLeapYear: " + isLeapYear);
		
		//  ngày đầu tiên trong tuần hiện tại là ngày thứ mấy
		String fdow = dayOfWeeks[c.getFirstDayOfWeek() - 1]; // c.getFirstDayOfWeek() =2 vì locale là tại VN -> 2-1 =1 trong string[]
		System.out.println("fdow: " + fdow);
		
		// ngày đầu tiên trong tuần hiện tại là ngày mấy
		Calendar cloned = Calendar.getInstance(new Locale("vi", "VN"));
		cloned.setTimeInMillis(c.getTimeInMillis());
		
		int duration = cloned.getFirstDayOfWeek() - dow;
		cloned.add(Calendar.DAY_OF_MONTH, dow == Calendar.SUNDAY ? duration - 7 : duration);
		
		
		int fdowAsNumber = cloned.get(Calendar.DAY_OF_MONTH);
		int fmonth = cloned.get(Calendar.MONTH) + 1;
		System.out.println("fdowAsNumber: " + fdowAsNumber + "/" + fmonth);
		
		/*
		 * timezone và locale
		 * + timezone: dùng cho việc chuyển đổi thời gian giữa các múi giờ khác nhau
		 * + locale: hiển thị dữ liệu theo định dạng phù hợp với ngôn ngữ văn hoá chỗ đó
		 */
		
		
		
		
		
		
		
		
		
		
	}
}
