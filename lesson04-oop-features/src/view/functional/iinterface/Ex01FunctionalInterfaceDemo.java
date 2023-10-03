package view.functional.iinterface;

public class Ex01FunctionalInterfaceDemo {

	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		
		// Đếm số lượng các số chẵn
		System.out.println("Số phần tử chẵn: " + countIf(numbers, (int number) -> {
			return number % 2 == 0;
		}));

		// Đếm số lượng các số lẻ
		System.out.println("Số phần tử lẻ: " + countIf(numbers, (int number) -> {
			return number % 2 != 0;
		}));

		// Đếm số lượng các số là bội của 3
		System.out.println("Số phần tử là bội của 3: " + countIf(numbers, (int number) -> {
			return number % 3 == 0;
		}));

		// Đếm số lượng các số là bội của 5
		System.out.println("Số phần tử là bội của 5: " + countIf(numbers, (int number) -> {
			return number % 5 == 0;
		}));
		
		
	}
	
	private static int countIf(int[] numbers, IntTest intTest) {
		int counter = 0;
		for(int number : numbers) {
			if(intTest.test(number)) {
				counter ++;
			}
		}
		return counter;
	}
	
}
