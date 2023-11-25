package view;

import java.time.DayOfWeek;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

import javax.sql.rowset.serial.SQLOutputImpl;

public class Ex02GetDateTimeInfor {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance(new Locale("vi", "VN"));
		c.set(Calendar.DAY_OF_WEEK, Calendar.TUESDAY);
		c.set(Calendar.MONTH, Calendar.SEPTEMBER);
		
		int day = c.get(Calendar.DAY_OF_MONTH);
		int month = c.get(Calendar.DAY_OF_MONTH) + 1;
		int year = c.get(Calendar.YEAR);
		System.out.println("1.Thời Gian: " + year + ":" + month + ":" + day);
		
		
		int hour = c.get(Calendar.HOUR);
		int ap = c.get(Calendar.AM_PM);
		System.out.println("2.Giờ :" + hour + ":" + ap);
		
		int dow = c.get(Calendar.DAY_OF_WEEK);
		String[] dayOfWeeks = {"Chủ Nhật", "Thứ 2", "Thứ 3",
				                  "Thứ 4", "Thứ 5", "Thứ 6", "Thứ 7"};
		String dowAssString = dayOfWeeks[dow -1];
		
		
		//Đếm số ngày trong tháng
		int daysInMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);  
		System.out.println(daysInMonth);
		int daysInYear = c.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println(daysInYear);
		
		GregorianCalendar gc = new GregorianCalendar();
		boolean isLeapYear = gc.isLeapYear(year);
		System.out.println("isLeapYear"+ isLeapYear);
		
		
		//Ngày đầu tiên trong tuần là thứ mấy
		String fdow = dayOfWeeks[c.getFirstDayOfWeek()-1];
		System.out.println(fdow);
		
		
		
		// +7 ngày đầu tiên trong tuần hiện tại là ngày bao nhiêu 
		Calendar cloned = Calendar.getInstance(new Locale("vi","VN"));
		cloned.setTimeInMillis(c.getTimeInMillis());
		int duration = cloned.getFirstDayOfWeek() - dow;
		cloned.add(Calendar.DAY_OF_MONTH, dow == Calendar.SUNDAY ? duration -7 : duration);
		int fdowAsNumber = cloned.get(Calendar.DAY_OF_MONTH);
		int fmonth = cloned.get(Calendar.MONTH)+1;
		System.out.println("fdowAsNumber" + fdowAsNumber +"/" +fmonth);
		
		
		
		//
		
		
}
}
