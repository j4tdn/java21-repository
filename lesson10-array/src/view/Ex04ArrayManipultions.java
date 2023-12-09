package view;
import static untils.ArrayUtils.generate;

import functional.Operator;
public class Ex04ArrayManipultions {
	public static void main(String[] args) {
		/*
		 * Cho mảng số nguyên dương [1,20]
		 * Yêu cầu
		 * 1. Tìm tổng phần tử trong mảng
		 * 2. Tìm hiệu phần tử trong mảng
		 * 3. Tìm số lớn nhất các phần tử trong mảng
		 * 4. Tìm số bé nhất các phần tử trong mảng
		 * 5. Tìm giá trị trung bình của các phần tử trong mảng
		 */
		int [] numbers = {5, 2, 8, 18, 4};
		// sum(int...numbers) -> numbers: nhận vào 0 1 n phần từ int hoặc mảng int[]
		// sum(int[] numbers) -> numbers: nhận vào mảng int[]
		
		
		generate("1. Tìm tổng các phần tử trong mảng", sum(numbers));
		
		generate("2. Tìm hiệu phần tử trong mảng", sub(numbers));
		
		generate("3. Tìm số lớn nhất các phần tử trong mảng", max(numbers));
		
		generate("4. Tìm số bé nhất các phần tử trong mảng", min(numbers));
	}
	
	private static int sum (int...numbers) {
		int result = 0;
		for (int number: numbers) {
			result = result + number;
		}
		return result;
	}
	private static int sub (int...numbers) {
		int result = 0;
		for (int number: numbers) {
			result = result - number;
		}
		return result;
	}
	private static int max (int...numbers) {
		int result = Integer.MIN_VALUE;
		for (int number: numbers) {
			result = result< number ? number : result;
		}
		return result;
	}
	private static int min (int...numbers) {
		int result = Integer.MAX_VALUE;
		for (int number: numbers) {
			result = result> number ? number : result;
		}
		return result;
	}
	
	private static int reduce( Operator operator, int...numbers)	{
		int result = 0;
		for (int number:numbers) {
			result = operator.operate(result, number);
		}
		return result;
	}
}
