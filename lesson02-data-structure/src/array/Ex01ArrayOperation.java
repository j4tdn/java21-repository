package array;

public class Ex01ArrayOperation {
	
	public static void main(String[] args) {
		// index: 0 1 2 3  4 5 6
		// value: 0 0 0 25 0 0 0
		int[] numbers = new int[6];
		numbers[3] = 25;
		
//		System.out.println("Index 3: " + numbers[3]);
		
		// forindex
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Value at index " + i + ": " + numbers[i]);
		}
		
		// foreach
		for (int number: numbers) {
			System.out.println("number: " + number);
		}
		
		String[] sequences = {"hello", "hi", "chao xìn"};
		for (String sequence: sequences) {
			System.out.println(sequence);
		}
	}
}
