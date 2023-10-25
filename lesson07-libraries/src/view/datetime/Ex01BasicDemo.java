package view.datetime;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Ex01BasicDemo {
	
	/*\
	    Java7: java.util.Date, java.util/Calendar
	    
	    Date : thường được dùng để lưu trữ
	    Calendar: cho phép lưu trữ 	 :
	    		: Hỗ trợ các hàm xử lý
	    		
	 */
	public static void main(String[] args) {
		
		//Java07: java.util.Date, java.util.Calendar
		
		//demo with java.util.Date
		
		Date date = new Date();
		System.out.println("date: " + date); //date: Sat Oct 21 19:43:28 ICT 2023(os time)
		
		Date configuredDate = new Date(7600233);
		System.out.println(configuredDate);
		System.out.println("\n===========\n");
		
		System.out.println("time zone: " + TimeZone.getDefault() );
		//demo with Calendar(code with style of singleton pattern)
		//calendar time -->java.util.GregorianCalendar[time=1697893265816,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Saigon",offset=25200000,dstSavings=0,useDaylight=false,transitions=10,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2023,MONTH=9,WEEK_OF_YEAR=42,WEEK_OF_MONTH=3,DAY_OF_MONTH=21,DAY_OF_YEAR=294,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=1,SECOND=5,MILLISECOND=816,ZONE_OFFSET=25200000,DST_OFFSET=0]

		Calendar c = Calendar.getInstance();
		System.out.println("calendar time -->" + c);
		TimeZone tzBerlin = TimeZone.getTimeZone("Europe/Berlin");
		Calendar cBerlin = Calendar.getInstance(tzBerlin);
		System.out.println("Calendar berlin time --> " + cBerlin);
		
		// calendar: field[]
		cBerlin.set(Calendar.YEAR, 2000); // fields[1] = 2000
		int year = cBerlin.get(Calendar.YEAR);
		int hour = cBerlin.get(Calendar.HOUR_OF_DAY);
		int minute = cBerlin.get(Calendar.MINUTE);
		int second = cBerlin.get(Calendar.SECOND);
		
		System.out.println("Year --> "+year);
	}
	
	public static void printAvaiTimeZanes() {
		String[] tzIds = TimeZone.getAvailableIDs();
		for(String tzId: tzIds) {
			System.out.println("tzID --> "+tzId);
		}
	}
}
