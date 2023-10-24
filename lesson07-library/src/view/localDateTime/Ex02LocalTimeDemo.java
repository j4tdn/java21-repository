package view.localDateTime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import static utils.DateUtils.*;

public class Ex02LocalTimeDemo {
	
	public static void main(String[] args) {

		LocalTime sTime = LocalTime.of(19, 30, 20);
		
		LocalTime etime = LocalTime.parse("22:06:10", DateTimeFormatter.ofPattern("HH:mm:ss"));
		
		System.out.println("sTime: " +sTime);
		System.out.println("eTime: " +etime);
		
		// Tìm hiệu giữa 2 Localtime --> Duration
		
		Duration duration = Duration.between(sTime, etime);
//		System.out.println("Duration: " + duration);// PT --> 2H 35M 50S
		int hours = duration.toHoursPart();
		int minutes = duration.toMinutesPart();
		int seconds = duration.toSecondsPart();
		System.out.println("Period toString --> "
				+ optional(hours, "Hour")
				+ optional(minutes, "Minute")
				+ optional(seconds, "Second"));
	}
}
