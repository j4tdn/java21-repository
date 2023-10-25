package view.datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ex03DateFormatter {
	static Scanner ip = new Scanner(System.in);
	public static void main(String[] args) {
		// Java07: DateFormat, SimpleDateFormat
		// #format(java.util.Date)
		
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss EEEE a");
		
		Date date = new Date();
		System.out.println("Input time to start dating: ");
		System.out.println("Input day: ");
		date.setDate(Integer.parseInt(ip.nextLine()));
		System.out.println("Input month: ");
		date.setMonth(Integer.parseInt(ip.nextLine()));
		System.out.println("Input year: ");
		date.setYear(Integer.parseInt(ip.nextLine()));
		
		
		
		
	}
	
}
