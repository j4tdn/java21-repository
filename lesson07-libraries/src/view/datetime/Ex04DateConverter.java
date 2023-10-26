package view.datetime;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex04DateConverter {

	public static void main(String[] args) {
		
		//input
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		df.setLenient(false); // format in rage
		Calendar c = Calendar.getInstance();
		Date date = new Date();
		String text = "24/10/2023";
		
		// converter
		// calendar -> date
		Date convertedDate = c.getTime();
		System.out.println("calendar - > date:" + convertedDate);
		
		// calendar ->string
		String convertedText = df.format(convertedDate);
		System.out.println("calendar -> string: " + convertedText);
		
		//date -> calendar
		Calendar convertedCalendar = Calendar.getInstance();
		convertedCalendar.setTime(date);
		System.out.println("date -> calendar: " + convertedCalendar);
		
		// string -> date
		try {
			convertedDate = df.parse(text); // 10/10/2023 20.10.2023 abc
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
}
