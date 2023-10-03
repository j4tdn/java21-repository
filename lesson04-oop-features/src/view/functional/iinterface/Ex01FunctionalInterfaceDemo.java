package view.functional.iinterface;

public class Ex01FunctionalInterfaceDemo {

	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		
		// Đếm số lượng phần tử lẻ
		System.out.println("số phần tử lẻ: " + countIf(numbers, (int number) -> {
			return number % 2 != 0;
		}));
		
		// Đếm số lượng phần tử là bội của 3 
		System.out.println("số phần tử là bội của 3: " + countIf(numbers, number -> number % 3 == 0));
	}
	
	private static int countIf(int[] numbers, IntTest intTest) {
		int counter = 0;
		for (int number : numbers) {
			if(intTest.test(number)) {
				counter++;
			}
		}
		return counter;
	}
}
