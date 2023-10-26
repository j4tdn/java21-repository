package view.localdatetime;

import static utils.DateUtils.optional;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import static utils.DateUtils.*;
public class Ex02LocalTimeDemo {

	public static void main(String[] args) {
		 LocalTime sTime = LocalTime.of(19, 30, 20);
		 
		 LocalTime eTime = LocalTime.parse("22:06:10", DateTimeFormatter.ofPattern("HH:mm:ss"));
		 
		 System.out.println("sTime: " +sTime);
		 System.out.println("sTime: " +eTime);
		 
		 //Tìm hiệu giữa 2 localTime --> Duration
		 Duration duration = Duration.between(sTime, eTime);
		 System.out.println("duration: " +duration);  // PT --> PT2H35M50S
		 
		 long hours = duration.toHours();
		 long minutes = duration.toMinutesPart();
		 long seconds = duration.toSecondsPart();
		 
		 System.out.println("\nperiod toString -->"
					+ optional(hours, "hour")
					+ optional(minutes, "minute")
					+ optional(seconds, "second"));
	}
}
