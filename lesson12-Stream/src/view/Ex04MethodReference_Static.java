package view;

import java.util.function.IntBinaryOperator;

public class Ex04MethodReference_Static {
	public static void main(String[] args) {
		int[] number = {1,5,7,4,9,50};
		
		// Lambda
		int sum = process(0, number, (a,b)-> a+b);
		int max = process(Integer.MIN_VALUE, number, (a, b)-> a < b ? b : a); 
		int min = process(Integer.MAX_VALUE, number, (a, b) -> a > b ? b : a);
		System.out.println("Sum = "+sum + "\nMax = "+ max +"\nMin = "+min);
		
		int sum1 = process(0, number, Integer::sum);
		int max1 = process(Integer.MIN_VALUE, number, Math::max); 
		int min1 = process(Integer.MAX_VALUE, number, Math::min);
		System.out.println("Sum = "+sum1 + "\nMax = "+ max1 +"\nMin = "+min1);
		}
	
		// Method reference : xuất hiện từ java 8
		/*
		 * 1.Implementation class 
		 * 2.Anounymous class 
		 * 3.Anounymous function 
		 * 4.Method Reference
		 * 
		 * --> static method reference --> non static method reference
		 * 
		 * Bài tập: cho danh sách các số nguyên, viết chương trình : + tìm tổng các phần
		 * tử trong danh sách + tìm giá trị lớn nhất + tìm giá trị nhỏ nhất
		 */
		
	

	private static int process(int initial, int[] element, IntBinaryOperator operator) {
		int result = initial;
		for (int elements : element) {
			result = operator.applyAsInt(result, elements);
		}
		return result;
	}

}
