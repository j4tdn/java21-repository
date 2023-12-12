package view;

import static utils.ArrayUtils. *;

import functional.IntCheck;
import functional.IntGetNumber;

public class Ex04ArrayManipultions {
	public static void main(String[] args) {
		/*
		 * Cho mảng n phần tử số nguyên dương [1, 20]
		 * Cho mảng số nguyên dương [1, 20]
		 * Yêu cầu 
		 * 1. Tìm tổng các phần tử trong mảng
		 * 2. Tìm hiệu các phần tử trong mảng
		 * 3. Tìm số lớn nhất của các phần tử trong mảng
		 * 4. Tìm số bé nhất của các phần tử trong mảng
		 * 5. Tìm giá trị trung bình của các phần tử trong mảng
		 */
		int[] numbers = {5, -2, 8, 18, 4};
		generate("1. Tổng các phần tử trong mảng", getNumber(0, numbers, (rs, nb) -> (rs+nb)));
		generate("2. Hiệu các phần tử trong mảng", getNumber(0, numbers, (rs, nb) -> (rs-nb)));
		generate("3. Số lớn nhất trong các phần tử trong mảng", getNumber(Integer.MIN_VALUE, numbers, (rs, nb) -> rs < nb ? nb : rs));
		generate("4. Số nhỏ nhất trong các phần tử trong mảng", getNumber(Integer.MAX_VALUE, numbers, (rs, nb) -> rs > nb ? nb : rs));
	} 
	
	// result + number
	// result - number;
	// result < number ? number : result
	// result < number ? number : result
	
	// Biểu thức: int operate(int a, int b)
	
	//  
	
	private static int getNumber(int initial, int[] numbers, IntGetNumber checker) {		
		int result = initial;
		for(int number: numbers) {
			result = checker.operate(result, number);
		}
		return result;
	}
}
