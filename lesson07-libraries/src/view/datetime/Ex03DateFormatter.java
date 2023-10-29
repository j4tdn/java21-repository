package view.datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex03DateFormatter {
	public static void main(String[] args) {
		
		// Java07: DateFormat, SimpleDateFormat
		
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		
		Date date = new Date();
		System.out.println("date: " + df.format(date));
		
		Calendar c = Calendar.getInstance();
		Date cDate = c.getTime();
		System.out.println("calendar: " + df.format(cDate));
		
	}
}
