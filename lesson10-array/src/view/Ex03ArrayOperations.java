package view;
import java.util.Arrays;
import static utils.ArraysUtils.*;

import utils.ArraysUtils.*;
import utils.IntCheck;
public class Ex03ArrayOperations {

	public static void main(String[] args) {
	
		/**
		 * Cho mảng số nguyên dương [1, 20]
		 * 
		 * Yêu cầu
		 * 1. Tìm kiếm những phần tử là số chẵn trong mảng
		 * 2. Tìm kiếm những phần tử là số lẻ trong mảng
		 * 3. Tìm kiếm những phần tử là số nguyên tố trong mảng
		 * 4. Tìm kiếm những phần tử là số hạnh phúc trong mảng
		 */
		
		int[] numbers = { 2, 7, 13, 24, 17, 19, 35 };
		
		generate("1. Get Even Numbers: ", getEven(numbers));
		generate("1. Get Even Numbers: ", getNumbers(numbers, nb -> nb % 2 == 0));
		
		generate("2. Get Odd Numbers: ", getOdd(numbers));
		generate("2. Get Odd Numbers: ", getNumbers(numbers, nb -> nb % 2 != 0));
		
		generate("3. Get Prime Numbers: ", getPrimeNumbers(numbers));
		generate("3. Get Prime Numbers: ", getNumbers(numbers, nb -> isPrime(nb)));

	}
	
	// element % 2 == 0 --> KT có phải là số chẵn
	// element % 2 != 0 --> KT có phải là số lẽ
	// isPrime(element) --> KT có phải là số nguyên tố
	
	// strategy
	// 1. Biểu thức có tham số đầu vào là gì
	// 2. Biểu thức có kiểu dữ liệu trả về là gì
	
	// 1 --> element
	// 2 --> boolean
	// strategy: Interface chứa hàm trừa tượng boolean strategy(int element)
	
	private static int[] getNumbers(int[] elements, IntCheck intCheck) {
		int[] target = new int[elements.length];
		int count = 0;
		
		for(int element:elements) {
			if(intCheck.test(element)) {
				target[count++] = element;
			}
		}
		return Arrays.copyOfRange(target, 0, count);
	}
	
	private static int[] getEven(int[] elements) {
		int[] target = new int[elements.length];
		int count = 0;
		
		for(int element:elements) {
			if(element % 2 == 0) {
				target[count++] = element;
			}
		}
		return Arrays.copyOfRange(target, 0, count);
	}
	
	private static int[] getOdd(int[] elements) {
		int[] target = new int[elements.length];
		
		int count = 0;
		
		for(int element:elements) {
			if(element %2 != 0) {
				target[count++] = element;
			}
		}
		return Arrays.copyOfRange(target, 0, count);
	}
	
	private static int[] getPrimeNumbers(int[] elements) {
		int[] target = new int[elements.length];
		
		int count = 0;
		
		for(int element:elements) {
			if(isPrime(element)) {
				target[count++] = element;
			}
		}
		
		return Arrays.copyOfRange(target, 0, count);
	}
	
	private static boolean isPrime(int element) {
		for(int i = 2; i < Math.sqrt(element); i++) {
			if(element % i == 0) {
				return false;
			}
		}
		return true;
	}
	
}
