package view.datetime;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Ex01BasicDemo {

	public static void main(String[] args) {
		
		/*
		 
		 Java7: jave.util.Date, java.util.Calender
		 
		 Date: thường được dùng để lưu trữ
		 	 : không hỗ trợ quá nhiều hàm xử lý
		 	 
		 Calendar: thường được dùng để lưu trữ
		 	 : hỗ trợ quá nhiều hàm xử lý
		 */
		
		// demo with java.util.Date
		Date date = new Date();
		System.out.println("date: " + date); // Sat Oct 21 19:43:45 ICT 2023(os time)
		
		Date configureDate = new Date(1000000000);
		System.out.println("configureDate: " + configureDate);
		
		System.out.println("\n======\n");
		
		System.out.println("TimeXone default: " + TimeZone.getDefault());
		
		
		// demo with Calendar(code with style of singleton pattern)
		// java.util.GregorianCalendar[time=1698038684392,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Bangkok",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2023,MONTH=9,WEEK_OF_YEAR=43,WEEK_OF_MONTH=4,DAY_OF_MONTH=23,DAY_OF_YEAR=296,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=0,HOUR_OF_DAY=12,MINUTE=24,SECOND=44,MILLISECOND=392,ZONE_OFFSET=25200000,DST_OFFSET=0]
		Calendar c = Calendar.getInstance();
		System.out.println("calendar time -->" + c);
		
		TimeZone tzBerlin = TimeZone.getTimeZone("Europe/Berlin");
		Calendar cBerlin = Calendar.getInstance(tzBerlin);
		System.out.println("calender berlin time: " + cBerlin);
		
		// calendar: fields[]

		
		//cBerlin.set(Calendar.YEAR, 2000); // fields[1] = 2000
		
		int year = cBerlin.get(Calendar.YEAR);
		int hour = cBerlin.get(Calendar.HOUR_OF_DAY);
		int minute = cBerlin.get(Calendar.MINUTE);
		int second = cBerlin.get(Calendar.SECOND);
		
		System.out.println("berlin year: " + year);
		System.out.println("berlin time: " + (hour + ":" + minute + ":" + second));
		
		
	}	
}
