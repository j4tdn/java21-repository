package view.datetime;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Ex01BasicDemo {
public static void main(String[] args) {
	
	//java 07: java.util.Date java.utils.Calendar
	
	//date: thường được dùng để lưu trữ
	// 		không hỗ trợ quá nhiều hàm xử lý (deprecated from 1.1)
	
	//Calendar: cho phép lưu trữ
	//		  : hỗ trợ các hàm  xử lý
	
	// demo with java.uitl.Date
	Date date = new Date();
	System.out.println("Date : " + date); // Date : Sat Oct 21 19:43:36 ICT 2023 (os time)
	
	Date configuredDate = new Date(7600233);
	System.out.println("configuredDate: " +configuredDate);
	
	System.out.println("======================");
	
	System.out.println("Time zone . getdefault" +TimeZone.getDefault());
	//demo with Calendar  (code with style of singleton pattern)
	//java.util.GregorianCalendar[time=1697893289994,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Bangkok",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=1,ERA=1,YEAR=2023,MONTH=9,WEEK_OF_YEAR=43,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=294,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=1,SECOND=29,MILLISECOND=994,ZONE_OFFSET=25200000,DST_OFFSET=0]

	Calendar c = Calendar.getInstance();
	System.out.println(" calendar time:" +c);
	
	printAvailableTimeZone();
	
	// calendar: fields[]
	
	
	//Viết hàm láy giờ hiện tại của Berlin
	TimeZone tzBerlin = TimeZone.getTimeZone("Europe/Berlin");
	Calendar cBerlin = Calendar.getInstance(tzBerlin);
	
	int hour = cBerlin.get(Calendar.HOUR_OF_DAY);
	int minute = cBerlin.get(Calendar.MINUTE);
	int second = cBerlin.get(Calendar.SECOND);
	System.out.println("Berlin time: " +hour +":" +minute+":"  +second);
	
	// cBerlin.set(minute, second)
}	
	private static void printAvailableTimeZone() {
		String [] tzIds = TimeZone.getAvailableIDs();
				for (String tzId : tzIds) {
					System.out.println("tzId ->" +tzId);
				}
	}
}

