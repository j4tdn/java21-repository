package ex02;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Scanner;

public class Ex02Java8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LocalDate date = null;
		boolean status = true;
		
		do {
			System.out.println("Enter the date: ");
			String start = sc.nextLine();
			try {
				date = format(start);
				status = true;
			} catch (Exception e) {
				status = true;
			}
		} while (status == false);
		
		System.out.println("It is a day number " + date.getDayOfYear() + " of the year, " + (date.lengthOfYear() - date.getDayOfYear()) + " days left");
		System.out.println("It is a " + date.getDayOfWeek() + " number " + (date.getDayOfYear()/7 + 1) + " out of " + date.lengthOfYear()/7 + " in " + date.getYear());
		//System.out.println("It is a " + date.getDayOfWeek() + " number " +  + " out of " );
		System.out.println("Year " + date.getYear() + " has " + date.lengthOfYear() + " days.");
		System.out.println(date.getMonth() + " " + date.getYear() + " has " + date.lengthOfMonth() + " days.");
	}
	public static LocalDate format(String datetime) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date = LocalDate.parse(datetime, dtf);
		return date;
	}
	
	
}
