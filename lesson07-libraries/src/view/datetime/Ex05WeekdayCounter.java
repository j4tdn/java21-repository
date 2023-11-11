package view.datetime;

import java.util.Calendar;

import static utils.DateUtils.*;

public class Ex05WeekdayCounter {

	public static void main(String[] args) {
		
		// Đếm xem tháng hiện tại có bao nhiêu ngày chủ nhật
		Calendar now = Calendar.getInstance(); // 24.10.2023
		System.out.println("Hiện tại: " + format(now, "dd/MM/yyyy"));
		
		// Ngày đầu tháng
		Calendar start = clone(now);
		start.set(Calendar.DAY_OF_MONTH, 1);
		System.out.println("\nĐầu tháng: " + format(start, "dd/MM/yyyy"));
		
		// Ngày cuối tháng
		Calendar end =  clone(now);
		end.set(Calendar.DAY_OF_MONTH, now.getActualMaximum(Calendar.DAY_OF_MONTH));
		System.out.println("\nCuối tháng: " + format(end, "dd/MM/yyyy"));
	
		// Đếm số ngày chủ nhật
		Calendar startOfMonth = clone(end);
		startOfMonth.add(Calendar.DAY_OF_MONTH, 1);
		
//		Calendar cal = start;
//		while (condition) {
//			
//		}
		
		for(Calendar cal = start; cal.before(startOfMonth); cal.add(Calendar.DAY_OF_MONTH, 1)) {
			if(cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
				System.out.println(format(cal, "dd/MM/yyyy EEEE"));
				cal.add(Calendar.DAY_OF_MONTH, 7);
				continue;
			}
			cal.add(Calendar.DAY_OF_MONTH, 1);
		}
	}
	
	public static Calendar clone(Calendar c) {
		Calendar cloned =  Calendar.getInstance();
		cloned.setTime(c.getTime());
		return cloned;
	}
}
