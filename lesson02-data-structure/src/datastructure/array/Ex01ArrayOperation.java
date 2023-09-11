package datastructure.array;

public class Ex01ArrayOperation {
	public static void main(String[] args) {
		int[] numbers = new int[6];
		numbers[3] = 25;
		for(int i = 0; i < numbers.length; i++) {
			System.out.println("Value at index" + i + ": " + numbers[i]);
		}
		
		for (int i : numbers) {
			System.out.println(i);
		}
	}
}
