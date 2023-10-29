package ex01;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ex01TheUltimateRelationshipCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

		System.out.println("Nhập thời gian hẹn hò (dd/MM/yyyy HH:mm:ss): ");
		String ip = sc.nextLine();
		
		LocalDateTime start = LocalDateTime.parse(ip, dtf);
		
		// ngày bắt đầu hẹn hò:
		DayOfWeek dayOfStartDate = start.getDayOfWeek();
		System.out.println("ngày bắt đầu hẹn hò là ngày thứ " + dayOfStartDate);
		
		System.out.println("Đã chia tay? (yes/no): ");
		String breakOf = sc.nextLine();
		boolean isBreakup = breakOf.equalsIgnoreCase("y");
		
		Duration duration;
		Period period;
		if (isBreakup) {
			System.out.println("Nhập ngày chia tay(dd/MM/yyyy HH:mm:ss): ");
			String endOf = sc.nextLine();
			LocalDateTime end = LocalDateTime.parse(endOf, dtf);
			period = Period.between(start.toLocalDate(), end.toLocalDate());
			duration = Duration.between(start.toLocalTime(), end.toLocalTime());
			System.out.println("Tổng thời gian hẹn hò: " 
			+ period.getYears() 	+ "Years "  
			+ period.getMonths() 	+ "Months "
			+ period.getDays() 		+  "Days "
			+ duration.toDaysPart() 	+ "Hours "
			+ duration.toMinutesPart() 	+ "Minutes "
			+ duration.toSecondsPart() 	+ "seconds ");
		} else {
			period = Period.between(start.toLocalDate(), LocalDate.now());
			duration = Duration.between(start.toLocalTime(), LocalTime.now());
			System.out.println("Tổng thời gian hẹn hò: " 
					+ period.getYears() 		+ "Years "  
					+ period.getMonths() 		+ "Months "
					+ period.getDays() 			+  "Days "
					+ duration.toDaysPart() 	+ "Hours "
					+ duration.toMinutesPart() 	+ "Minutes "
					+ duration.toSecondsPart() 	+ "seconds ");
		}
		sc.close();

	}
}