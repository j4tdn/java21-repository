package view;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex02WakeUpProblem {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		Map<Integer, Integer> obj = new HashMap<>();

		int[] thresholds = { 3, 13, 17, 64 };
		int[] values = { 20, 11, 9, 8, 7 };

		for (int i = 1; i <= 65; i++) {
			int value = calculateValue(i, thresholds, values);
			obj.put(i, value);
		}

		System.out.print("Enter your current age: ");
		int age = inputInt(sc);

		System.out.print("Enter the time you slept during the day (hours) ");
		int hour = inputInt(sc);

		System.out.print("Enter the time you slept during the day (minutes): ");
		int minute = inputInt(sc);

		System.out.print("Enter the sleep start time: ");
		int start = inputInt(sc);

		System.out.println("You should wake up for good health: " + timeWakeUp(obj.get(age), hour, minute, start));
	}

	private static int calculateValue(int i, int[] thresholds, int[] values) {
		for (int j = 0; j < thresholds.length; j++) {
			if (i <= thresholds[j]) {
				return values[j];
			}
		}
		return values[values.length - 1];
	}

	private static int inputInt(Scanner scanner) {
		return Integer.parseInt(scanner.nextLine());
	}

	private static String timeWakeUp(int ageValue, int hour, int minute, int start) {
		int totalRemainMinutes = ageValue * 60 - hour * 60 - minute;

		int wakeupHour = (start + totalRemainMinutes / 60) % 24;
		int wakeupMinute = totalRemainMinutes % 60;

		return String.format("%01dH%02d", wakeupHour, wakeupMinute);
	}
}
