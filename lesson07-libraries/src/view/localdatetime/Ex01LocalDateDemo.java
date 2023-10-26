package view.localdatetime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import static utils.DateUtils.*;

public class Ex01LocalDateDemo {
	// LocalDate --> d/M/y --> weekday, dayOfMonth ...
	//			 --> 
	
	public static void main(String[] args) {
		LocalDate sDate = LocalDate.now()
							.withDayOfMonth(28)
							.withMonth(6); // 28/06/2023
		
		LocalDate eDate = LocalDate.parse("24/10/2023", DateTimeFormatter.ofPattern("dd/MM/yyyy"))
							.plusDays(1);
		
		System.out.println("sdate: " + format(sDate, "dd/MM/yyyy EEEE"));
		System.out.println("edate: " + format(eDate, "dd/MM/yyyy EEEE"));
		
		// hiệu giữa 2 localdate --> period
		Period period = Period.between(sDate, eDate);
		System.out.println("period: " + period);
		
		int years = period.getYears();
		int months = period.getMonths();
		int days = period.getDays();
		
		System.out.println("\nperiod toString -->"
				+ optional(years, "year")
				+ optional(months, "month")
				+ optional(days, "day"));
	}

	

	private static String format(LocalDate ldaDate, String pattern) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
		return dtf.format(ldaDate);
}
}