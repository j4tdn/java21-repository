 package view;

import java.util.function.IntBinaryOperator;

public class Ex04Reference_Static {
	
	public static void main(String[] args) {
		// 1. Implementation class 
		// 2. Anonymous class
		// 3. Anonymous function (lamda)
		// 4. Method Reference: Là một cách viết ngắn gọn của lamda, cho phép mình tạo ra đối tượng cho functional interface
		 /*     --> static method reference
		     Có thể chuyển 1 lamda bất kỳ sang static method reference
		     
		        --> non-static method reference
		        
		     Nên dùng khi
		       + Lamda có dạng giống với 1 static method đã tồn tại trong dự án (Java + Custom)
		       + Lamda có body dài và sử dụng được gọi nhiều chỗ    
		     
		   Bài tập: Cho danh sách các số nguyên. Viết chương trình
		   + Tìm tổng các phần tử trong danh sách
		   + Tìm giá trị lớn nhất của các phần tử trong mảng 
		   + Tìm giá trị nhỏ nhất của các phần tử trong mảng
		   
		   
		  */
		
		int[] numbers = {1,6, 8, 2, 15, 22, 7};
		
		int sum = sum(numbers);
		
		
		System.out.println(""
				+ "sum = " + sum);
		
		System.out.println("-------------------------Strategy----------------------");
		
		int sum1 = process(0, numbers, (a,b) -> a + b);
		int max1 = process(Integer.MIN_VALUE, numbers, (a, b) -> a < b ? b : a);
		int min1 = process(Integer.MAX_VALUE, numbers, (a, b) -> a > b ? b : a);
		

		System.out.println(""
				+ "sum1 = " + sum1
				+ "\nmax1 = " + max1
				+ "\nmin1 = " + min1);
		
		
		System.out.println("-------------------------Method Reference----------------------");
		
		int sum2 = process(0, numbers, Integer::sum);
//		int max2 = process(0, numbers, Ex04Reference_Static::max);
//		int max2 = process(Integer.MIN_VALUE, numbers, (a, b) -> a < b ? b : a);
		int max2 = process(Integer.MIN_VALUE, numbers, Integer::max);
//		int min2 = process(Integer.MAX_VALUE, numbers, (a, b) -> a > b ? b : a);
		int min2 = process(Integer.MAX_VALUE, numbers, Integer::min);

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
	
	
	
	private static int sum(int[] elements) {
		int sum = 0;
		for(int element: elements) {
			sum += element;
		}
		return sum;
	}
	
	private static int process(int initial, int[] elements, IntBinaryOperator operator) {
		int result = initial;
		for(int element : elements) {
			result = operator.applyAsInt(result, element);
		}
		return result;
	}
	
}
