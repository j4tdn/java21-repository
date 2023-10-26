package view.datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex04DateConverter {
	
	public static void main(String[] args) {
		
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		df.setLenient(false);  //format in rage  
		
		
		//input
		Calendar c = Calendar.getInstance();
		
		Date date = new Date();
		String text = "30/10/2023";
				
		
		// converter
		//calendar -> date
		Date converterDate = c.getTime();
		System.out.println("Calendar ->date: " +converterDate);
		
		//calendar -> date ->string
		String convertedText = df.format(converterDate);
		System.out.println("Calendar ->date ->String: " +convertedText);
		
		// date -> calendar
		Calendar convertedCalendar = Calendar.getInstance();
		convertedCalendar.setTime(date);
		System.out.println("Date -> Calendar: " +convertedCalendar);
		
		//String -> date
		
		try {
			converterDate = df.parse(text); // 10/10/2023 abc
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("String -> Date:" +converterDate);
		
	}
}
