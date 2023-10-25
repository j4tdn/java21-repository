package view.localdatetime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import static utils.DateUtils.*;

public class Ex01LocalDateDemo {
	
	// LocalDate --> d/M/y --> weekday, dayOfMonth...
	//			 --> builder(advance) pattern
	
	public static void main(String[] args) {
		LocalDate sdate = LocalDate.now()
						  		   .withDayOfMonth(28)
						  		   .withMonth(6)
						  		   .withYear(2020);
		
		LocalDate edate = LocalDate.parse("24/10/2023", DateTimeFormatter.ofPattern("dd/MM/yyyy"))
								   .plusDays(1);
		
		System.out.println("sdate: " + format(sdate, "dd/MM/yyyy EEEE"));
		System.out.println("edate: " + format(edate, "dd/MM/yyyy EEEE"));
		
		// Hiệu giữa 2 localdate --> period
		Period period = Period.between(sdate, edate);
		System.out.println("\nPeriod: " + period);
		
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
