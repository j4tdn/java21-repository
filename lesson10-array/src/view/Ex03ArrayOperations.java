package view;

import static utils.ArrayUtils.*;

import java.util.Arrays;

public class Ex03ArrayOperations {
	public static void main(String[] args) {
		/*cho một mảng số nguyên dương nào đó
		
		 Yêu cầu: 
		 1.Tìm kiếm các phần tử chẵn trong mảng
		 2.Tìm kiếm các phần tử lẻ trong mảng
		 3.Tìm kiếm các phần tử là số nguyên tố trong mảng
		 4.Tìm kiếm các phần tử là số hạnh phúc có trong mảng
		
		
	    */
		
		int[] numbers = {1,2,3,4,5,6};
		getEvenNumber(numbers);
		generate("Even Number :", getEvenNumber(numbers));
		generate("Prime Number: ", getPrime(numbers));
		
	}
	
	
	private static int[] getEvenNumber(int[] elements) {
		int[] target = new int[elements.length];
		int count = 0;
		for(int element : elements) {
			if(element % 2 ==0) {
				target[count++] = element;
			}	
		}
		return Arrays.copyOfRange(target, 0, count);
	}
	private static int[] getPrime(int[] elements) {
		int[] target = new int[elements.length];
		int count = 0;
		for(int element : elements ) {
			if(Prime(element)) {
				target[count++] = element;
			}
		}
		return Arrays.copyOfRange(target, 0, count);
	}

	private static boolean Prime(int number) {
		if(number <= 1) {
			return false;
		}
		for(int i = 2 ; i <= Math.sqrt(number); i++) {
			if(number % i == 0) {
				return false;
			}
		}
		return true;
	}
}