package view.localdatetime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import static utils.DateUtils.*;

public class Ex01LocalDateDemo {

	public static void main(String[] args) {
		LocalDate sDate = LocalDate.now().withDayOfMonth(28).withMonth(6).withYear(2020); // 28/06/2020

		LocalDate eDate = LocalDate.parse("24/10/2023", DateTimeFormatter.ofPattern("dd/MM/yyyy")).plusDays(1);

		System.out.println("ldate: " + format(sDate, "dd/MM/yyyy EEEE"));

		System.out.println("edate: " + format(eDate, "dd/MM/yyyy EEEE"));

		// Hiệu giữ 2 localdate --> period
		Period period = Period.between(sDate, eDate);
		System.out.println("period: " + period); // P3Y3M27D -> 3Y 3M 27D
		int year = period.getYears();
		int month = period.getMonths();
		int day = period.getDays();
		System.out.println(
				"\nPeriod toString --> " + optional(year, "Year") + optional(month, "Month") + optional(day, "Day"));
	}


	private static String format(LocalDate ldate, String pattern) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
		return dtf.format(ldate);
	}
}
