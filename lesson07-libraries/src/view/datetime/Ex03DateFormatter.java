package view.datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex03DateFormatter {

	//JV07: DateFormat, SimpleDateFormat
	
	public static void main(String[] args) {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy EEEE a");
		
		Date date = new Date();
		System.out.println("date: " + df.format(date));
		System.out.println();
		
		Calendar c = Calendar.getInstance();
		Date cDate = c.getTime();
		System.out.println("calendar: " + df.format(cDate));
	}
}
