package version.java8;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

import utils.DateUtils;

public class Ex02WeekdayCal {
	private static final String DEFAULT_PATTERN = "dd/MM/yyyy";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter day/month/year (dd/MM/yyyy): ");
		String userInput = sc.nextLine();
		LocalDate currentDate = DateUtils.toDateLocalDate(userInput, DEFAULT_PATTERN);
		sc.close();

		int dayOfYear = currentDate.getDayOfYear();

		LocalDate startOfYear = LocalDate.of(currentDate.getYear(), 1, 1);
		LocalDate endOfYear = LocalDate.of(currentDate.getYear(), 12, 31);

		Period period = Period.between(currentDate, endOfYear);
		int remainingMonths = period.getMonths();
		int remainingDay = period.getDays();

		int totalDayRemaining = remainingDay - 1;
		for (int i = 1; i <= remainingMonths; i++) {
			int monthDays = currentDate.plusMonths(i).lengthOfMonth();
			totalDayRemaining += monthDays;
		}
		System.out.println(totalDayRemaining != 0
				? "It is day number " + dayOfYear + " of the year, " + totalDayRemaining + " days left!"
				: "Today is the last day of the year!");

		DayOfWeek dayOfWeektToCount = currentDate.getDayOfWeek();
		System.out.println("dayOfWeektToCount : " + dayOfWeektToCount);

		int indexOfMonthWithTotalMonth = (currentDate.getDayOfYear() - 1) / 7 + 1;

		int count = 0;
		LocalDate newDate = LocalDate.of(currentDate.getYear(), 1, 1);
		while (!newDate.isAfter(endOfYear)) {
			if (newDate.getDayOfWeek() == dayOfWeektToCount) {
				count++;
			}
			newDate = newDate.plusDays(1);
		}

		System.out.println("It is " + dayOfWeektToCount + " number " + indexOfMonthWithTotalMonth + " out of " + count
				+ " in " + currentDate.getYear());

		int count1 = 0;
		int index = 0;
		LocalDate endOfMonth = LocalDate.of(currentDate.getYear(), currentDate.getMonthValue(),
				currentDate.lengthOfMonth());
		LocalDate newDate1 = LocalDate.of(currentDate.getYear(), currentDate.getMonthValue(), 1);
		while (!newDate1.isAfter(endOfMonth)) {
			if (newDate1.getDayOfWeek() == dayOfWeektToCount) {
				count1++;
				if (newDate1.getDayOfMonth() == currentDate.getDayOfMonth()) {
					index = count1;
				}
			}
			newDate1 = newDate1.plusDays(1);
		}

		System.out.println("It is Monday number " + index + " out of " + count1 + " in " + currentDate.getMonth() + " "
				+ currentDate.getYear());

		long numberOfDayInYear = startOfYear.until(endOfYear.plusDays(1), java.time.temporal.ChronoUnit.DAYS);

		System.out.println("Year " + currentDate.getYear() + " has " + numberOfDayInYear + " days ");

		System.out.println(currentDate.getMonth() + " " + currentDate.getYear() + " has "
				+ currentDate.getMonth().length(currentDate.isLeapYear()) + " days");
	}
}
