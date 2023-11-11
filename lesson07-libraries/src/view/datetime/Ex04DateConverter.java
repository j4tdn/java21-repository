package view.datetime;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex04DateConverter {

	public static void main(String[] args) {
		
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		df.setLenient(false); // format in rage
		
		// input
		Calendar c = Calendar.getInstance();
		Date date = new Date();
		String text = "24/10/2023";
		
		// converter
		
		// calendar -> date:
		Date convertedDate = c.getTime();
		System.out.println("calendar -> date: " + convertedDate);
		
		// calendar -> date -> String:
		String convertedText = df.format(convertedDate);
		System.out.println("\ncalendar -> date -> String: " + convertedText);
		
		// date -> calendar:
		Calendar convertedCalendar = Calendar.getInstance();
		convertedCalendar.setTime(date);
		System.out.println("\ndate -> calendar: " + convertedCalendar);
		
		// string -> date
		try {
			convertedDate = df.parse(text);  // 10/10/2023(đúng)  sai(20.10.2023 abc)
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println("\nstring -> date: " + convertedDate);
		
	}
}
