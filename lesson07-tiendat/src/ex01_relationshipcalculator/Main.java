package ex01_relationshipcalculator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		System.out.println("Enter the start date (yyyy-MM-dd HH:mm:ss):");
		String startDateStr = scanner.nextLine();
		Date startDate = null;

		try {
			startDate = dateFormat.parse(startDateStr);
		} catch (ParseException e) {
			System.out.println("Invalid date format. Please use yyyy-MM-dd HH:mm:ss format.");
			System.exit(1);
		}

		System.out.println("Have you broken up? (yes/no):");
		String breakupOption = scanner.nextLine();

		Date breakupDate = null;
		if (breakupOption.equalsIgnoreCase("yes")) {
			System.out.println("Enter the breakup date (yyyy-MM-dd HH:mm:ss):");
			String breakupDateStr = scanner.nextLine();
			try {
				breakupDate = dateFormat.parse(breakupDateStr);
			} catch (ParseException e) {
				System.out.println("Invalid date format. Please use yyyy-MM-dd HH:mm:ss format.");
				System.exit(1);
			}
		} else {
			breakupDate = new Date();
		}

		Calendar startCalendar = Calendar.getInstance();
		startCalendar.setTime(startDate);
		int dayOfWeek = startCalendar.get(Calendar.DAY_OF_WEEK);

		long durationInMillis = breakupDate.getTime() - startDate.getTime();
		long seconds = durationInMillis / 1000;
		long minutes = seconds / 60;
		long hours = minutes / 60;
		long days = hours / 24;

		long years = days / 365;
		days = days % 365;
		long months = days / 30;
		days = days % 30;

		hours = hours % 24;
		minutes = minutes % 60;
		seconds = seconds % 60;

		System.out.println("The relationship started on day " + dayOfWeek + " of the week.");
		System.out.println("The duration of the relationship is: " + years + " years, " + months + " months, " + days
				+ " days, " + hours + " hours, " + minutes + " minutes, " + seconds + " seconds");

	}

}
