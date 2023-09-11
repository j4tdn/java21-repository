package view;

import java.util.Random;

public class Ex10Random5Number {
	public static void main(String[] args) {
		Random rd = new Random();
		
		int[] numbers = new int[5];
		for(int i = 0; i < numbers.length; i++) {
			do {
				numbers[i] = 20 + rd.nextInt(11);
			} while (isExists(numbers[i], numbers, i));
		}
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}
	
	private static boolean isExists(int number, int[] numbers, int index) {
		for(int i = 0; i < numbers.length; i++) {
			if(number == numbers[i] && i != index) {
				return true;
			}
		}
		
		return false;
	}
}
