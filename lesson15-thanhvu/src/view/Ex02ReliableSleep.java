package view;

import java.util.Scanner;
import static utils.ExamUtils.*;

public class Ex02ReliableSleep {

	public static void main(String[] args) {

		System.out.print("Tuổi của bạn: ");
		int age = inputInt();

		System.out.println("Thời gian đã ngủ:");
		System.out.print("+ Số giờ: ");
		int hours = inputInt();
		System.out.print("+ Số phút: ");
		int minutes = inputInt();;

		System.out.print("Thời gian bắt đầu ngủ: ");
		int startHour = inputInt();

		int minSleepTime = getMinSleepTime(age);

		int remainingHours = minSleepTime - hours;
		int remainingMinutes = 60 - minutes;

		if (remainingMinutes >= 60) {
			remainingHours++;
			remainingMinutes -= 60;
		}

		int wakeHour = startHour + remainingHours;
		int wakeMinute = remainingMinutes;

		if (wakeHour >= 24) {
			wakeHour -= 24;
		}

		System.out.println("Bạn nên thức dậy lúc: " + wakeHour + "H" + wakeMinute);
	}

	public static int getMinSleepTime(int age) {
		if (age >= 1 && age <= 3) {
			return 20;
		} else if (age >= 4 && age <= 13) {
			return 10;
		} else if (age >= 14 && age <= 17) {
			return 8;
		} else if (age >= 18 && age <= 64) {
			return 7;
		} else {
			return 7;
		}
	}
}
