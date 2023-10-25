package view.localdatetime;
import static date.utils.DateUtils. *;
import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ex02LocalTimeDemo {
	public static void main(String[] args) {
		LocalTime sTime = LocalTime.of(19, 30, 20);
		
		LocalTime eTime = LocalTime.parse("22:06:10", DateTimeFormatter.ofPattern("HH:mm:ss"));
		
		System.out.println("sTime: " + sTime);
		System.out.println("eTime: " + eTime);
		
		// Tìm hiệu giữa 2 localtime --> Duration
		Duration duration = Duration.between(sTime, eTime);
		System.out.println("Duration " + duration);//PT --> 2H 35M 50S
		
		long hours = duration.toHours();
		long minutes = duration.toMillisPart();
		long seconds = duration.toSecondsPart();
		
		System.out.println("\nperiod toString --> " 
						+ optional((int)hours, "hour")
						+ optional((int)minutes, "minute")
						+ optional((int)seconds, "second"));
		

	}
}
