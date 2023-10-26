package view.localdaytime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import static utils.DateUtils.*;

public class Ex01LocalDayDemo {

	// LocalDate --> d/M/y --> weekday, dayOfMonth ...
	//			 --> builder(advance)
	public static void main(String[] args) {
		LocalDate sdate = LocalDate.now().withDayOfMonth(28).withMonth(6).withYear(2020); // 28/6/2023
		
		
		LocalDate edate = LocalDate.parse("24/10/2023", DateTimeFormatter.ofPattern("dd/MM/yyyy")).plusDays(1);
		
		
		System.out.println("sdate: " + sdate);
		
		
		// hiệu giữa 2 localdate -> period
		Period period =  Period.between(sdate, edate);
		System.out.println("period: " + period);
		
		int years = period.getYears();
		int months = period.getMonths();
		int days = period.getDays();
		
		System.out.println("period toString --> " 
				+ optional(years, "year") 
				+ optional(months, "month") 
				+ optional(days, "day"));
	}
	
	
	
	
	private static String format(LocalDate ldate, String pattern) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
		return dtf.format(ldate);
	}
}
