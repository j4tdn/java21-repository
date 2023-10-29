package view.localdatetime;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class Ex04TimeZoneDemo {

	public static void main(String[] args) {
		
		// TimeZone = ZoneId
		// GMT+7, UTC+7
		// Europe/Berlin
		// ICT, HST
		
		ZoneId zoneId = ZoneId.of("Europe/Berlin");
		
		LocalDateTime ldatetime = LocalDateTime.now(zoneId);
		
		System.out.println("ldatetime: " + ldatetime);
		
		// Lưu trữ --> LocalDate, LocalTime, LocalDateTime
		
		// Xử lý --> Dùng các hàm của JAVA08
		
		//       --> Khi nào trong JAVA08 ko xử lý được --> Chuyển sang Calendar, Date
		// để dùng hàm xử lý trong JAVA07
		
		
	}
}
