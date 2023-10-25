package view.localdatetime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import static date.utils.DateUtils. *;

public class Ex01LocalDateDemo {
	// LocalDate --> d/M/y --> weekday, dayOfMonth ...
	// 					   --> builder(advance)
	public static void main(String[] args) {
		
		LocalDate sDate = LocalDate.now()
							.withDayOfMonth(28)
							.withMonth(6); // 28/06/2023
		
		LocalDate eDate = LocalDate.parse("24/10/2023",DateTimeFormatter.ofPattern("dd/MM/yyyy") );
		System.out.println("edate: " + format(sDate, "dd/MM/yyyy EEEE"));

		System.out.println("ldate: " + format(sDate, "dd/MM/yyyy EEEE"));
		
		// Hiệu giữa 2 localdate --> Period
		Period period = Period.between(sDate, eDate);
		System.out.println("period: " + period); // P -> 3Y 3M 27D, P -> 3M 27D
		
		int years = period.getYears();
		int months = period.getMonths();
		int days = period.getDays();
		
		System.out.println(optional(years, "year") 
						 + optional(months, "month")
						 + optional(days, "day"));
	}
	
	
	private static String format(LocalDate ldate, String pattern) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
		return dtf.format(ldate);
	}
}
