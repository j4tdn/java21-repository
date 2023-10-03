package view.functional.iinterface;

public class Ex01FunctionalInterfaceDemo {
	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		
		// Đếm số lượng phần tử chẵn
		System.out.println("số phần tử chẵn: " + countIF(numbers, x -> x % 2 == 0));
		// Đếm số lượng phần tử lẻ
		
		// Đếm số lượng các phần tử là bội của 3
		
		// Đếm số lượng các phần tử là bội của 5

	}
	
	private static int countIF(int[] numbers, IntTest intTest) {
		int count = 0;
		for(int number : numbers) {
			if(intTest.test(number)) {
				count++;
			}
		}
		return count;
	}
	
//	private static int countAmountOfEvenNumbers(int[] numbers) {
//		
//	}
}
