
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
				System.out.println("Bạn yêu được :" +((timeNow.get(Calendar.YEAR)))+" năm "
				+(timeNow.get(Calendar.MONTH))+" tháng "+timeNow.get(Calendar.DAY_OF_MONTH)+" ngày");
			} else {
				System.out.println("Nhập thời gian chia tay(dd/MM/yyyy HH:mm:ss)");
				timeEnd = sc.nextLine();
				conventerStringtoDate1(timeEnd);
				Ex01TheUltimateRelationshipCalculator obj1 = new Ex01TheUltimateRelationshipCalculator();
				Calendar calendar1 = obj1.dateToCalendar(date1);
				timeEnd.add(Calendar.DAY_OF_MONTH, -calendar1.get(Calendar.DAY_OF_MONTH));
				timeEnd.add(Calendar.MONTH, -calendar1.get(Calendar.MONTH));
				timeEnd.add(Calendar.YEAR,-calendar1.get(Calendar.YEAR));
				System.out.println("Bạn yêu được :" +((timeEnd.get(Calendar.YEAR)))+" năm "
				+(timeEnd.get(Calendar.MONTH))+" tháng "+timeEnd.get(Calendar.DAY_OF_MONTH)+" ngày");
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
