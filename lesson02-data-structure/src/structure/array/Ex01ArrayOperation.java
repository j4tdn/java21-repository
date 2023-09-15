package structure.array;

public class Ex01ArrayOperation {
	public static void main(String[] args) {
		// index: 0 1 2 3 4 5 
		// value: 0 0 0 0 0 0
		int[] numbers = new int[6];
		numbers[3] = 29;
		
//		System.out.println("Index 3: " + numbers[3]);
//		System.out.println("Index 2: " + numbers[2]);
		
		
		// duyệt for index
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Value at index " + i + ": " + numbers[i]);
		}
		
		// duyệt for each
		for (int number: numbers) {
			System.out.println("number: " + number);
		}
		
		System.out.println("==========================");
		
		String[] sequences = {"hello", "hi", "welcome"};
		// foreach
		for (String sequence: sequences) {
			System.out.println(sequence);
		}
		
	}
}
