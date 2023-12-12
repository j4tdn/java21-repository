package view;

import java.util.Arrays;
import java.util.Random;
import static utils.ArraysUtils.*;

public class Ex01 {
	public static void main(String[] args) {
		
		int[] numbers = input(10);
		generate("0. numbers", numbers);
		
		int[] uniqueNumbers = duptication(numbers);
		generate("1. remove elements dupticate", uniqueNumbers);
		
		compare(numbers);
		
		find3rd(numbers);
	}
	
	private static int[] input(int n) {
		Random rd = new Random();
		int[] numbers = new int[n];
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = rd.nextInt(10);
		}
		return numbers;
	}
	
	private static int[] duptication(int[] numbers) {
		int[] result = new int[numbers.length];
		int count = 0;
		for(int i = 0; i < numbers.length; i++) {
			int count2 = 0;
			for(int j = 0; j < numbers.length; j++) {
				if(numbers[i] == numbers[j] && j != i) {
					count2++;
					break;
				}
			}
			if(count2 == 0) {
				result[count++] = numbers[i];
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	
	private static int[] duptication2(int[] numbers) {
		int[] result = new int[numbers.length];
		int count = 0;
		for(int i = 0; i < numbers.length; i++) {
			int count2 = 0;
			for(int j = 0; j < numbers.length && j != i; j++) {
				if(numbers[i] == numbers[j]) {
					count2++;
					break;
				}
			}
			if(count2 == 0) {
				result[count++] = numbers[i];
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	
	private static void compare(int[] numbers) {
		float sum1 = 0, sum2 = 0;
		for(int i = 0; i < numbers.length; i++) {
			if(i < Math.ceil(numbers.length/2.0)) {
				sum1 += numbers[i];
			}
			if(i >= numbers.length / 2) {
				sum2 += numbers[i];
			}
		}
		System.out.println("\nsum1 = " + sum1 + "\nsum2 = " + sum2);
		System.out.println("aveValue1: " + (float)sum1/Math.ceil(numbers.length/2.0) + "\naveValue2: " + (float)sum2/Math.ceil(numbers.length/2.0));
		System.out.println(sum1 > sum2? "giá trị trung bình của " + (int)Math.ceil(numbers.length/2.0) + " phần tử đầu mảng lớn hơn cuối mảng"
				: "giá trị trung bình của " + (int)Math.ceil(numbers.length/2.0) + " phần tử cuối mảng lớn hơn đầu mảng");
	}
	
	private static void find3rd(int[] elements) {
		int[] numbers = duptication2(elements);
		Arrays.sort(numbers);
		generate("\n4.Check trùng", numbers);
		System.out.println("Phần tử lớn thứ 3 trong mảng là: " + numbers[numbers.length-3]);
	}
}
