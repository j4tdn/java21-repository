package version.java8;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Ex04ProjectDate {
	public static void main(String[] args) {
		LocalDate startDate = LocalDate.of(2022, 6, 7);
		int intendDay = 110;

		LocalDate deliveryDate = startDate;
		while (intendDay > 0) {
			deliveryDate = deliveryDate.plusDays(1);
			if (deliveryDate.getDayOfWeek() != DayOfWeek.SATURDAY && deliveryDate.getDayOfWeek() != DayOfWeek.SUNDAY) {
				intendDay--;
			}
		}

		System.out.println("Delivery date: " + deliveryDate);
	}
}
