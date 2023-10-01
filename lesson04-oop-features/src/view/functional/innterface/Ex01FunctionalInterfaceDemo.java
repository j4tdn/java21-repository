package view.functional.innterface;

public class Ex01FunctionalInterfaceDemo {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println("\nSo phan tu chia het cho 2 la:"+countIf(numbers, number ->number %2 ==0));
		System.out.println("\nSo phan tu chia het cho  3la:"+countIf(numbers, number -> number % 3 ==0));
														 
	
	}

	private static int countIf(int[] numbers, IntTest intTest) {
		int counter = 0;
		for (int number : numbers) {
			if (intTest.test(number)) {
				counter++;
			}
		}
		return counter;
	}

	// Đếm số lượng phần tử chẵn

	// Đếm số lượng phần tử lẻ

	// Đếm số lượng phần tử là bội cho 3

	// Đếm số lượng phần tử là bội 5

}
