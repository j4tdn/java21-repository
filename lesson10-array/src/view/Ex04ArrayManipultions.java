package view;

import static utils.ArrayUtils.generate;

import functional.Operator;

public class Ex04ArrayManipultions {
	public static void main(String[] args) {

		/**
		 * Cho mảng n phần tử số nguyên dương [1, 20]
		 * 
		 * Yêu cầu 1. Tìm tổng các phần tử trong mảng 2. Tìm hiệu các phần tử trong mảng
		 * 3. Tìm số lớn nhất của các phần tử trong mảng 4. Tìm số bé nhất của các phần
		 * tử trong mảng 5. Tìm giá trị trung bình của các phần tử trong mảng ***
		 */
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		generate("Tong cac phan tu trong mang la: ", reduce(0,(a,b) -> a + b, numbers)); // Nhận vào a,b return về a + b
		generate("Hieu cac phan tu trong mang la: ", reduce(0,(a,b) -> a - b, numbers));
		generate("Gia tri lon nhat trong mang la:", reduce(
				Integer.MIN_VALUE, 
				(a, b)-> a < b ? b : a, 
				numbers));
		generate("Gia tri nho nhat trong mang la: ", reduce(
				Integer.MAX_VALUE, 
				(a, b) -> a > b ? b : a, 
				numbers));
		// sum(int...numbers) --> numbers: nhận vào 0 | 1 | n phần tử int hoặc mảng int[]
		// sum(int[] numbers) --> numbers: nhận vào mảng int[]

	}

	private static int reduce(int initial, Operator operator, int... numbers) {
		int result = initial; // int initial : giá trị ban đầu
		for (int number : numbers) {
			result = operator.operate(result, number);
			
			// result : là result hiện tại
			// number : là number hiện tại
		}
		return result;

	}

}