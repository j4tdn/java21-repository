package datastructure.array;

public class Ex02ArrayOperation {
	public static void main(String[] args) {
		//Mảng int 
		// index: 0 1 2 3 4 5 6
		// value: 0 0 0 0 0 0 0 
		int[] numbers = new int[6];
		numbers[3] = 25;
//		System.out.println("Index 3: " + numbers[3]);
		// forindex
		for(int i = 0; i < numbers.length; i++) {
			System.out.println("Value at index " + i + ": " + numbers[i]);
		}
		
		// foreach
		// dùng khi ko quna tâm đến chỉ số 
		for(int number : numbers) {
			System.out.println("number: " + number );
		}
		
		
		System.out.println("======ví dụ mảng có giá trị=======");
		String[] sequences = {"hello", "hi", "welcome"};
		System.out.println("length: " + sequences.length);
		for(String sequence : sequences) {
			System.out.println(sequence);
		}
		
		
	
	}
}
