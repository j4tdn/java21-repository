package view.localdatetime;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class Ex04TimeoZoneDemo {
	
	public static void main(String[] args) {
		// TimeZone = ZoneId
		// GTM+7, UTC+7
		
		ZoneId zoneId = ZoneId.of("Euro/Berlin");
		
		LocalDateTime ldatetime = LocalDateTime.now(zoneId);
		
		System.out.println(ldatetime);
	}
	


}
