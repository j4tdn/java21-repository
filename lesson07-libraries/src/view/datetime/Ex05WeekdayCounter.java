package view.datetime;

import java.util.Calendar;

import utils.DateUtils;

public class Ex05WeekdayCounter {
	
	private static final String DEFAULT_PATTERN = "dd/MM/yyyy";
	
	public static void main(String[] args) {
		
		// Đếm xem tháng hiện tại có bn ngày chủ nhật
		Calendar now = Calendar.getInstance();
		
		//Ngày đầu tháng
		Calendar start = clone(now);
		start.set(Calendar.DAY_OF_MONTH, 1);
		System.out.println("\nĐầu tháng: " + DateUtils.toString(start, DEFAULT_PATTERN));
		
	}
	
	public static Calendar clone (Calendar c) {
		Calendar cloned = Calendar.getInstance();
		cloned.setTime(c.getTime());
		return cloned;
	}
	
}
