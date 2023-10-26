package version.java8;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import utils.DateUtils;

public class Ex01UltimateRelationshipCal {
	private static final String DEFAULT_PATTERN = "dd/MM/yyyy HH:mm:ss";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("\n---------------------------------------------------------------");
		System.out.println("| Nếu không nhập Giờ:Phút:Giây, hệ thống sẽ mặc định 00:00:00 |");
		System.out.println("---------------------------------------------------------------");

		String userInput = promptForDateTime(sc, "Nhập ngày bắt đầu hẹn hò: ");

		LocalDateTime sDate = DateUtils.toDate(userInput, DEFAULT_PATTERN);
		LocalDateTime eDate = LocalDateTime.now();

		if (sDate.isAfter(eDate)) {
			throw new IllegalArgumentException("Date range is invalid");
		}

		Map<String, Runnable> actions = new HashMap<>();
		actions.put("Y", () -> calculateRelationship(sDate, eDate));
		actions.put("N", () -> {
			String breakInput = promptForDateTime(sc, "Nhập thời gian chia tay: ");
			LocalDateTime breakDate = DateUtils.toDate(breakInput, DEFAULT_PATTERN);
			calculateRelationship(sDate, breakDate);
		});

		System.out.println("Bạn vẫn còn trong mối quan hệ chứ? (Y/N)");
		String choice;
		do {
			choice = sc.nextLine().toUpperCase();
			actions.getOrDefault(choice, () -> System.out.println("Lựa chọn không hợp lệ! Vui lòng chọn 'Y' hoặc 'N'."))
					.run();
		} while (!actions.containsKey(choice));

		sc.close();
	}

	private static String promptForDateTime(Scanner sc, String text) {
		String userInput = sc.nextLine();
		userInput = userInput.contains(":") ? userInput : userInput + " 00:00:00";
		return userInput;
	}

	private static void calculateRelationship(LocalDateTime sDate, LocalDateTime eDate) {
		Period period = Period.between(sDate.toLocalDate(), eDate.toLocalDate());
		int years = period.getYears();
		int months = period.getMonths();
		int days = period.getDays();

		Duration duration = Duration.between(sDate, eDate);
		long hours = duration.toHoursPart();
		long minutes = duration.toMinutesPart();
		long seconds = duration.toSecondsPart();
		System.out.println("Các bạn đã yêu nhau được: " + years + " năm " + months + " tháng " + days + " ngày " + hours
				+ " giờ " + minutes + " phút " + seconds + " giây ");
	}
}
