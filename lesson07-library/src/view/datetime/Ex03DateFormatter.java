package view.datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex03DateFormatter {
	public static void main(String[] args) {
		
		//java 07: Date format, Simple DateFormat
		//#format(java.util.date)
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		
		
		Date date = new Date()	;
		
		System.out.println("Date : " +df.format(date));
		Calendar c = Calendar.getInstance();
	}
}
