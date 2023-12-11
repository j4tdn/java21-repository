package view;

import java.util.Arrays;

public class Ex01 {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 3, 1 };

		Arrays.sort(numbers);

		int[] result = removeDuplicates(numbers);
		System.out.println(Arrays.toString(result));

		System.out.println("1. compareTo: " + compare(result));
		System.out.println("2. maxof3: " + maxof3(result));
	}

	public static int[] removeDuplicates(int[] numbers) {
		int j = 0;
		for (int i = 0; i < numbers.length - 1; i++) {
			if (numbers[i] != numbers[i + 1]) {
				numbers[j++] = numbers[i];
			}
		}

		numbers[j] = numbers[numbers.length - 1];
		int[] result = Arrays.copyOf(numbers, j + 1);
		return result;
	}

	public static int compare(int[] numbers) {
		int sum1 = 0;
		int sum2 = 0;

		for (int i = 0; i < numbers.length / 2; i++) {

//			if(numbers.length % 2 == 0) {
//				sum1 += numbers[i];
//				sum2 += numbers[numbers.length/2 +i];

			sum1 += numbers[i];
			sum2 += numbers[numbers.length / 2 + i];
		}

		return sum1 - sum2;

	}

	public static int maxof3(int[] numbers) {
		return numbers[numbers.length - 3];
	}
}
