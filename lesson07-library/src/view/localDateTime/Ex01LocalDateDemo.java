package view.localDateTime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import static utils.DateUtils.*;

public class Ex01LocalDateDemo {
	
	//LocalDate --> d/M/y --> weekday, dayOfMonth,....
	//		    --> builder(advance)
	
	public static void main(String[] args) {

		LocalDate sdate = LocalDate.now()
				.withDayOfMonth(28)
				.withMonth(10)
				.withYear(2023);
		
		LocalDate edate = LocalDate.parse("24/10/2023", DateTimeFormatter.ofPattern("dd/MM/yyyy"))
										.plusDays(1);
		
		System.out.println("ldate: " +format(sdate, "dd/MM/yyy EEEE"));
		System.out.println("ldate: " +format(edate, "dd/MM/yyy EEEE"));
		
		//Hiệu giữa 2 localdate -->Period
		Period period= Period.between(sdate, edate);
		System.out.println(period);//P 3Y 3M 27D
		int year =period.getYears();
		int month = period.getMonths();
		int days = period.getDays();
		System.out.println(
				optional(year, "Year")
				+ optional(month, "Month")
				+ optional(days, "Day"));
		
	}
	
	
	
	private static String format(LocalDate ldate , String pattern) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
		return dtf.format(ldate);
	}
}
