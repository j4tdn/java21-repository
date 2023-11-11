package view.localdatetime;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import static utils.DateUtils.*;

public class Ex02LocalTimeDemo {

	public static void main(String[] args) {
		
		LocalTime sTime = LocalTime.of(19, 30, 20);
		LocalTime eTime = LocalTime.parse("22:06:10", DateTimeFormatter.ofPattern("HH:mm:ss"));
		
		System.out.println("sTime: " + sTime);
		System.out.println("eTime: " + eTime);
		
		// Tìm hiệu giữa 2 localtime --> Duration
		Duration duration = Duration.between(sTime, eTime);
		System.out.println("duration: " + duration); // PT --> 2H 35M 50S
		
		long hours = duration.toHours();
		long minutes = duration.toMinutesPart();
		long seconds = duration.toSecondsPart();
		
		System.out.println("\nPeriod to String --> "
				  +	optional(hours, "hour")
				  + optional(minutes, "minute")
				  + optional(seconds, "second"));
		
		/*
			 duration: PT2H35M50S
			 hours: 2
			 minutes: 155
			 seconds: 9350 
		 */
	}
}
