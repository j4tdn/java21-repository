package view.localdatetime;

import static utils.DateUtils.optional;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import static utils.DateUtils.*;

public class Ex03LocalDatimeDemo {

	
	public static void main(String[] args) {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		LocalDateTime sdatetime = LocalDateTime.of(2023, 10, 15, 14, 20, 10);
		
		LocalDateTime edatetime = LocalDateTime.parse("28/10/2023 17:40:50", dtf);
		
		System.out.println("sldatetime" + sdatetime);
		System.out.println("eldatetime" + edatetime);
		
		if (sdatetime.isAfter(edatetime)) {
			throw new IllegalArgumentException("DateTime is invalid !!!");
		}
		
		// Thời gian bắt đầu
		LocalDate sdate =  sdatetime.toLocalDate();
		LocalTime stime =  edatetime.toLocalTime();
		
		
		// Thời gian kết thúc
		LocalDate edate =  edatetime.toLocalDate();
		LocalTime etime =  edatetime.toLocalTime();
		
		// Tính hiệu
		Period period = Period.between(sdate, edate);
		Duration duration = Duration.between(stime, etime);
		
		System.out.println("\nResult -->"
				+ optional(period.getYears(), "year")
				+ optional(period.getMonths(), "month")
				+ optional(period.getDays(), "day")
				+ duration(duration.toHoursPart(), "hour")
				+ duration(duration.toMinutesPart(), "minute")
				+ duration(duration.toSecondsPart(), "second"));
				
		}
}
