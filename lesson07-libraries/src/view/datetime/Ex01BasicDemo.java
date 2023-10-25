package view.datetime;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Ex01BasicDemo {

	public static void main(String[] args) {
		
		/*
		    Java07: java.util.Date, java.util.Calendar
		    
		 	Date: thường đc dùng để lưu trữ
		 		  ko hỗ trợ quá nhiều hàm xử lý
		 	
		 	Calendar: cho phép lưu trữ
		 			  hỗ trợ các hàm xử lý
		 			  
		 	
		 */
		
		// demo with java.util.Date
		
		Date date = new Date();
		System.out.println("date: " + date);
		
		Date configureDate = new Date(7600233);
		System.out.println("configureDate: " + configureDate);
		
		// demo with Calendar(code with style of singleton pattern)
		System.out.println("\n===================\n");
		
		System.out.println("timeZone default: " + TimeZone.getDefault());
		
		Calendar c = Calendar.getInstance();
		System.out.println("calendar time --> " + c);
		
		TimeZone tzBerlin = TimeZone.getTimeZone("Europe/Berlin");
		Calendar cBerlin = Calendar.getInstance(tzBerlin);
		System.out.println("calendar berlin time --> " + cBerlin);
		
		// calendar: fields[]
		cBerlin.set(Calendar.YEAR, 2000);
		int hour = 
		
	}
	
}
