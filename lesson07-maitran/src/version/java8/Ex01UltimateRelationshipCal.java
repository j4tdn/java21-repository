package version.java8;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Scanner;

import utils.DateUtils;

public class Ex01UltimateRelationshipCal {
	private static final String DEFAULT_PATTERN = "dd/MM/yyyy HH:mm:ss";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n---------------------------------------------------------------");
		System.out.println("| Nếu không nhập Giờ:Phút:Giây, hệ thống sẽ mặc định 00:00:00 |");
		System.out.println("---------------------------------------------------------------");
		System.out.print("Nhập thời gian bắt đầu hẹn hò (dd/MM/yyyy HH:mm:ss): ");
		String userInput = sc.nextLine();
		sc.close();
		if (!userInput.contains(":")) {
			userInput += " 00:00:00";
		}
		LocalDateTime sDate = DateUtils.toDate(userInput, DEFAULT_PATTERN);
		LocalDateTime eDate = LocalDateTime.now();

		if (sDate.isAfter(eDate)) {
			throw new IllegalArgumentException("Date range is invalid");
		}

		System.out.println("Thời gian bắt đầu hẹn hò: " + sDate.getDayOfMonth() + "/" + sDate.getMonthValue() + "/"
				+ sDate.getYear());

		// Thời gian bắt đầu hẹn hò thứ mấy?
		DayOfWeek dateDayOfWeek = sDate.getDayOfWeek();
		System.out.println("Ngày bắt đầu hẹn hò là thứ: " + dateDayOfWeek);

		// Thời gian yêu nhau bao lâu rồi?
		Period period = Period.between(sDate.toLocalDate(), eDate.toLocalDate());
		int years = period.getYears();
		int months = period.getMonths();
		int days = period.getDays();

		Duration duration = Duration.between(sDate, eDate);
		long hours = duration.toHoursPart(); //4 năm 0 tháng 0 ngày 9 giờ 15 phút 33 giây 
		long minutes = duration.toMinutesPart();
		long seconds = duration.toSecondsPart();
		System.out.println("Các bạn đã yêu nhau được: " + years + " năm " + months + " tháng " + days + " ngày " + hours
				+ " giờ " + minutes + " phút " + seconds + " giây ");
	}
}
