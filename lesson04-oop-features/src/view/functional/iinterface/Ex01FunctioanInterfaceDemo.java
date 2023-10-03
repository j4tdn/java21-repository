package view.functional.iinterface;

public class Ex01FunctioanInterfaceDemo {

	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		
		// Đếm số lượng các phần tử chẵn
		System.out.println("Số phần tử chẵn: " 
				+ countAmountOfEvenNumbers(numbers));
		
		System.out.println("Số phần tử chẵn: " 
				+ countIf(numbers, new IntTest() {
					
					@Override
					public boolean test(int number) {
						return number % 2 == 0;
					}
				}));
		
		// Đếm số lượng các phần tử lẻ
		System.out.println("\nSố phần tử lẻ: " 
				+ countAmountOfOddNumbers(numbers));
		System.out.println("Số phần tử lẻ: " 
				+ countIf(numbers, (int number) -> {
					return number % 2 != 0;
				}));
		
		// Đếm số lượng các phần tử là bội của 3
		System.out.println("\nSố phần tử là bội của 3: " 
				+ countAmountOfMultipleOf3Numbers(numbers));
		System.out.println("Số phần tử là bội của 3: " 
				+ countIf(numbers, number -> number % 3 == 0));
		
		System.out.println("\nSố phần tử là số nguyên tố: " 
				+ countIf(numbers, number -> isPrime(number)));
	}
	
	// --> a + b
	// --> a - b
	// strategy(abstract method): int strategy(int a, int b)
	
	// bieuthuc
	// --> number % 2 == 0
	// --> number % 2 != 0
	// --> number % 3 == 0
	// --> isPrime(number)
	
	// --> công thức chung(strategy): boolean test(int number)
	
	// Tạo ra 1 functional interface với tên bất kỳ
	// chứa hàm trừu tượng tên bất kỳ nhưng phải có công thức như strategy
	
	// strategy pattern
	// viết ra 1 hàm truyền vào strategy
	// strategy là 1 hàm biết dc số lượng tham số và KDL trả về chưa biết phần thực thi
	
	// khi nào ai gọi hàm này thì sẽ truyền nội dung strategy vào
	
	private static int countIf(int[] numbers, IntTest intTest) {
		int counter = 0;
		for (int number: numbers) {
			if (intTest.test(number)) {
				counter++;
			}
		}
		return counter;
	}
	
	
	private static int countAmountOfEvenNumbers(int[] numbers) {
		int counter = 0;
		for (int number: numbers) {
			if (number % 2 == 0) {
				counter++;
			}
		}
		return counter;
	}
	
	private static int countAmountOfOddNumbers(int[] numbers) {
		int counter = 0;
		for (int number: numbers) {
			if (number % 2 != 0) {
				counter++;
			}
		}
		return counter;
	}
	
	private static int countAmountOfMultipleOf3Numbers(int[] numbers) {
		int counter = 0;
		for (int number: numbers) {
			if (number % 3 == 0) {
				counter++;
			}
		}
		return counter;
	}
	
	private static int countAmountOfPrimeNumbers(int[] numbers) {
		int counter = 0;
		for (int number: numbers) {
			if (isPrime(number)) {
				counter++;
			}
		}
		return counter;
	}
	
	private static boolean isPrime(int number) {
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return (number <= 1) ? false : true;
	}
}
