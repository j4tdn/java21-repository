package view;

import java.util.function.IntBinaryOperator;

public class Ex04MethodReference {
	public static void main(String[] args) {
		/*
		 1. Implementation class
		 2. Anonymous class
		 3. Anonymous function
		 4. Method Reference
		 	--> static method reference
		 	Có thể chuyển 1 lambda bất kỳ sang static method reference
		 	
		 	
		 	Nên dùng khi
		 	+ Lambda có dạng giống với 1 static method đã tồn tại trong dự án(Java + Custom)
		 	+ Lambda có body dài và sử dụng được gọi nhiều chỗ
		 	--> non-static method reference
		 
		 Bài tập: cho danh sách các số nguyên. Viết chương trình
		 + Tìm tổng các phần tử trong danh sách
		 + Tìm giá trị lớn nhất của các phần tử trong mảng
		 + Tìm giá trị nhỏ nhất của các phần tử trong mảng
		 
		 */
		
		int[] nums = {1,6,8,2,14,22,7};
		
		int max = process(Integer.MIN_VALUE, nums, (a, b)-> a < b ? b : a);
		System.out.println("max --> " + max);
		
		// Khai báo static method reference
		
		
		// sum = sum + element;
		// max = max < element ? element : max;
		// min = min > element ? element : min;
		
		// int method(int, int) --> IntBinaryOperator
		// Function<T, R>
		// Function<T, U, R>
		// BinaryOperator<T> extends BiFunction<T, T, T>
		
	}
	private static int teo(int a, int b){
		return a + b;
	}
	public static int process(int initial, int[] elements, IntBinaryOperator operator) {
		int result = initial;
		for(int element:elements) {
			result = operator.applyAsInt(result, element);
		}
		return result;
	}
}
