package view;

import java.util.function.IntBinaryOperator;

public class Ex04MethodReference_Static {

	public static void main(String[] args) {
		/*
		 	1. implementation class
			2. anonymous class
			3. anonymous function
		 	4. method Reference
		 		--> static method reference
		 		có thể chuyển 1 lambda bất kỳ sang static method reference
		 		
		 		Nên dùng khi
		 		+ Lambda có dạng giống với 1 static method đã tồn tại trong dự án (Java + Custom)
		 		+ Lambda có body dài và sử dụng được gọi nhiều chỗ
		 		
		 		--> non-static method reference
		 		
		 	bài tập: cho một danh sách các số nguyên. Viết chương trình
		 	+ Tìm tổng các phần tử trong danh sách
		 	+ Tìm giá trị lớn nhất của các phần tử trong mảng
		 	+ Tìm giá trị lớn nhất của các phần tử trong mảng
		 		
		 */
		
		// khai báo static method reference
		
		System.out.println("===== strategy pattern===== ");
		
		int[] arr = {1,2,3,4,5};
		int sum1 = process(0, arr, (a, b) -> a + b);
		int max1 = process(Integer.MIN_VALUE, arr, (a, b) -> a < b ? b : a);
		int min1 = process(Integer.MAX_VALUE, arr, (a, b) -> a > b ? b : a);
		System.out.println("sum: " + sum1);
		System.out.println("max: " + max1);
		System.out.println("min: " + min1);
		
		
		System.out.println("===== method reference ===== ");
		
		int sum = process(0, arr, Ex04MethodReference_Static::sum);
		int max = process(Integer.MIN_VALUE, arr, Integer::max);
		int min = process(Integer.MAX_VALUE, arr, Integer::min);
		System.out.println("sum: " + sum);
		System.out.println("max: " + max);
		System.out.println("min: " + min);
		
	}
	
	// Function<T,R>
	//BiFunction<T,U,R>
	//BinaryOperator<T> extends BiFunction<T,T,T>
	
	// Stream#filter
	// Stream#reduce
	
	// int method(int, int) --> IntBinaryOperator
	
	private static int process(int initial, int[] elements, IntBinaryOperator operator) {
		int result = initial;
		for(int element:elements) {
			result = operator.applyAsInt(result, element);
			
		}
		return result;
	}
	
	private static int sum(int x, int y) {
		return x + y;
	}
}
