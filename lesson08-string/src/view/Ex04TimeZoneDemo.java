package view;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class Ex04TimeZoneDemo {
	public static void main(String[] args) {
		// TimeZone = ZoneID

		ZoneId zoneId = ZoneId.of("Europe/Berlin");

		LocalDateTime ldatetime = LocalDateTime.now(zoneId);
		System.out.println("ldatetime: " + zoneId);
		// Luu tru -> LocalDate, LocalTime,LocalDateTime
		//Xu Ly: dung cac ham cua java 8
		//--> khi naof trong java8 khong xu ly duoc thì chuyển qua Calendar, Date

	}
}