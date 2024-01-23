package view;

import java.util.function.IntBinaryOperator;

public class Ex04MethodReference_Static {
	
	public static void main(String[] args) {
		/*
		 
		 1. Implementation class
		 2. Anonymous class
		 3. Anonymous function(lambda)
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
		
		int[] numbers = { 1, 6, 8, 2, 15, 22, 7 };
		
		int sum = sum(numbers);
		int max = max(numbers);
		int min = min(numbers);
		
		System.out.println(""
				+ "sum = " + sum
			    + "\nmax = " + max
				+ "\nmin = " + min);
		
		System.out.println("---------- strategy -----------");
		
		// 1, 6, 8, 2, 15, 22, 7
		int sum1 = process(0, numbers, (a, b) -> a + b);
		int max1 = process(Integer.MIN_VALUE, numbers, (a, b) -> a < b ? b : a);
		int min1 = process(Integer.MAX_VALUE, numbers, (a, b) -> a > b ? b : a);
		
		System.out.println(""
				+ "sum1 = " + sum1
			    + "\nmax1 = " + max1
				+ "\nmin1 = " + min1);
		
		System.out.println("---------- method reference -----------");
		
		// 1, 6, 8, 2, 15, 22, 7
		int sum2 = process(0, numbers, Integer::sum);
		int max2 = process(Integer.MIN_VALUE, numbers, Ex04MethodReference_Static::max);
		// int max2 = process(Integer.MIN_VALUE, numbers, Integer::max);
		int min2 = process(Integer.MAX_VALUE, numbers, Ex02LambdaSyntax::min);
		
		System.out.println(""
				+ "sum2 = " + sum2
			    + "\nmax2 = " + max2
				+ "\nmin2 = " + min2);
		
		
	}
	
	// khai báo static method reference
	private static int sum(int x, int y) {
		return x + y;
	}
	
	private static int max(int a, int b) {
		return a < b ? b : a;
	}
	
	// sum = sum + element;
	// max = max < element ? element : max;
	// min = min > element ? element : min;
	
	// int method(int, int) --> IntBinaryOperator
	
	// Function<T, R>
	// BiFunction<T, U, R>
	// BinaryOperator<T> extends BiFunction<T, T, T>
	
	// Stream#filter
	// Stream#reduce
	
	private static int process(int initial, int[] elements, IntBinaryOperator operator) {
		int result = initial;
		for (int element: elements) {
			result = operator.applyAsInt(result, element);
		}
		return result;
	}
	
	private static int sum(int[] elements) {
		int sum = 0;
		for (int element: elements) {
			sum = sum + element;
		}
		return sum;
	}
	
	private static int max(int[] elements) {
		int max = Integer.MIN_VALUE;
		for (int element: elements) {
			max = max < element ? element : max;
		}
		return max;
	}
	
	private static int min(int[] elements) {
		int min = Integer.MAX_VALUE;
		for (int element: elements) {
			min = min > element ? element : min;
		}
		return min;
	}
	
}