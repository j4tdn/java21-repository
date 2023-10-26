package homework;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class Ex03 {

	public static void main(String[] args) {
		
	currentTime();	
	lastDayOfMonth();
	firstDayAndLastDayOfWeek();
	currentDayOfWeekInYear();
	checkDateAfter20Days();
	checkDateAlive(2003, 06, 30);
		
	}
	
	// Xem thời gian hiện tại(dd/MM/yyy HH:mm:ss) ở khu vực bất kỳ
	private static void currentTime() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date now = new Date();
		
		System.out.println("Thời gian hiện tại: " + sdf.format(now));		
	}
	
	// In ngày cuối cùng của tháng hiện tại (dd/MM/yyyy)
	private static void lastDayOfMonth() {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Ngày cuối cùng của tháng hiện tại: " + sdf.format(c.getTime()));
	}
	
	// Xem ngày đầu tiên và cuối cùng của tuần hiện tại
	private static void firstDayAndLastDayOfWeek() {
		Calendar c = Calendar.getInstance(new Locale("vi", "VN"));
		c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Ngày đầu tiên của tuần hiện tại là: " + sdf.format(c.getTime()));
		
		c.add(Calendar.DATE, 6);
		System.out.println("Ngày cuối cùng của tuần hiện tại là: " + sdf.format(c.getTime()));
		
	}
	
	// Xem ngày hiện tại đang ở tuần thứ mấy trong năm
	private static void currentDayOfWeekInYear() {
		Calendar c = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		int weekNumber = c.get(Calendar.WEEK_OF_YEAR);
		
		System.out.println("Ngày hiện tại đang ở tuần thứ " + weekNumber + " trong năm " + sdf.format(c.getTime()));
	}
	
	// Kiểm tra sau 20 ngày nữa là ngày nào, thứ mấy
	private static void checkDateAfter20Days() {
		Calendar c = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy EEEE");
		
		c.add(Calendar.DATE, 20);
		System.out.println("Sau 20 ngày nữa là ngày: " + sdf.format(c.getTime()));
	}
	
	// Nhập vào ngày tháng năm sinh. Kiểm tra xem bạn đã sống được bao nhiêu ngày
	
	private static void checkDateAlive(int year, int month, int day) {
		Calendar birthDate = Calendar.getInstance();
		birthDate.set(year, month -1, day);
		
		Calendar currentDate = Calendar.getInstance();
		long millisAlive = currentDate.getTimeInMillis() - birthDate.getTimeInMillis();
	 // long daysAlive = millisAlive / (1000*60*60*24); 
		long daysAlive = TimeUnit.MILLISECONDS.toDays(millisAlive);
		
		System.out.println("Bạn đã sống được " + daysAlive + " ngày");
	}
	
}
