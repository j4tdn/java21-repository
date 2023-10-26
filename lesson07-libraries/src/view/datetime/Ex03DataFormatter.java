package view.datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex03DataFormatter {

	public static void main(String[] args) {
		// Java07: DateFormat, SimpleDateFormat
		//  #formaat(java.util.Date)
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		System.out.println("date: " + date);

		System.out.println("date: " + df.format(date));
		
		System.out.println();
		
		Calendar c = Calendar.getInstance();
		Date cDate = c.getTime();
		System.out.println("calendar: " + df.format(cDate));
		}
}
