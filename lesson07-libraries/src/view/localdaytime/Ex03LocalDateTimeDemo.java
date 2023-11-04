package view.localdaytime;

import static utils.DateUtils.optional;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Ex03LocalDateTimeDemo {

	public static void main(String[] args) {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		LocalDateTime sdatetime = LocalDateTime.of(2023, 10, 15, 14, 20, 10);
		
		LocalDateTime edatetime = LocalDateTime.parse("28/10/2023 17:40:50", dtf);
		
		System.out.println("sdatetime: " + sdatetime);
		System.out.println("edatetime: " + edatetime);
		
		if(sdatetime.isAfter(edatetime)) {
			throw new IllegalArgumentException("Datetime is invalid");
			
		}
		
		// thời gian bắt đầu
		LocalDate sdate = sdatetime.toLocalDate();
		LocalTime stime = sdatetime.toLocalTime();
				
		// thời gian kết thúc
		LocalDate edate = edatetime.toLocalDate();
		LocalTime etime = edatetime.toLocalTime();
		
		// tính hiệu
		Period period = Period.between(sdate, edate);
		Duration duration = Duration.between(stime, etime);
		
		// Mượn 1 ngày khi duration là giá trị âm
		if(duration.isNegative()) {
			duration = duration.plusDays(1);
			period = period.minusDays(1);
		}
		
		System.out.println("Result --> " 
				+ optional(period.getYears(), 	"year") 
				+ optional(period.getMonths(), 	"month") 
				+ optional(period.getDays(), 	"day")
				+ optional(duration.toHoursPart(), 		"hour")
				+ optional(duration.toMinutesPart(), 	"minute")
				+ optional(duration.toSecondsPart(), 	"second"));

	}
}
