package ex01;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ex01TheUltimateRelationshipCalculator {
	static Scanner sc = new Scanner(System.in);
	static int n = 0;
	static String timeStart = "";
	static String timeEnd = "";
	static Date date = new Date();
	static Date date1 = new Date();
	public static void main(String[] args) throws Exception {
			System.out.println("Nhập thời gian bắt đầu hẹn hò(dd/MM/yyyy HH:mm:ss)");
			timeStart = sc.nextLine();
			conventerStringtoDate(timeStart);
			String[] dows = {"Chủ nhật", "Thứ hai", "Thứ ba", "Thứ tư", "Thứ năm", "Thứ sáu", "Thứ bảy"};
			String dow = dows[date.getDay()];
			System.out.println("Ngày bắt đầu hẹn hò là thứ: "+dow);
			System.out.println("Bạn còn hẹn hò ?\n"
					+ "1. Còn hẹn hò\n"
					+ "2. Đã chia tay\n");
			n = sc.nextInt();
			Ex01TheUltimateRelationshipCalculator obj = new Ex01TheUltimateRelationshipCalculator();
			Calendar calendar = obj.dateToCalendar(date);
			if(n==1) {
				Calendar timeNow = Calendar.getInstance();
				timeNow.add(Calendar.DAY_OF_MONTH, -calendar.get(Calendar.DAY_OF_MONTH));
				timeNow.add(Calendar.MONTH, -calendar.get(Calendar.MONTH));
				timeNow.add(Calendar.YEAR,-calendar.get(Calendar.YEAR));
				timeNow.add(Calendar.HOUR, -calendar.get(Calendar.HOUR));
				timeNow.add(Calendar.MINUTE, -calendar.get(Calendar.MINUTE));
				timeNow.add(Calendar.SECOND,-calendar.get(Calendar.SECOND));
				System.out.println("Bạn đã yêu được: " +((timeNow.get(Calendar.YEAR)))+" năm "
				+(timeNow.get(Calendar.MONTH))+" tháng "+timeNow.get(Calendar.DAY_OF_MONTH)+" ngày "
				+timeNow.get(Calendar.HOUR)+" giờ "+timeNow.get(Calendar.MINUTE)+" phút "+timeNow.get(Calendar.SECOND)+" giây ");
			} else {
				sc.nextLine();
				System.out.println("Nhập thời gian chia tay(dd/MM/yyyy HH:mm:ss)");
				timeEnd = sc.nextLine();
				conventerStringtoDate1(timeEnd);
				Calendar timeNow1 = Calendar.getInstance();
				timeNow1.setTime(date1);
				timeNow1.add(Calendar.DAY_OF_MONTH, -calendar.get(Calendar.DAY_OF_MONTH));
				timeNow1.add(Calendar.MONTH, -calendar.get(Calendar.MONTH));
				timeNow1.add(Calendar.YEAR,-calendar.get(Calendar.YEAR));
				timeNow1.add(Calendar.HOUR, -calendar.get(Calendar.HOUR));
				timeNow1.add(Calendar.MINUTE, -calendar.get(Calendar.MINUTE));
				timeNow1.add(Calendar.SECOND,-calendar.get(Calendar.SECOND));
				System.out.println("Bạn đã yêu được: " +((timeNow1.get(Calendar.YEAR)))+" năm "
				+(timeNow1.get(Calendar.MONTH))+" tháng "+timeNow1.get(Calendar.DAY_OF_MONTH)+" ngày "
				+timeNow1.get(Calendar.HOUR)+" giờ "+timeNow1.get(Calendar.MINUTE)+" phút "+timeNow1.get(Calendar.SECOND)+" giây ");
			}
			
		
	}
	private Calendar dateToCalendar(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar;
	}
	
	public static void conventerStringtoDate(String timeStart) throws Exception {
	       date = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").parse(timeStart);        
	}
	public static void conventerStringtoDate1(String timeEnd) throws Exception {
	       date1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").parse(timeEnd);        
	}
	
	
}
