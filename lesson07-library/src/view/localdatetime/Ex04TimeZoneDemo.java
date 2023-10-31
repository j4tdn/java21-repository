package view.localdatetime;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class Ex04TimeZoneDemo {
	public static void main(String[] args) {
			
		//Timezone = Zone id
		//
		//Europe/Berlin
		//ICT, HST
		ZoneId zoneId = ZoneId.of("Europe/Berlin");
		LocalDateTime ldatetime = LocalDateTime.now(zoneId);
		System.out.println("ldatetime:" +ldatetime);
		
		// Lưu trữ: --> LocalDate, LocalTime, LocalDateTime: JAVA 08
		//Xử ;ý -- Dùng các hàm của java 08
		
		// ---> Khi nào trong java 08 không xử lý được
		// --> chuyển đổi sang Calendar, Date để dùng hàm xử lý trong java 7
	}
}
