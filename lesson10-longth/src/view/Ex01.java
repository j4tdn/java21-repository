package view;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		int[] numbers = { 1, 2,2,2, 3, 4, 3, 8, 7, 1, 9 };
		removeDuplicate(numbers);
		
		System.out.println("\n==============\n");
		
		compareAvg(numbers);
		
		System.out.println("\n==============\n");
		
		findRank(numbers, 3);

	}

	private static void removeDuplicate(int[] numbers) {
		int[] resultDuplicate = new int[numbers.length];
		int len = 0;
		for (int i = 0; i < numbers.length; i++) {
			int count = 0;
			for (int j = 0; j < numbers.length; j++) {
				if (numbers[i] == numbers[j]) {
					count += 1;
				}
				if (j == (numbers.length - 1) && count == 1) {
					resultDuplicate[len++] = numbers[i];
					count = 0;
				}
			}
		}
		resultDuplicate = Arrays.copyOfRange(resultDuplicate, 0, len);
		System.out.println(Arrays.toString(resultDuplicate));
	}
	
	private static void compareAvg(int[] numbers) {
		Double avgFirstNumbers;
		Double avgLastNumbers;
		double sumFirst = 0;
		double sumLast = 0;
		
		if (numbers.length % 2 == 0) {
			for (int i = 0; i < (numbers.length/2); i++ ) {
				sumFirst = sumFirst + numbers[i];
			}
			for (int i = (numbers.length / 2); i < numbers.length; i++ ) {
				sumLast = sumLast + numbers[i];
			}
			avgFirstNumbers = sumFirst/(numbers.length/2);
			avgLastNumbers = sumLast/(numbers.length/2);
			
		} else {
			for (int i = 0; i < (numbers.length/2 + 1); i++ ) {
				sumFirst = sumFirst + numbers[i];
			}
			for (int i = (numbers.length / 2 + 1); i < numbers.length; i++ ) {
				sumLast = sumLast + numbers[i];
			}
			avgFirstNumbers = sumFirst/((numbers.length/2)+1);
			avgLastNumbers = sumLast/(numbers.length/2);
		}
		System.out.println("Giá trị tổng phần tử đầu tiên: " + sumFirst);
		System.out.println("Giá trị trung bình phần tử đầu tiên: " + avgFirstNumbers);
		System.out.println("Giá trị tổng phần tử sau: " + sumLast);
		System.out.println("Giá trị trung bình phần tử sau: " + avgLastNumbers);
		String s = (avgFirstNumbers.compareTo(avgLastNumbers)) == 1 ?"n/2 phần tử đầu tiên lớn hơn":"n/2 phần tử sau lớn hơn";
		System.out.println(s);
	}
	
	private static void findRank(int[] numbers, int n) {
		int count = 1;
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		for (int i = 1; i<numbers.length; i++) {
			if (numbers[i] != numbers[i-1]) {
				count += 1;
			}
			if (count == n) {
				System.out.println("Phần tử thứ " + n + ": " + numbers[i]);
				break;
			}
		}
	}
}
