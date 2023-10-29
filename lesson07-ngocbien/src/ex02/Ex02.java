package ex02;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

public class Ex02 {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.set(1995, Calendar.SEPTEMBER, 25);

		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

		Date convertedDate = c.getTime();

		String convertedText = df.format(convertedDate);
		System.out.println("calendar -> string: " + convertedText);

		int doy = c.get(Calendar.DAY_OF_YEAR);
		int daysLeft = c.getActualMaximum(Calendar.DAY_OF_YEAR) - doy;
		
		System.out.println("It is day number " 
							+ doy + " of the year, " 
							+ daysLeft + " days left");
		
		// dayofyear
		int year = c.get(Calendar.YEAR);
		int dayOfYear = c.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println("Year " + year + " has " + dayOfYear + " days ");
		
		// daysofseptemper
		int month = c.get(Calendar.MONTH);
		int maxDayOfMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(month + " " + year + " has " + maxDayOfMonth);
		
		// week of year
		//int week = c.get(Calendar.DAY_OF_WEEK_IN_MONTH);
		//int maxweek = c.getActualMaximum(Calendar.WEEK_OF_MONTH);
		
		//System.out.println("It is " );
	}
	
	public static Date toDate(String text, String pattern, boolean isLenient) {
		Objects.requireNonNull(text, "text should not be null");
		Objects.requireNonNull(pattern, "pattern is invalid");
		
		DateFormat df = new SimpleDateFormat(pattern);
		df.setLenient(isLenient);
		Date date = null;
		try {
			date = df.parse(text);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	
	

}
