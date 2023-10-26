package view.datetime;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Ex02GetDateTimeInfo {

	
	public static void main(String[] args) {

		Calendar c = Calendar.getInstance();
		
		// 1. Ngày, Tháng, Năm
		int day = c.get(Calendar.DAY_OF_MONTH);
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1; //month[0, 11]
		
		String dmy = day + "/ " + month + "/ "+ year ;
		System.out.println("1. Ngày, Tháng, Năm: " + dmy);
		
		// 2. Giờ 12-24, phút, giây
		int hour12 = c.get(Calendar.HOUR);
		int ap = c.get(Calendar.AM_PM);
		System.out.println("2. Giờ: " + hour12 + (ap == 1 ? "PM" : "AM"));
		
		// 3. Thứ trong tuần(thứ mấy)
		
		int dow  = c.get(Calendar.DAY_OF_WEEK);
		System.out.println(dow);
		String[] dayOfWeek = {"Chủ nhật", "Thứ 2", "Thứ 3", "Thứ 4", "Thứ 5", "Thứ 6", "Thứ 7"};
		String dowAsString = dayOfWeek[dow-1];
		System.out.println("Hôm nay là: " + dowAsString);
		
		// 4. đếm số ngày trong tháng, năm hiện tại
		
		// 5. kiểm tra năm hiện tại có phải năm nhuận không
		
		GregorianCalendar gc = new GregorianCalendar();
		boolean isLeapYear = gc.isLeapYear(year);
		System.out.println("isLeapYear: " + isLeapYear);
		
		// 6. thứ đầu tiên trong tuần hiện tại là ngày thứ mấy
		String fdow = dayOfWeek[c.getFirstDayOfWeek()- 1];
		System.out.println(fdow);
		
		// 7. Ngày đầu tiên trong tuần hiện tại là ngày mấy
		Calendar cloned = Calendar.getInstance(new Locale("vi", "VN"));
		cloned.setTimeInMillis(c.getTimeInMillis());
		
		int duration = cloned.getFirstDayOfWeek() - dow;
		cloned.add(Calendar.DAY_OF_MONTH,
				dow == Calendar.SUNDAY ? duration - 7: duration);
		
		int fdowAsNumber = cloned.get(Calendar.DAY_OF_MONTH);
		System.out.println("fdowAsNumber :" + fdowAsNumber	);
		
	}
}
