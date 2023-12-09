package view;

import static utils.ArrayUtils.*;

import functional.Operator;

public class Ex04ArrayManipultions {
	public static void main(String[] args) {
		/*
		 * Cho mảng số nguyên dương [1, 20]
		 *  Yêu cầu 
		 *  1. Tìm kiếm những phần tử là số chẵn trong mảng 
		 * 	2. Tim kiến những phần tử là số lẻ trong mảng 
		 * 	3. Tìm kiếm những phần tử là số nguyên tố trong mảng 
		 * 	4. Tìm kiếm những phần tử là số hạnh phúc trong mảng
		 *  5. Tìm giá trị trung bình của các phần tử trong mảng
		 */
		
		int[] number = {5, 2, 8, 18, 4}; 
		
		generate("1. Tìm tổng các phần tử trong mảng ", sum(number));
		generate("1. Tìm tổng các phần tử trong mảng ", reduce(0, (a, b) -> a + b, number));
		
		generate("2. Tim hiệu các phần tử trong mảng trong mảng ", sub(number));
		generate("2. Tim hiệu các phần tử trong mảng trong mảng ", reduce(0, (a, b) -> a - b, number));
		
		generate("3. Tìm số lớn nhất của các phần tử trong mảng trong mảng ", max(number));
		generate("3. Tìm số lớn nhất của các phần tử trong mảng trong mảng ", reduce(
				Integer.MIN_VALUE, 
				(a, b) -> a > b ? a : b, 
				number
				)
		);
		
		generate("4. Tìm số bé nhất cua các phần tử trong mảng ", min(number));
		generate("4. Tìm số bé nhất cua các phần tử trong mảng ", reduce(Integer.MAX_VALUE, (a, b) -> a < b ? a : b, number));
		
	}
	
	private static int reduce(int initial, Operator operator, int...numbers) {
		int result = initial;
		for(int number : numbers) {
			result = operator.operator(result, number);
		}
		return result;
	}
	
	private static int sum(int...numbers) {
		int result = 0;
		for(int number : numbers) {
			result += number;
		}
		return result;
	}
	
	private static int sub(int...numbers) {
		int result = 0;
		for(int number : numbers) {
			result -= number;
		}
		return result;
	}
	
	private static int max(int...numbers) {
		int result = Integer.MIN_VALUE;
		for(int number : numbers) {
			result = result < number ? number : result;
		}
		return result;
	}
	
	private static int min(int...numbers) {
		int result = Integer.MAX_VALUE;
		for(int number : numbers) {
			result = result > number ? number : result;
		}
		return result;
	}
}
