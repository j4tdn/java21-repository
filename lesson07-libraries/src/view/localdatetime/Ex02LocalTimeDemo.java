package view.localdatetime;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ex02LocalTimeDemo {
	public static void main(String[] args) {
		LocalTime sTime = LocalTime.of(19, 30, 20);
		
		LocalTime eTime = LocalTime.parse("22:06:10", DateTimeFormatter.ofPattern("HH:mm:ss"));
		
		System.out.println("sTime: " + sTime);
		System.out.println("eTime: " + eTime);
		
		//Tìm hiệu giữa localtime -> duration
		Duration duration = Duration.between(sTime, eTime);
		System.out.println("Duration: " + duration); //PT2H35M50S PT 2H 35M 50S
		
		long hours = duration.toHoursPart();
		long minutes = duration.toMinutesPart();
		long seconds = duration.toSecondsPart();
		
		System.out.println(hours);
		System.out.println(minutes);
		System.out.println(seconds);
	}
}
