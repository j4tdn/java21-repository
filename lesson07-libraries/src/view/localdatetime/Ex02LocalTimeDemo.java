package view.localdatetime;

import static utils.DateUtils.*;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ex02LocalTimeDemo {
	
	public static void main(String[] args) {
		LocalTime sTime = LocalTime.of(19, 30, 20);
		LocalTime eTime = LocalTime.parse("22:06:10", DateTimeFormatter.ofPattern("HH:mm:ss"));
		
		System.out.println("sTime: " + sTime);
		System.out.println("eTime: " + eTime);
		
		// Tìm hiệu giữa 2 localTime --> Duration
		Duration duration = Duration.between(sTime, eTime);
		System.out.println("\nduration: " + duration);
		
		long hours = duration.toHours();
		long minutes = duration.toMillisPart();
		long seconds = duration.toSecondsPart();
		
		System.out.println("\nduration toString --> " 
				+ optional(hours, "hour") 
				+ optional(minutes, "minute") 
				+ optional(seconds, "second"));
	}
	/*
	 * Chuyển 1 KLD ngày tháng năm trong java 7,8 qua String dùng hàm format
	 * Chuyển KLD String sang ngày tháng năm trong java 7,8 dùng hàm parse
	 */
}
