package view.datetime;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex04DateConverter {
public static void main(String[] args) {
	
	DateFormat df = new  SimpleDateFormat("dd/MM/yyyy");
	df.setLenient(false); //format in range
	
	
	//input
	Calendar c = Calendar.getInstance();
	Date date = new Date();
	String text = "40/10/2023";
	
	
	// converter
	// calender -> date
	Date convertedDate = c.getTime();
	System.out.println("calendar -> date: " + convertedDate);
	
	// calender -> date -> string
	String convertedText = df.format(convertedDate);
	System.out.println("\ncalendar -> date -> string: " + convertedText);
	
	// date -> calender
	Calendar convertedCalender = Calendar.getInstance();
	convertedCalender.setTime(date);
	System.out.println("\ndate -> calender: " + convertedCalender);
	
	//String -> date;
	try {
		convertedDate = df.parse(text);
	} catch (ParseException e) {
		e.printStackTrace();
	}
	System.out.println("\nString -> date: " + convertedDate);
}
}
