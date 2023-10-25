package view.datetime;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ex02GetDateTimeInfo {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		
		
		// bai 1: ngày tháng năm
		int date = c.get(Calendar.DAY_OF_MONTH);
		int month = c.get(Calendar.MONTH)+1;
		int year = c.get(Calendar.YEAR);
		
		String dmy = date + "/" + month + "/" + year;
		System.out.println(dmy);
		
		// bai 2: giờ 12-24, phút, giây
		int hour12 = c.get(Calendar.HOUR);
		int ap = c.get(Calendar.AM_PM);
		System.out.println("2. Giờ: " + hour12 + (ap == 1 ? "PM" : "AM"));
		
		// bai 3
		int day = c.get(Calendar.DAY_OF_WEEK);
		System.out.println(day);
		String[] dowAsString = {"Chủ nhật", "Thứ hai", "Thứ ba", "Thứ tư", "Thứ năm", "Thứ sáu", "Thứ bảy"};
		System.out.println("day of week --> " + dowAsString[day - 1]);
		
		// bai 4: Đếm số ngày trong tháng, năm hiện tại >> calendar
		int daysInMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(daysInMonth);
		
		int daysInYear = c.getActualMaximum(Calendar.DAY_OF_YEAR);
		
		// bai 5: Kiểm tra năm hiện tại có phải năm nhuận không
		GregorianCalendar gc = new GregorianCalendar();
		boolean isLeapYear = gc.isLeapYear(year);
		System.out.println("isLeapYear: " + isLeapYear);
		
		// bai 6: Ngày đầu tiên trong tuần là ngày thứ mấy
		String fdow = dowAsString[c.getFirstDayOfWeek()-1];
		System.out.println("first day of week --> " + fdow);
		
		// bai 7: Ngày của ngày đầu tiên trong tuần 
//		int fdowAsNumber = date + c.getFirstDayOfWeek() - day;
//		if(fdowAsNumber > date) {
//			fdowAsNumber -= 7;
//		}
//		System.out.println(fdowAsNumber);
		
		Calendar cloned = Calendar.getInstance();
		cloned.setTimeInMillis(c.getTimeInMillis());
		
		int duration = cloned.getFirstDayOfWeek() - day;
		cloned.add(Calendar.DAY_OF_MONTH, 
					day == Calendar.SUNDAY ? duration - 7 : duration);
		
		int fdowAsNumber = cloned.get(Calendar.DAY_OF_MONTH);
		System.out.println("fdowAsNumber: " + fdowAsNumber);
		
		
	}
}
