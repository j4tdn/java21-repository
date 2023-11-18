package view.localdatetime;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class Ex04TimeZoneDemo {

	
	public static void main(String[] args) {
		
		// TimeZone = ZoneId
		// 
		
		ZoneId zoneId = ZoneId.of("Europe/Berlin");
		
		LocalDateTime ldatetime = LocalDateTime.now(zoneId);
		
		System.out.println("ldatetime: " + ldatetime);
		
		// lưu trữ --> LocalDate, LocalTime, LocalDateTime:Java08
		
		// Xử lý: dùng các hàm của jv08
		
		//		-> khi nào Jv08 ko xử lý đc thì chuyển sang Calendar, Date để dùng hàm xử lý trong Jv07
	}
}
