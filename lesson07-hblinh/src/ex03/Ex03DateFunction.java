package ex03;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Ex03DateFunction {
	static Date date = new Date();
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Calendar timeNowCal = Calendar.getInstance();
		printDateTimeNow(new Date());
		printLastDayofMonth(timeNowCal);
		printLastAndFirstDayOfWeek(timeNowCal);
		System.out.println(" 4. Ngày hiện tại đang ở tuần thứ "+timeNowCal.get(Calendar.WEEK_OF_YEAR)+" trong năm.");
		Calendar time20Day = Calendar.getInstance();
		time20Day.add(Calendar.DAY_OF_MONTH, 20);
		System.out.println(" 5. Sau 20 ngày nữa là ngày: "+SimpleDate(time20Day.getTime()));
		System.out.println(" Nhập ngày tháng năm sinh của bạn: ");
		String dateEnter = sc.nextLine();
		try {
			conventerToDate(dateEnter);
		} catch (Exception e) {
			e.printStackTrace();
		}
		conventerDateToTime(date);
	}
public static void printDateTimeNow(Date date) {
	SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	String timeNow = df.format(date);
	System.out.println(" 1."+timeNow);
}

public static void printLastDayofMonth(Calendar timeNowCal) {
	int lastDayOfMo = timeNowCal.getActualMaximum(Calendar.DAY_OF_MONTH);
	System.out.println(" 2.Ngày cuối cùng của tháng hiện tại: "+ lastDayOfMo+"/"+(timeNowCal.get(Calendar.MONTH)+1)+"/"+timeNowCal.get(Calendar.YEAR));
}
public static void printLastAndFirstDayOfWeek(Calendar timeNowCal) {
	int dayOfWeek = timeNowCal.get(Calendar.DAY_OF_WEEK);
	Calendar dayOfWeek1 = Calendar.getInstance();
	System.out.println(" 3. Xem ngày đầu tiên và cuối cùng của tuần hiện tại: ");
	switch (dayOfWeek) {
	case 1: {
		System.out.println("Ngày cuối tuần của tuần hiện tại là: "+SimpleDate(dayOfWeek1.getTime()));
		dayOfWeek1.add(Calendar.DAY_OF_MONTH, -6);
		System.out.println(" Ngày đầu tuần của tuần hiện tại là: "+SimpleDate(dayOfWeek1.getTime()));
		break;
	}
	case 2: {
		System.out.println("Ngày đầu tuần của tuần hiện tại là: "+SimpleDate(dayOfWeek1.getTime()));
		dayOfWeek1.add(Calendar.DAY_OF_MONTH, 6);
		System.out.println(" Ngày cuối tuần của tuần hiện tại là: "+SimpleDate(dayOfWeek1.getTime()));
		break;
		}
	case 3: {
		soutDayOfWeek(-1,dayOfWeek1);
		break;
	}
	case 4: {
		soutDayOfWeek(-2,dayOfWeek1);
		break;
	}
	case 5: {
		soutDayOfWeek(-3,dayOfWeek1);
		break;
		}
	case 6: {
		soutDayOfWeek(-4,dayOfWeek1);
		break;
	}
	case 7: {
		soutDayOfWeek(-5,dayOfWeek1);
		break;
	}
}
}
public static void soutDayOfWeek(int num, Calendar dayOfWeek1) {
	dayOfWeek1.add(Calendar.DAY_OF_MONTH, num);
	System.out.println(" Ngày đầu tuần của tuần hiện tại là: "+SimpleDate(dayOfWeek1.getTime()));	
	dayOfWeek1.add(Calendar.DAY_OF_MONTH, 6);
	System.out.println(" Ngày cuối tuần của tuần hiện tại là: "+SimpleDate(dayOfWeek1.getTime()));
	}
public static String SimpleDate(Date date) {
	SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	String timeNow = df.format(date);
	return timeNow;
}
public static void conventerToDate(String dateEnter) throws Exception {
	date = new SimpleDateFormat("dd/MM/yyyy").parse(dateEnter);
}
public static void conventerDateToTime(Date date) {
	long date1 = date.getTime();
	long date2 = new Date().getTime();
	long resultDate = date2 - date1;
	long day = TimeUnit.MILLISECONDS.toDays(resultDate);
	System.out.println(" Bạn đã sống được "+day+" ngày.");
	
}

}
