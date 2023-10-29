package view.datetime;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		// 
		
		/*
		 Java07: java.utils.Calendar
		 Date: thường đc dùng để lưu trữ
		 	 : không hỗ trơ nhiều hàm xử lý(deprecated from 1.1)
		 	 
		 Calendar: cho phép lưu trữ 
		 		 : hỗ trợ các hàm xử lý
		 **/
		
		//demo with java.util.Date
		
		Date date = new Date();
		System.out.println("date: " + date); //(os time)
		
		Date configureDate = new Date(7600233);
		System.out.println("configure: " + configureDate);
		
		System.out.println("timezone default: " + TimeZone.getDefault());
		
		// demo with Calendar (code with style of singleton pattern)
		Calendar c = Calendar.getInstance();
		System.out.println("calendar time --> " + c);
		
		TimeZone tzBerlin = TimeZone.getTimeZone("Euro/Berline");
		Calendar cBerlin = Calendar.getInstance(tzBerlin);
		
		System.out.println("calendar berlin time" + cBerlin);
		
		int year = cBerlin.get(Calendar.YEAR);
		int hour = cBerlin.get(Calendar.HOUR_OF_DAY);
		int minute = cBerlin.get(Calendar.MINUTE);
		int second = cBerlin.get(Calendar.SECOND);
		
		System.out.println("berlin year " + year);
		System.out.println("berlin time " + (hour + ":" + minute + ":" + second));
		
		//printAvailableTimeZone();
	}
	
	private static void printAvailableTimeZone() {
		String[] tzIds = TimeZone.getAvailableIDs();
		for (String tzId: tzIds) {
			System.out.println("tzid --> " + tzId);
		}
	}
	
}
