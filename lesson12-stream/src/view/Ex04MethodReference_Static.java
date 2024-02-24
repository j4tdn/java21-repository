package view;

import java.util.function.IntBinaryOperator;

public class Ex04MethodReference_Static {

	public static void main(String[] args) {
		int [] numbers = {1, 2, 3 ,4 ,5 ,6 ,7};
		
		
		/*
		 * 1. Implementation class 
		 * 2. Annoymous class 
		 * 3. Annoyous function (lambda)
		 * 4. Method Reference
		 * 	 --> static method reference
		 *   --> non - static method reference
		 *   
		 *   Nên dùng khi
		 *   	+Lambda có dạng giống 1 static method đã tồn tại trong dự án (java + Custom)
		 *   	+Lambda nody dài và sử dụng được ở nhiều chổ
		 *   
		 *   Bài tập: Cho 1 danh sách các số nguyên. Viết chương trình
		 *   + Tìm tổng các phần tử trong danh sách
		 *   + Tìm giá trị lớn nhất của các phần tử trong mảng
		 *   + TÌm giá trị nhỏ nhất của các phần tử trong mảng
		 *   
		 */
		int sum1 = process(0, numbers, (a,b) -> a+b);
		int max1 = process(Integer.MIN_VALUE, numbers, (a, b) -> a < b ? b: a);
		int min1 = process(Integer.MAX_VALUE, numbers, (a, b) -> a > b ? b: a);
		
		System.out.println(""
				+ "Sum1 =" +sum1
				+ "\nmax1 =" +max1
				+ "\nmin1 =" +min1);
		
		
		System.out.println(" --------- Method Refernce-----------");
		
		int sum2 = process(0, numbers, Integer::sum);   // sử dụng hàm sung có sẵn trong java
		int sum3 = process(0, numbers, Ex04MethodReference_Static::sum); // sử dụng hàm sum tự viết
		int max2 = process(Integer.MIN_VALUE, numbers, Integer::max);
		int min2 = process(Integer.MAX_VALUE, numbers, Integer::min);
		
		// có thể dùng ở class khác nếu public
		
		System.out.println(""
				+ "sum2 =" +sum2
				+ "\nsum3 =" +sum3
				+ "\nmax2 =" +max2
				+ "\nmin2 =" +min2);
	}
	
	//Function <T,R>
	//BiFunction<T, U, R>
	//BInaryOperator<T> extends BiFunction <T, T, T>
	
	private static int process(int intial, int [] elements , IntBinaryOperator operator ) {
		int result = intial;
		for (int element: elements) {
			result = operator.applyAsInt(result, element);
		}
		return result;
	}
	private static int sum (int a, int b) {
		return  a + b;
	}
}
