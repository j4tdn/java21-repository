package ex01theultimaterelationshipcal;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class TheUltimateRelationshipCalculator {
	static Scanner ip = new Scanner(System.in);

	public static void enterInfor() {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date convertedStartDate = null;
		String startDate;
		do {
			try {
				System.out.print("Nhập ngày bắt đầu (dd/MM/yyyy): ");
				startDate = ip.nextLine();
				convertedStartDate = df.parse(startDate);
				break;
			} catch (ParseException e) {
				System.out.println("Không đúng định dạng");
			}
		} while (true);

		System.out.print("Bạn đã chia tay chưa (y/n): ");
		String check = ip.nextLine();
		String endDate;
		Date convertedEndDate = null;
		if (check.equals("y")) {
			do {
				try {
					System.out.print("Nhập ngày chia tay (dd/MM/yyyy): ");
					endDate = ip.nextLine();
					convertedEndDate = df.parse(endDate);
					break;
				} catch (ParseException e) {
					System.out.println("Không đúng định dạng");
				}
			} while (true);
		} else {
			convertedEndDate = new Date();
		}

		Calendar c = Calendar.getInstance();
		c.setTime(convertedStartDate);
		DateOfWeek[] dowAsEnum = DateOfWeek.values();
		System.out.println("Ngày bắt đầu hẹn hò là: " + dowAsEnum[c.get(Calendar.DAY_OF_WEEK) - 1]);

		long getDiff = convertedEndDate.getTime() - convertedStartDate.getTime();
		long getDaysDiff = TimeUnit.MILLISECONDS.toDays(getDiff);
		System.out.println("Mối tình đã bắt đầu được: " + getDaysDiff + " ngày");

	}

	public static void main(String[] args) {
		enterInfor();
	}
}