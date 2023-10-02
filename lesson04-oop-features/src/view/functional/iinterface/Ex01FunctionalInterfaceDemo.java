package view.functional.iinterface;

public class Ex01FunctionalInterfaceDemo {

	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		// đếm số lượng các phần tử chẵn
		
		// đếm số lượng các phần tử lẻ
		
		// đếm số lượng các phần tử là bội của 3
		
		// đếm số lượng các phần tử là số nguyên tố
		

		System.out.println("\nSố phần tử chẵn" 
				+ countAmountOfEvenNumber(numbers));
		
		//
		System.out.println("Số phần tử chẵn: " 
				+ countIf(numbers, new IntTest() {
					
					@Override
					public boolean test(int number) {
						return number % 2 == 0;
					}
				}));
		
		System.out.println("\nSố phần tử lẻ: "
				+ countIf(numbers, (int number) -> {
					return number % 2 != 0;
				}));
		
		System.out.println("Số phần tử là bội của 3: " 
				+ countIf(numbers, number -> number % 3 == 0));
		
		System.out.println("\nsố phần tử là số nguyên tố: " 
				+ countIf(numbers, number -> isPrime(number)));
		
	}
	
	// --> a + b
	// --> a - b
	// strategy(abstract method): int strategy(int a, int b) 
	
	
	// biểu thức
	// --> number % 2 == 0
	// --> number % 2 != 0
	// --> number % 3 == 0
	// --> isPrime(number)
	
	// --> công thức chung(strategy): boolean test(int number)
	// tạo ra 1 functional interface với tên bất kỳ
	// chứa hàm trừu tượng tên bến kỳ nhưng phải có công thức như strategy
	
	
	// --> công thức chung (strategy)
	
	// strategy pattern
	// viết ra 1 hàm truyền vào strategy 
	// strategy là 1 hàm biết được số lượng tham số và KDL trả về chưa biết phần thực hiện
	
	// khi nào ai gọi hàm này thì sẽ truyền nội dung strategy vào
	
	
	private static int countIf(int[] numbers, IntTest intTest) {
		int counter = 0;
		for(int number: numbers) {
			if(intTest.test(number)) {
				counter++;
			}
			
		}
		return counter;
	}
	
	
	private static boolean isPrime(int number) {
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if(number % i == 0) {
				return false;
			}
		}
		
		return (number <= 1) ? false : true;
	}
	
	private static int countAmountOfEvenNumber(int[] numbers) {
		int counter = 0;
		for(int number: numbers) {
			if(number % 2 == 0) {
				counter++;
			}
		}
		return counter;
	}
	
	
}

