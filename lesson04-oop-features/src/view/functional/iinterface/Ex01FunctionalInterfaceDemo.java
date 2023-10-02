package view.functional.iinterface;

public class Ex01FunctionalInterfaceDemo {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		System.out.println("Số phần tử chẵn: " + countIf(numbers, number -> number % 2 == 0));
		System.out.println("Số phần tử lẻ: " + countIf(numbers, number -> number % 2 != 0));

	}

	private static int countIf(int[] numbers, IntTest intTests) {
		int counter = 0;

		for (int number : numbers) {
			if (intTests.test(number)) {
				counter++;
			}
		}

		return counter;
	}
}
