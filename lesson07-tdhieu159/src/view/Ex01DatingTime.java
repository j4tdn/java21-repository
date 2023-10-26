package view;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;


public class Ex01DatingTime {
private static final String pattern = "HH:mm:ss dd/MM/yyyy";
	
	public static void main(String[] args) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
		
		LocalDateTime start = LocalDateTime.parse("15:20:40 15/06/2018", dtf);
		LocalDateTime end = LocalDateTime.parse("20:25:45 15/08/2020", dtf);
		
		if (start.isAfter(end)) {
			throw new IllegalArgumentException("Ngày bắt và ngày kết thúc không hợp lệ !!!");
		}
		
		LocalDate startDate = start.toLocalDate();
		LocalDate endDate = end.toLocalDate();
		
		Period period = Period.between(startDate, endDate);
		
		LocalTime startTime = start.toLocalTime();
		LocalTime endTime = end.toLocalTime();

		Duration duration = Duration.between(startTime, endTime);

		if (duration.isNegative()) {
			duration = duration.plusDays(1);
			endDate = endDate.minusDays(1);
		}

		System.out.println("----- Dating has lasted -----");
		System.out.println(getUnit(period.getYears(), " year(s) ")
				 + getUnit(period.getMonths(), " month(s) ")
				 + getUnit(period.getDays(), " day(s) ")
				 + getUnit(duration.toHoursPart(), " hour(s) ")
				 + getUnit(duration.toMinutesPart(), " minute(s) ")
				 + getUnit(duration.toSecondsPart(), " second(s)"));

		LocalDate date = LocalDate.of(2018, Month.JUNE, 15);
		System.out.println("-----Weekday of starting date-----");
		System.out.println(date.getDayOfWeek());

	}
	
	private static String getUnit(int value, String unit) {
		return value == 0 ? "" : value + unit;
	}

}