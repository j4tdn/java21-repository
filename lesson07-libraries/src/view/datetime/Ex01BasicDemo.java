package view.datetime;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		
		/*
		  JV07: java.utils.Date, java.utils.Calendar
		  
		  Date: 	thường đc dùng để lưu trữ, k hỗ trợ quá nhiều hàm xử lý
		  Calendar: k cho phép lưu trữ, hỗ trợ các hàm xử lý
		  
		 */
		
		
		// demo with java.utils.Date	
		
		Date date = new Date();
		System.out.println("date: " + date); // date: Sat Oct 21 19:44:21 ICT 2023
		
		Date configureDate = new Date(7600233);
		System.out.println("configureDate: " + configureDate);
		
		System.out.println("\n================================\n");
		System.out.println("TimeZone default: " + TimeZone.getDefault());
		printAvailableTimeZone();
		
		// demo with Calendar(code with style of singleton pattern)
		
		Calendar c = Calendar.getInstance();
		System.out.println("calendar time:" + c);
		
		TimeZone tzBerlin = TimeZone.getTimeZone("Europe/Berlin");
		Calendar cBerlin  = Calendar.getInstance(tzBerlin);
		System.out.println("calendar Berlin time: " + cBerlin);
		
		// calendar: fields[]
		
		cBerlin.set(Calendar.YEAR, 2000); // fields[1] = 2000
		
		int year = cBerlin.get(Calendar.YEAR);
		int hour = cBerlin.get(Calendar.HOUR_OF_DAY);
		int minute = cBerlin.get(Calendar.MINUTE);
		int second = cBerlin.get(Calendar.SECOND);
		
		System.out.println(year + ", " + hour + ", " + minute + ", " + second);
	}

	private static void printAvailableTimeZone() {
		// TODO Auto-generated method stub
		
	}
}
