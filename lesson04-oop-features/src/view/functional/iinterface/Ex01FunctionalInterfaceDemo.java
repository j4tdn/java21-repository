package view.functional.iinterface;

public class Ex01FunctionalInterfaceDemo {

	public static void main(String[] args) {
		
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		// Đếm số lượng các phần tử chẵn
		System.out.println("Số phần tử chẵn " + countIf(numbers, number -> number % 2 == 0));
		// Đếm số lượng các phần tử lẻ
		System.out.println("Số phần tử chẵn " + countIf(numbers, number -> number % 2 != 0));
		// Đếm số lượng các phần tử là bội của 3
		System.out.println("Số phần tử chẵn " + countIf(numbers, number -> number % 3 == 0));
		// Đếm số lượng các phần tử là bội của 5
		System.out.println("Số phần tử chẵn " + countIf(numbers, number -> number % 5 == 0));
	}
	
	// strategy pattern
	// viết ra 1 hàm truyền vào strategy
	// strategy là 1 hàm biết được số lượng tham số và KDL trả về 
	
	// khi nào ai gọi hàm này thì sẽ truyền nội dung strategy vào
	
	private static int countIf(int[] numbers, IntTest intTest) {
		int counter = 0;
		for (int number : numbers) {
			if (intTest.test(number)) {
				counter++;
			}
		}
		return counter;
	}
	
	private static int isPrime(int number) {
		
		return 0;
	}
}
