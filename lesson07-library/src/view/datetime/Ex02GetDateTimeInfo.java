package view.datetime;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Ex02GetDateTimeInfo {
public static void main(String[] args) {
	//Lấy thông tin thời gian hiện tại với timezone]
	Locale.setDefault(new Locale("vi", "VN"));
	Calendar c = Calendar.getInstance();
	//c.set(Calendar.DAY_OF_WEEK, Calendar.TUESDAY);
	c.set(Calendar.DAY_OF_MONTH, 1);
	
	// +1. Ngày , tháng, Năm
	int day =c.get(Calendar.DAY_OF_MONTH);
	int month = c.get(Calendar.MONTH)+1; //month [0,11]
	int year = c.get(Calendar.YEAR);
	String dmy = day + "/" + month +"/" + year;
	System.out.println("1. Ngày Tháng Năm: " + dmy);
	
	//2. Giờ 12-24, phút giây
	int hour12 = c.get(Calendar.HOUR);
	int ap = c.get(Calendar.AM_PM);
	System.out.println("2.Giờ: "+hour12 + (ap==1 ? "PM" : "AM"));
	
	// 3. Ngày trong tuần(thứ mấy): 1,2,3,4,5,6,7(saturday)
	int dow = c.get(Calendar.DAY_OF_WEEK);
	System.out.println("3. Ngày trong tuần(thứ mấy) " +dow);
	String[] dayofWeek = {"Chủ Nhật","Thứ Hai","Thứ Ba","Thứ tư","Thứ năm","Thứ sáu","Thứ 7"};
	String dowAsString = dayofWeek[dow-1];
	System.out.println("DowAsString--> " + dowAsString);
	
	// 4. Đếm số ngày trong tháng, năm hiện tại >> Calender
	int dayofmonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
	System.out.println("DaysInMonth: " +dayofmonth);
	
	int dayInYear = c.getActualMaximum(Calendar.DAY_OF_YEAR);
	System.out.println("DayInYear: " + dayInYear);
	
	// 5. Kiểm tra năm hiện tại có phải năm nhuận hay không
	GregorianCalendar gc = new GregorianCalendar();
	boolean isLeapYear = gc.isLeapYear(year);
	System.out.println("isLeapYear: " +isLeapYear);
	
	// 6. Ngày đầu tiên trong tuần là ngày thứ mấy
	
	String fdow = dayofWeek[c.getFirstDayOfWeek()-1];
	System.out.println("fdow: " + fdow); // Thứ Hai
	
	// 7. Ngày đầu tiên trong tuần là ngày mấy
	Calendar cloned = Calendar.getInstance();
	cloned.setTimeInMillis(c.getTimeInMillis());
	
	int duration = cloned.getFirstDayOfWeek() - dow;
	
		cloned.add(Calendar.DAY_OF_MONTH, dow == Calendar.SUNDAY ? duration -7 : duration);
		int fdowAsNumber = cloned.get(Calendar.DAY_OF_MONTH);
		int fmonth = cloned.get(Calendar.DAY_OF_MONTH);
		System.out.println("fdowAsNumber " + fdowAsNumber + " " + fmonth);
		
	
	
	


}
}
