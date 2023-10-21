package view.datetime;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Ex01BasicDemo {
	public static void main(String[] args) {

		// Java07 : java.util.Date , java.util.Calender
		// Date : thường đc dùng để lưu trữ
		// : Không hỗ trợ quá nhiều hàm sử lí(deprecated from 1.1 )

		// Calender : Cho phép lưu trữ
		// : Hỗ trợ các hàm sử lí.

		// Demo with java.util.Date
		Date date = new Date();
		System.out.println("Date: " + date); // Date: Sat Oct 21 19:43:39 ICT 2023

		Date configuredDate = new Date(7600233);
		System.out.println("ConfiguredDate: " + configuredDate);

		System.out.println("timeZone default: " + TimeZone.getDefault());
		printAvailableTimeZones();

		// demo with Calendar( Code with style of singleton pattern)
		// java.util.GregorianCalendar[time=1697893312835,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Saigon",offset=25200000,dstSavings=0,useDaylight=false,transitions=10,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2023,MONTH=9,WEEK_OF_YEAR=42,WEEK_OF_MONTH=3,DAY_OF_MONTH=21,DAY_OF_YEAR=294,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=1,SECOND=52,MILLISECOND=835,ZONE_OFFSET=25200000,DST_OFFSET=0]

		Calendar c = Calendar.getInstance();
		System.out.println("Calendar Time --> " + c);
		TimeZone tzBerlin = TimeZone.getTimeZone("Europe/Berlin");
		Calendar cBerlin = Calendar.getInstance(tzBerlin);

		System.out.println("calendar berlin time--> " + tzBerlin);
		
		cBerlin.set(Calendar.YEAR, 2000);//calendar: fields[]
		
		int year = cBerlin.get(Calendar.YEAR);
		int hour =cBerlin.get(Calendar.HOUR_OF_DAY);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		
		
		System.out.println("Berlin year " + year);
		System.out.println("Berlin time: " +(hour + ":" +minute + ":" +second));
	}

	private static void printAvailableTimeZones() {
		String[] tzIds = TimeZone.getAvailableIDs();
		for (String tzId : tzIds) {
			System.out.println("tzId --> " + tzId);
		}
	}

}
