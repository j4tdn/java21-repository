package version08.homework.bai01;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App01 {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		LocalDate sDate = enterData("Nhập ngày bắt đầu hẹn hò: ", formatter);
//		LocalTime sTime = enterData("Nhập giờ bắt đầu hẹn hò: ");
		System.out.println("Start day: " + format(sDate, "dd/MM/yyyy"));
//		System.out.println("Start time: " + sTime);
		
		System.out.println("Bạn đã chia tay (Y/N)? ");
		String choice = null;
        do {
			System.out.print("Nhập lựa chọn(Y/N): ");
			try {
				choice = scanner.nextLine().toUpperCase();
				if(choice.equals("Y")) {
					 LocalDate breakupDate = enterData("Nhập ngày chia tay: ", formatter);
					 calculateRelationship(sDate, breakupDate);
				} else {
					LocalDate currentDate = LocalDate.now();
//					LocalTime currentTime = LocalTime.now();
					calculateRelationship(sDate, currentDate);
//					calculateRelationship(sTime, currentTime);
				}
				break;
			} catch (NumberFormatException nfe) {
				System.out.println("Lựa chọn không thỏa mãn!");
			}
		} while (true);

	}
	
	private static void calculateRelationship(LocalDate sDate, LocalDate eDate) {
		Period period = Period.between(sDate, eDate);
		
		int years = period.getYears();
		int months = period.getMonths();
		int days = period.getDays();
		System.out.println("Bạn đã hẹn hò được " + years + " năm " + months + " tháng " + days + " ngày.");
	}
	
//	private static void calculateRelationship(LocalTime sTime, LocalTime eTime) {
//		Duration duration = Duration.between(sTime, eTime);
//		
//		long hours = duration.toHours();
//		long minutes = duration.toMillisPart();
//		long seconds = duration.toSecondsPart();
//		
//		System.out.println("Bạn đã hẹn hò được " + hours + " giờ " + minutes + " phút " + seconds + " giây.");
//	}

	private static LocalDate enterData(String message, DateTimeFormatter formatter) {
		LocalDate date = null;
		while (date == null) {
			try {
				System.out.print(message);
				String ip = scanner.nextLine();
				date = LocalDate.parse(ip, formatter);
			} catch (Exception e) {
				System.out.println("Ngày không hợp lệ. Hãy nhập theo định dạng dd/MM/yyyy.");
			}
		}
		return date;
	}
	
//	private static LocalTime enterData(String message) {
//		LocalTime time = null;
//		while (time == null) {
//			try {
//				System.out.print(message);
//				String ip = scanner.nextLine();
//				time = LocalTime.parse(ip, DateTimeFormatter.ofPattern("HH:mm:ss"));
//			} catch (Exception e) {
//				System.out.println("Giờ không hợp lệ. Hãy nhập theo định dạng HH:mm:ss.");
//			}
//		}
//		return time;
//	}
	
	private static String format(LocalDate ldate, String pattern) {
		DateTimeFormatter dft = DateTimeFormatter.ofPattern(pattern);
		return dft.format(ldate);
	}
}
