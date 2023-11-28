package view;
import static utils.ArraysUtils.*;

import utils.Operation;
public class Ex04ArrayManipultions {

	public static void main(String[] args) {
		/*
		 * cho mảng n phần tử số nguyên dương [1,20]
		 * 
		 * yêu cầu
		 * 1. tìm tổng các phần tử trong mảng
		 * 2. tìm hiệu các phầ tử trong mảng
		 * 3. tìm số lớn nhất của các phần tử trong mảng
		 * 4. tìm số bé nhất của các phần tử trong mảng
		 * 5. tìm giá trị trung bình của các ohaanf tử trong mảng
		 * 
		 */
		
		int[] numbers = {5,2,8,18,4};
		
		// sum(int...numbers) --> numbers: nhận vào 0 | 1 | n phần tử int hoặc mảng int[]
		// sum(int[] numbers) --> numbers: nhận vào mảng int[]
				
		generate("1. Tìm tổng các phần tử trong mảng", sum(numbers));
		generate("1. Tìm tổng các phần tử trong mảng", reduce(0, (rs,nb) -> rs + nb, numbers));
		
		generate("1. Tìm hiệu các phần tử trong mảng", sub(numbers));
		generate("1. Tìm hiệu các phần tử trong mảng", reduce(0, (rs,nb) -> rs - nb, numbers));

		
		generate("1. Tìm max các phần tử trong mảng", max(numbers));
		generate("1. Tìm max các phần tử trong mảng", reduce(Integer.MIN_VALUE, (rs,nb) -> rs < nb ? nb : rs , numbers));

		generate("1. Tìm min các phần tử trong mảng", min(numbers));
		generate("1. Tìm max các phần tử trong mảng", reduce(Integer.MAX_VALUE, (rs,nb) -> rs > nb ? nb : rs , numbers));

		
		
	}
	
		// result + number;
		// result - number
		// result < number ? number : result;
		// result > number ? number : result;
		
		// Biểu thức: int operate(int a, int b)
		
		// (a, b) -> a + b;
		// (a, b) -> a - b;
		// (a, b) --> a < b ? b : a
		// (a, b) --> a > b ? b : a
		// {5, 2, 8, 18, 4};
	
	private static int reduce(int initial, Operation operation, int...numbers) {
		int result = initial;
		for(int number:numbers) {
			result = operation.operation(result, number);
		}
		return result;
	}
	
	private static int sum(int...numbers) {
		int result  = 0;
		for(int number:numbers) {
			result += number;
		}
		return result;
	}
	
	private static int sub(int...numbers) {
		int result  = 0;
		for(int number:numbers) {
			result -= number;
		}
		return result;
	}
	
	private static int max(int...numbers) {
		int result = Integer.MIN_VALUE;
		for(int number:numbers) {
			result = result < number ? number : result;
		}
		return result;
	}
	
	private static int min(int...numbers) {
		int result = Integer.MAX_VALUE;
		for(int number:numbers) {
			result = result > number ? number : result;
		}
		return result;
	}
	
}
