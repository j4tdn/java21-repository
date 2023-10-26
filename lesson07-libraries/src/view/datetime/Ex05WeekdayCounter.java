package view.datetime;

import java.util.Calendar;

import  static utils.DateUtils.*;

public class Ex05WeekdayCounter {
	
	private static final String DEFAULT_PATTERN = "dd/MM/yyy";

	public static void main(String[] args) {
		
		
		// đếm xem tháng hiện tại có bao nhiêu ngày chủ nhật
		Calendar now = Calendar.getInstance(); // 24/10/2023

		System.out.println("Hien tai: " + format(now, DEFAULT_PATTERN));
		// ngày đầu tháng
		Calendar start = Calendar.getInstance();
		start.setTime(now.getTime());
		start.set(Calendar.DAY_OF_MONTH, 1);
		System.out.println("Dau thang: " + format(start, DEFAULT_PATTERN));
		
		// ngày cuối tháng
		Calendar end = clone(now);
		end.set(Calendar.DAY_OF_MONTH, now.getActualMaximum(Calendar.DAY_OF_MONTH));
		System.out.println("Cuoi thang: " + format(end, DEFAULT_PATTERN));
		
		// de, soo ngay chu nhat
		Calendar startOfNewMonth = clone(end);
		startOfNewMonth.add(Calendar.DAY_OF_MONTH, 1);
		Calendar cal = start;
		while(cal.before(startOfNewMonth)) {
			if(cal.get(Calendar.DAY_OF_WEEK) == Calendar.TUESDAY) {
				System.out.println(format(cal, "dd/MM/yyyy EEEE"));
				cal.add(Calendar.DAY_OF_MONTH, 7);
				continue;
			}
			cal.add(Calendar.DAY_OF_MONTH, 7);
		}
		
	}
	public static Calendar clone(Calendar c) {
		Calendar cloned = Calendar.getInstance();
		cloned.setTime(c.getTime());;
		return cloned;
	}
//	public static Calendar clone(Calendar c) {
//		Calendar cloned = Calendar.getInstance();
//		cloned.setTime(c.getTime());
//		return cloned;
//	}
}
