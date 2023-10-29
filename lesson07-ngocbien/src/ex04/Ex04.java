package ex04;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class Ex04 {

	public static void main(String[] args) {

		LocalDate startDate = LocalDate.of(2022, Month.JUNE, 7);
		int days = 110;

		System.out.println("Ngày nhận dự án: " + startDate);
		System.out.println("Ngày bàn giao sản phẩm: " + deadline(startDate, days));

	}

	public static LocalDate deadline(LocalDate startDate, int days) {
		int daysRemainning = days;
		LocalDate getProject = startDate;
		int count = 0;

		while (daysRemainning > 0) {
			getProject = getProject.plusDays(1);
			daysRemainning--;

			if (getProject.getDayOfWeek().equals(DayOfWeek.SATURDAY)
					|| getProject.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
				count++;
			}
		}

		getProject = getProject.plusDays(count);
		return getProject;

	}

}