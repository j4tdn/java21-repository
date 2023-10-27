package leson07hthanh;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.WeekFields;
import java.util.Calendar;

public class bai3 {
	public static void main(String[] args) {
		LocalDate currentDate = LocalDate.now();
		Calendar c = Calendar.getInstance();
		System.out.println(new SimpleDateFormat("dd/MM/yyyy HH:mm:ss a").format(c.getTime()));

		DateTimeFormatter dtfm = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String fmld = currentDate.format(dtfm);
		YearMonth yearMonth = YearMonth.from(currentDate);
		LocalDate lastDayOfMonth = yearMonth.atEndOfMonth();

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String formattedLastDay = formatter.format(lastDayOfMonth);
		System.out.println("Ngày hiện tại: " + fmld);
		System.out.println("Ngày cuối tháng: " + formattedLastDay);

		DayOfWeek dayofweek = currentDate.getDayOfWeek();
		int sdow = DayOfWeek.MONDAY.getValue() - dayofweek.getValue();
		LocalDate fdow = currentDate.plusDays(sdow);
		System.out.println("Ngày đầu tuần: " + fdow);
		int edow = sdow + 6;
		LocalDate enddow = currentDate.plusDays(edow);
		System.out.println("Ngày cuối tuần: " + enddow);

		WeekFields woy = WeekFields.ISO;
		int weekNumber = currentDate.get(woy.weekOfWeekBasedYear());

		System.out.println("Tuần thứ " + weekNumber + " trong năm");

		LocalDate date = currentDate.plusDays(20);
		DayOfWeek dayOfWeek = date.getDayOfWeek();
		System.out.print("Ngày 20 ngày sau là: thứ " + dayOfWeek + " ngày ");
		System.out.println(DateTimeFormatter.ofPattern("dd/MM/yyyy").format(date));

		LocalDate birthday = LocalDate.of(2003, 03, 20);
		System.out.println(DateTimeFormatter.ofPattern("dd/MM/yyyy").format(birthday));
		long daysUntilBirthday = ChronoUnit.DAYS.between(birthday, currentDate);
		System.out.println(daysUntilBirthday);
	}
}
