package view.datetime;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Ex01BasicDemo {

	public static void main(String[] args) {
		
		/*
		 Java07: java.util.Date, java.util.Calendar
		
		 Date: thường được dùng để lưu trữ
		     : không hỗ trợ quá nhiều hàm xử lý(deprecated from 1.1)
		     
		 Calendar: cho phép lưu trữ
		         : hỗ trợ các hàm xử lý
		 */
		
		// demo with java.util.Date
		Date date = new Date();
		System.out.println("date: " + date); // date: Tue Oct 24 17:39:59 ICT 2023
		
		Date configuredDate = new Date(7600233);
		System.out.println("configuredDate:  " + configuredDate);
		
		
		System.out.println("\n===================\n");
		printAvailableTimeZones();
		
		
		// demo with Calendar(code with style of singleton pattern)
		Calendar c = Calendar.getInstance();
		System.out.println("calendar time --> " + c);
		
		TimeZone tzBerlin = TimeZone.getTimeZone("Europe/Berlin");
		Calendar cBerlin = Calendar.getInstance(tzBerlin);
		System.out.println("calendar berlin time --> " + cBerlin);
		
		// calendar: fields[]
		
		cBerlin.set(Calendar.YEAR, 2000);// fields[1] = 2000
		
		int year = cBerlin.get(Calendar.YEAR); // fields[1]
		int hour = cBerlin.get(Calendar.HOUR_OF_DAY);
		int minute = cBerlin.get(Calendar.MINUTE);
		int second = cBerlin.get(Calendar.SECOND);
		
		System.out.println("berlin year: " + year);
		System.out.println("berlin time: " + (hour + ":" + minute + ":" + second));
	}
	
	private static void printAvailableTimeZones() {
		String[] tzIds = TimeZone.getAvailableIDs();
		for (String tzId: tzIds) {
			System.out.println("tzId --> " + tzId);
		}
	}
}
