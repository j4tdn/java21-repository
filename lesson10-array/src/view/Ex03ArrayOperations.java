package view;

import static java.util.Arrays. *;

import static utils.ArrayUtils. *;

import functional.IntCheck;


public class Ex03ArrayOperations  {
	public static void main(String[] args) {
		/*
		 * Cho mảng số nguyên dương [1, 20]
		 * Yêu cầu 
		 * 1. Tìm kiếm những phần tử là số chẵn trong mảng
		 * 2. Tìm kiếm những phần tử là số lẻ trong mảng
		 * 3. Tìm kiếm những phần tử là số nguyên tố trong mảng
		 * 4. Tìm kiếm những phần tử là số hạnh phúc trong mảng
		 */
		
		int[] numbers = {2, 7, 13, 24, 17, 19, 35};
		
		generate("1. Even number", getNumbers(numbers, nb -> nb % 2 == 0 ));
		generate("2. Odd number", getNumbers(numbers, nb -> nb % 2 != 0 ));
		generate("3. Prime number", getNumbers(numbers, nb -> isPrime(nb)));


	}
	
	// strategy
	// 1.Biểu thức có tham số đầu vào là gì
	// 2.Biueer thức có kiểu dữ liệu trả về là gì
	
	// 1 --> element
	// 2 --> boolean
	// strategy: Interface chứa hàm trừu tượng boolean strategy(int element)
	private static int[] getNumbers(int[] elements, IntCheck intchecker) {
		int[] results = new int[elements.length];
		
		int count = 0;
		
		for(int element: elements) {
			if(intchecker.test(element)) {
				results[count++] = element;
			}
		}
		
		return copyOfRange(results, 0, count);
	}
	private static boolean isPrime(int number) {
		for(int i = 2; i < Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}
