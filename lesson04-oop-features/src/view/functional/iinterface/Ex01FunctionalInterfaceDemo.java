package view.functional.iinterface;

public class Ex01FunctionalInterfaceDemo {
	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		
		// Đếm số lượng các phần tử chẵn
		// Đếm số lượng các phần tử lẻ
		// Đếm số lượng các phần tử là bội của 3
		// Đếm số lượng các phần tử là bội của 5
		
		System.out.println("Số phần tử chẵn: " + countIf(numbers, number -> number % 2 == 0 ));
		System.out.println("Số phần tử lẻ: " + countIf(numbers, number -> number % 2 != 0));
		
		
	}
		private static int countIf(int[] numbers, IntTest intTest) {
			int counter = 0;
			for(int number : numbers) {
				if(intTest.test(number)) {
					counter++;
				}
			}
			return counter;
		}
		
		// Đến số lượng các phần tử lẻ
		
	
	
	
}
