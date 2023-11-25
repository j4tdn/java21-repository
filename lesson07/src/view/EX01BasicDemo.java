package view;

import java.awt.SecondaryLoop;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import javax.print.attribute.standard.PagesPerMinute;

public class EX01BasicDemo {
public static void main(String[] args) {
	//Java 07; java.util.Date, java.util.Calendar
	
	//demo with java.util.Date
	Date date = new Date();
	System.out.println("date"+date);
	Date configuredDate = new Date(7200);
	System.out.println("configuredDate" +configuredDate);
	/*Date : thường được dùng để lưu trữ
	       : không hỗ trợ quá nhiều hàm xử lí
	       
	  Calendar : cho phép xử lý
	           : hỗ trợ các hàm thứ mấy

	       */
	//demo with java.util.Calendar (code with style of singleton patter)
	/*java.util.GregorianCalendar[time=1697893276080,
	        areFieldsSet=true,
			areAllFieldsSet=true,
			lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Saigon",
			offset=25200000,
			dstSavings=0,useDaylight=false,transitions=10,lastRule=null],
			firstDayOfWeek=1,minimalDaysInFirstWeek=1,
			ERA=1,YEAR=2023,MONTH=9,WEEK_OF_YEAR=42,WEEK_OF_MONTH=3,
			DAY_OF_MONTH=21,DAY_OF_YEAR=294,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=3,
			AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=1,SECOND=16,MILLISECOND=80,ZONE_OFFSET=25200000,DST_OFFSET=0]
*/
	Calendar c = Calendar.getInstance();
	System.out.println("calendar :"+ c );
	TimeZone tzBerlin = TimeZone.getTimeZone("Europe/Berlin");
	Calendar cBerlin = Calendar.getInstance(tzBerlin);
	int year = cBerlin.get(Calendar.YEAR);
	int hour = cBerlin.get(Calendar.HOUR_OF_DAY);
	int PagesPerMinute =cBerlin.get(Calendar.MINUTE);
	int Second = cBerlin.get(Calendar.SECOND);
	System.out.println("berlin time:"+(year+ ":" +hour +":" +PagesPerMinute +":" +Second));
}
	private static void printAvailableTimeZones() {
		String [] tzIds = TimeZone.getAvailableIDs();
		for(String tzId : tzIds) {
			System.out.println("tzId"+tzIds);
		}
	}
}
