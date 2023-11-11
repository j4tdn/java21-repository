package view.datetime;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex03DateFormatter {

	public static void main(String[] args) {
		
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		
		Date date = new Date();
		
		try {
			df.parse("30/18/2022");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		System.out.println("date: " + df.format(date));
		System.out.println();
		
		Calendar c = Calendar.getInstance();
		Date cDate = c.getTime();
		System.out.println("calendar: " + df.format(cDate));
		
	}
}
