package view.localdatetime;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class Ex04TimeZoneDemo {
	public static void main(String[] args) {
		// TimeZone = ZoneId
		// GTM+7, UTC+7
		// Europe/Berlin
		// ICT, HST
		
		ZoneId zoneId = ZoneId.of("Europe/Berlin");
		
		LocalDateTime ldatetime = LocalDateTime.now(zoneId);
		
		System.out.println("ldatetime: " + ldatetime);
		
		// Lữu trữ --> LocalDate, LocalTime, LocalDatetime: JAVA 8
		// Xử lý --> dùng các hàm của java8
		//       --> khi nào trong java8 không xử lý đươc, chuyển đổi sang calendar, Date để dùng hàm xử lý trong java7
	}
}
