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
		
		// tìm hiệu giữa 2 localtime --> Duration
		Duration duration = Duration.between(sTime, eTime);
		System.out.println("durattion: " + duration);
		
		long hours = duration.toHours();
		long minutes = duration.toMinutesPart();
		long seconds = duration.toSecondsPart();
		
		System.out.println("\nperiod String --> "
				+ optional(hours, "hours")
				+ optional(minutes, "minute")
				+ optional(seconds, "second"));
	}
}
