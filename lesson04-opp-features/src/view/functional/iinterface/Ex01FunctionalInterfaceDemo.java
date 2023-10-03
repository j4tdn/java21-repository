package view.functional.iinterface;

public class Ex01FunctionalInterfaceDemo {
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		//đếm số lẻ
		System.out.println("\nSố phần tử lẻ: " + countIf(numbers, (int number) -> {
			return number % 2 != 0;
		}));
		
	}
	
	private static int countIf (int[] numbers, IntTest intTest) {
		int counter = 0;
		for (int number: numbers) {
			if (intTest.test(number)) {
				counter++;
			}
		}
		return counter;
	}
}
