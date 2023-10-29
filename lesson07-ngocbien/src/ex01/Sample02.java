package ex01;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Sample02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		LocalDateTime startDate = null;
		LocalDateTime endDate = null;
		Boolean status = true;
		
		do {
			System.out.println("Time to start dating: (dd/MM/yyyy HH:mm:ss)");
			
			String start = sc.nextLine();
			
			try {
				startDate = format(start);
				status = true;
			} catch (Exception e) {
				status = false;
			}
		} while (status == false);
		
		System.out.println("The Relationship status ended (Y/N)");
		String choice = sc.nextLine();
		
		if (choice.equalsIgnoreCase("y")) {
			do {
				System.out.println("End date (dd/MM/yyyy HH:mm:ss):");
				String inputEndDate =sc.nextLine();
				try {
					endDate = format(inputEndDate);
					status = true;
				} catch (Exception e) {
					status = false;
				}
			} while (status == false);
		}else if (choice.equalsIgnoreCase("n")) {
			endDate = LocalDateTime.now();
		}
		
		
		Period period = Period.between(startDate.toLocalDate(), endDate.toLocalDate());
		Duration duration = Duration.between(startDate.toLocalTime(), endDate.toLocalTime());
		
		System.out.println("Tổng thời gian hẹn hò: " 
				+ period.getYears() 		+ "Years "  
				+ period.getMonths() 		+ "Months "
				+ period.getDays() 			+ "Days "
				+ duration.toDaysPart() 	+ "Hours "
				+ duration.toMinutesPart() 	+ "Minutes "
				+ duration.toSecondsPart() 	+ "seconds ");
		sc.close();
	}
	
	

	
	
	
	public static LocalDateTime format(String datetime) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		LocalDateTime date = LocalDateTime.parse(datetime, dtf);
		return date;
	}
}