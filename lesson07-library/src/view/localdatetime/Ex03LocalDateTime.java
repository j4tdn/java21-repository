package view.localdatetime;

import static utils.DateUtils.optional;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

public class Ex03LocalDateTime {
	public static void main(String[] args) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		LocalDateTime sdatetime = LocalDateTime.of(2023, 10, 15, 14, 20, 10);
		LocalDateTime edatetime = LocalDateTime.parse("28/10/2023 17:40:50", dtf);
		
		System.out.println("sdatetime:" +sdatetime);
		System.out.println("edatetime:" +edatetime);
		
		if (sdatetime.isAfter(edatetime)) { //isAfter hàm so sánh 
			throw new IllegalArgumentException("Date time is invalid!!!");
		}
		
		//Thoi gian bat dau
		LocalDate sdate = sdatetime.toLocalDate();
		LocalTime stime = sdatetime.toLocalTime();
		
		//thoi gian ket thuc
		LocalDate edate = edatetime.toLocalDate();
		LocalTime etime = edatetime.toLocalTime();
		
		//Tinh hieu
		Period period = Period.between(sdate, edate);
		Duration duration = Duration.between(stime, etime);
		
		if(duration.isNegative()) {
			duration = duration.plusDays(1);
			period = period.minusDays(1);
		}
		
		System.out.println("\nTinh hieu 2 ngay Result: -->"
				+ optional(period.getYears(), "year")
				+ optional(period.getMonths(), "month")
				+ optional(period.getDays(), "day")
				+ optional(duration.toHoursPart(), "hour")
				+ optional(duration.toMinutesPart(), "minute")
				+ optional(duration.toSecondsPart(), "seccond"));
	}
	
}
