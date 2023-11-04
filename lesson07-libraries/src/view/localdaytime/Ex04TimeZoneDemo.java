package view.localdaytime;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class Ex04TimeZoneDemo {

	public static void main(String[] args) {
		
		// Timezone = ZoneId
		// GMT+7, UTC+7
		// ICT, HST, Europe/Berlin
		
		ZoneId zoneId = ZoneId.of("Europe/Berlin");
		
		LocalDateTime ldatetime = LocalDateTime.now(zoneId);
		
		System.out.println("ldatetime: " + ldatetime);
		
		// lưu trữ --> localdate, localtime, localdatetime: java08
		
		// xử lý --> dùng các hàm của java08
		
		//		--> khi nào trong java08 ko xử lý được --> chuyển đổi sang calendar, date để dùng hàm xử lý trong java07
		
	}
}
