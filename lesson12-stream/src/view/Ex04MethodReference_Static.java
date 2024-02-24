package view;

import java.util.function.IntBinaryOperator;

public class Ex04MethodReference_Static {

	public static void main(String[] args) {
		
		/*
		 
		 1. Implementation class
		 2. Anonymous class
		 3. Anonymous function(lambda)
		 4. Method reference( là cách viết ngắn gọn của lambda, để mình tạo ra đối tượng cho 1 functional interface)
		    --> static method reference
		    	> Có thể chuyển 1 lambda bất kỳ sang static method reference
		    	
		    	Nên dùng khi:
		    	+ Lambda có dạng giống với 1 static method đã tồn tại trong dự án(java + custom)
		    	+ Lambda có body dài và được sử dụng, gọi nhiều chỗ
		    	
		    --> non-static method reference
		    
		 
		 Bài tập: Cho một danh sách các số nguyên, viết chương trình 
		          + Tìm tổng các phần tử trong danh sách
		          + Tìm GTLN
		          + Tìm GTNN
		 
		 */
		
		int[] numbers = { 1, 6, 8, 2, 15, 22, 7 };
		
		System.out.println("------------ strategy pattern ------------");
		
		int sum1 = process(0, numbers, (a, b) -> a + b);
		int max1 = process(Integer.MIN_VALUE, numbers, (a, b) -> a < b ? b : a);
		int min1 = process(Integer.MAX_VALUE, numbers, (a, b) -> a > b ? b : a);
		
		System.out.println("" 
		                      + "sum1 = " + sum1 
		                      + "\nmax1 = " + max1 
		                      + "\nmin1 = " + min1);
		
        System.out.println("---------- method reference ------------");
		
		int sum2 = process(0, numbers, (a, b) -> a + b);
		int sum3 = process(0, numbers, Ex04MethodReference_Static::sum);
		int sum4 = process(0, numbers, Integer::sum);
		int max2 = process(Integer.MIN_VALUE, numbers, Integer::max);
		int min2 = process(Integer.MAX_VALUE, numbers, Integer::min);
		
		System.out.println("" 
		                      + "sum2 or 3 = " + sum2 
		                      + "\nmax2 = " + max2 
		                      + "\nmin2 = " + min2);

	}
	
	// khai báo static method reference
	private static int sum(int a, int b) {
		return a + b;
	}
	
	// khai báo static method reference
	private static int process(int initial, int[] elements, IntBinaryOperator operator) {
		int result = initial;
		for (int element : elements) {
			result = operator.applyAsInt(result, element);
		}
		return result;
	}

}
