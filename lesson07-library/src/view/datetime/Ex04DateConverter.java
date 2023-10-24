package view.datetime;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex04DateConverter {
	public static void main(String[] args) {
			
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		df.setLenient(false); // rào dữ liệu để đảm bảo format in rage. 
		
		//input
		Calendar c = Calendar.getInstance();
		Date date = new Date();
		String text = "24/10/2023";
		
		//converter
		//calendar --> date
		Date convertedDate = c.getTime();
		System.out.println("calendar -> date " +  convertedDate);
		
		// calendar --> String
		String converredText = df.format(convertedDate);
		System.out.println("calendar -> string " +  converredText);
		
		//date --> calendar
		Calendar converterCalendar = Calendar.getInstance();
		converterCalendar.setTime(date);
		System.out.println("date -> calender " +  converterCalendar);
		
		//String --> date
		try {
			convertedDate = df.parse(text); //10/10/2023 20.10.2023 abc
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println("String -> date " +  convertedDate);
		
	}
}
