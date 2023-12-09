package view;

import static utils.ArrayUtils.*;

import java.util.Arrays;

import functional.IntCheck;

public class Ex03ArrayOperations {

	public static void main(String[] args) {
		/*
		 * Cho mảng số nguyên dương [1,20]
		 * 
		 * Yêu cầu
		 * 
		 * 1. Tìm kiếm những phần tử là số chẵn trong mảng 2. Tìm kiếm những phần tử là
		 * số lẻ trong mảng 3. Tìm kiếm những phần tử là số nguyên tố trong mảng 4. Tìm
		 * kiếm những phần tử là số hạnh phúc trong mảng
		 * 
		 * xác đinh: dùng strategy có input là gì, output là gì
		 * 
		 */

		int[] numbers = { 2, 7, 13, 24, 17, 19, 35 };

		generate("1.Even numbers ", getEvenNumbers(numbers));
		generate("1.Even numbers ", getNumbers(numbers, nb -> nb % 2 == 0));

		generate("2.Odd numbers ", getOddNumbers(numbers));
		generate("2.Odd numbers ", getNumbers(numbers, nb -> nb % 2 != 0));

		generate("3.Prime numbers ", getPrimeNumbers(numbers));
		generate("2.Odd numbers ", getNumbers(numbers, nb -> isPrime(nb)));
	}

	private static int[] getNumbers(int[] elements, IntCheck intCheck) {
		int[] target = new int[elements.length];

		int count = 0;

		for (int element : elements) {
			if (element % 2 == 0) {
				target[count++] = element;
			}
		}

		return Arrays.copyOfRange(target, 0, count);
	}

	private static int[] getEvenNumbers(int[] elements) {
		int[] target = new int[elements.length];

		int count = 0;
		for (int element : elements) {
			if (element % 2 == 0) {
				target[count++] = element;
			}
		}

		return Arrays.copyOfRange(target, 0, count);
	}

	private static int[] getOddNumbers(int[] elements) {
		int[] target = new int[elements.length];

		int count = 0;
		for (int element : elements) {
			if (element % 2 != 0) {
				target[count++] = element;
			}
		}

		return Arrays.copyOfRange(target, 0, count);
	}

	private static int[] getPrimeNumbers(int[] elements) {
		int[] target = new int[elements.length];

		int count = 0;
		for (int element : elements) {
			if (isPrime(element)) {
				target[count++] = element;
			}
		}

		return Arrays.copyOfRange(target, 0, count);
	}

	private static boolean isPrime(int number) {
		if (number < 2) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

}
