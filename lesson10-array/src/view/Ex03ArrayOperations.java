package view;

import java.util.Arrays;

public class Ex03ArrayOperations {

	public static void main(String[] args) {
		
		int[] numbers = {2, 7, 13, 24, 17, 19, 35};
		
	}
	
	private static int[] getEvenNumbers(int[] elements) {
		int[] target = new int[elements.length];
		
		int count = 0;
		
		for(int element : elements) {
			if(element % 2 == 0) {
				target[count++] = element;
			}
		}
		
		return Arrays.copyOfRange(target, 0, count);
	}
	
	private static int[] getOddNumbers(int[] elements) {
		int[] target = new int[elements.length];
		
		int count = 0;
		
		for(int element : elements) {
			if(element % 2 != 0) {
				target[count++] = element;
			}
		}
		
		return Arrays.copyOfRange(target, 0, count);
	}
	
}
