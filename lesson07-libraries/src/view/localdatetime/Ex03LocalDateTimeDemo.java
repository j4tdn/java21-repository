package view.localdatetime;

import static utils.DateUtils.*;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;


public class Ex03LocalDateTimeDemo {
	public static void main(String[] args) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		LocalDateTime sDateTime = LocalDateTime.of(2023, 10, 15, 14, 20, 10);
		
		LocalDateTime eDateTime = LocalDateTime.parse("28/10/2023 17:40:50", dtf);
		
		System.out.println("sdatetime: " + sDateTime);
		System.out.println("edatetime: " + eDateTime);
		
		if (sDateTime.isAfter(eDateTime)) {
			throw new IllegalArgumentException("DateTime is invalid !!!");
		}
		
		// thời gian bắt đầu
		LocalDate sdate = sDateTime.toLocalDate();
		LocalTime stime = sDateTime.toLocalTime();
		
		// Thời gian kết thúc
		LocalDate edate = eDateTime.toLocalDate();
		LocalTime etime = eDateTime.toLocalTime();
		
		// Tính hiệu
		Period period = Period.between(sdate, edate);
		Duration duration = Duration.between(stime, etime);
		
		// Mượn 1 ngày khi duration là giá trị âm
		if (duration.isNegative()) {
			duration = duration.plusDays(1);
			period = period.minusDays(1);
		}
		
		System.out.println("\nResult --> " 
				+ optional(period.getYears(), "year") 
				+ optional(period.getMonths(), "month") 
				+ optional(period.getDays(), "day")
				+ optional(duration.toHoursPart(), "hour")
				+ optional(duration.toMinutesPart(), "minute")
				+ optional(duration.toSecondsPart(), "second"));
	}
}
