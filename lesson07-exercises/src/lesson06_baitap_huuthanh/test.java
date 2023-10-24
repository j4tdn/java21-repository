package lesson06_baitap_huuthanh;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class test {
	public static void main(String[] args) {
		// Java07: DateFormat, SimpleDateFormat
		// #format(java.util.Date)

		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

		Date date = new Date();
		System.out.println("date: " + df.format(date));

		Calendar c=Calendar.getInstance();
		Date cDate = new Date();
		System.out.println("calendar -->" +df.format(cDate));
	}
}