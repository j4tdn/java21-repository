package view.localdatetime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import static utils.DateUtils.*;

public class Ex01LocalDateDemo {

	// LocalDate --> dMy --> weekday, dayOfMonth ...
	//           --> builder(advanced)
	public static void main(String[] args) {
		
		LocalDate sDate = LocalDate.now()
				.withDayOfMonth(4)
				.withMonth(8)
				.withYear(2003);
		
//		LocalDate eDate = LocalDate.of(2003, 9, 22);
		LocalDate eDate = LocalDate.parse("22/09/2003", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		System.out.println("sDate: " + format(sDate, "dd/MM/yyyy EEEE"));
		System.out.println("eDate: " + format(eDate, "dd/MM/yyyy EEEE"));
		
		// Hiệu giữa 2 cái localDate --> Period
		Period period = Period.between(sDate, eDate);
		System.out.println("\nperiod: " + period); // P -> 1M 18D
		
		int years = period.getYears();
		int months = period.getMonths();
		int days = period.getDays();
		
		System.out.println("\nperiod toString --> " 
				+ optional(years, "year") 
				+ optional(months, "month") 
				+ optional(days, "day"));
	}
	
	private static String format(LocalDate ldate, String pattern) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
		return dtf.format(ldate);
	}
}
