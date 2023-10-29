package ex03;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class Ex03Java7 {

	public static void main(String[] args) {

		Calendar c = Calendar.getInstance(TimeZone.getTimeZone("Europe/Berlin"));

		DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		df.setTimeZone(TimeZone.getTimeZone("Europe/Berlin"));
		String datetime = df.format(c.getTime());
		System.out.println("Current time in Berlin: " + datetime);

		System.out.println("The last day of current month: " + c.getActualMaximum(Calendar.DATE) + "/"
				+ (c.get(Calendar.MONTH) + 1) + "/" + c.get(Calendar.YEAR));

	}
}
