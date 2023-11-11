package view.datetime;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Ex01BasicDemo {
	
	public static void main(String[] args) {
	
		/* 
		 	Java07: java.util.Date, java.util.Calendar
			Date: thường đc dùng để lưu trữ
				: không hỗ trợ quá nhiều hàm xử lý(depracated from 1.1)
			
			Calendar: cho phép lưu trữ
					: hỗ trợ các hàm xử lý
		*/
		
		// Demo with java.util.Date
		Date date = new Date();
		System.out.println("date: " + date);	// 
		
		Date configuredDate = new Date(7600233);
		System.out.println("configuredDate: " + configuredDate);
		
		System.out.println("\n================================================\n");
		
		System.out.println("timeZone default: " + TimeZone.getDefault());
		printAvailableTimezones();
		// Demo with Calendar(code with style of singleton pattern)
		
		Calendar c = Calendar.getInstance();
		System.out.println("calendar time --> " + c);
		
		TimeZone tzBerlin = TimeZone.getTimeZone("Europe/Berlin");
		Calendar cBerlin = Calendar.getInstance(tzBerlin);
		System.out.println("calendar Berlin time: " + cBerlin);
		
		// Calendar: fields[]
		
		c.set(Calendar.YEAR, 2000); //fields[1] = 2000
		
		int year = cBerlin.get(Calendar.YEAR);
		int hour = cBerlin.get(Calendar.HOUR);
		
		System.out.println(year);
		System.out.println(hour);
	}
	
	private static void printAvailableTimezones() {
		String[] tzIds = TimeZone.getAvailableIDs();
		for (String tzId : tzIds) {
			System.out.println("tzId: " + tzId);
		}
	}
}
