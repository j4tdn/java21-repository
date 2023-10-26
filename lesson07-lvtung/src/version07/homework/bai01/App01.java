package version07.homework.bai01;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import static utils.DateUtils.*;

public class App01 {

	private static Scanner scanner = new Scanner(System.in);
	private static final String DEFAULT_PATTERN = "EEEE dd/MM/yyyy HH:mm:ss a";

	public static void main(String[] args) {
		System.out.println("Nhập thông tin thời gian bắt đầu hẹn hò !");
		int yearStart = enterDMY("Năm: ");
		int monthStart = enterDMY("Tháng (1-12): ");
		int dayStart = enterDMY("Ngày: ");
		int hourStart = enterDMY("Giờ: ");
		int minuteStart = enterDMY("Phút: ");
		int secondStart = enterDMY("Giây: ");

		Calendar start = Calendar.getInstance(new Locale("vi", "VN"));
		start.set(yearStart, monthStart, dayStart, hourStart, minuteStart, secondStart); // start có KDL Calendar
		
		System.out.println("Đã chia tay chưa ?:)) \n1.Rồi \n2.Chưa");
		int option = 0;
		
		do {
			System.out.print("Nhập lựa chọn(1 - 2): ");
			try {
				option = Integer.parseInt(scanner.nextLine());
				if(option != 1 && option != 2) {
					throw new NumberFormatException();
				} 
				break;
			} catch (NumberFormatException nfe) {
				System.out.println("Lựa chọn không thỏa mãn!");
			}
		} while (true);

		
		Date startDate = start.getTime();				 // startDate có KDL Date
		Date endDate = Calendar.getInstance().getTime(); // endDate có KDL Date
		
		System.out.println("start: " + format(startDate, DEFAULT_PATTERN)); // in từ calendar sang string
		System.out.println("end: " + format(endDate, DEFAULT_PATTERN)); // in từ date sang string
		
		if(startDate.after(endDate)) {
			throw new IllegalArgumentException("Date range is valid!");
		}
		
		long startTime = startDate.getTime(); // ms
		long endTime = endDate.getTime();	  // ms	
		long duration = endTime - startTime;
		
		long days = TimeUnit.MILLISECONDS.toDays(duration); // convert from ms to days
		System.out.println("days: " + days);
		
		duration = duration - TimeUnit.DAYS.toMillis(days);
		
		long hours = TimeUnit.MILLISECONDS.toHours(duration);
		System.out.println("hours: " + hours);
		
		duration = duration - TimeUnit.HOURS.toMillis(hours);
		
		long minutes = TimeUnit.MILLISECONDS.toMinutes(duration);
		System.out.println("minutes: " + minutes);
		
		duration = duration - TimeUnit.MINUTES.toMillis(minutes);
		
		long seconds = TimeUnit.MILLISECONDS.toSeconds(duration);
		System.out.println("seconds: " + seconds);
		
		System.out.println("\nChúc mừng bạn đã quen nhau được " + days + " ngày " + hours + " tiếng " + minutes + " phút");
	}

	private static int enterDMY(String message) {
		System.out.print(message);
		while (!scanner.hasNextInt()) {
			System.out.println("Vui lòng nhập một số nguyên.");
			System.out.print(message);
			scanner.next();
		}
		return Integer.parseInt(scanner.nextLine());
	}
}
