package view;

import java.util.function.IntBinaryOperator;

public class Ex04MethodReference_Static {

	public static void main(String[] args) {
		/*
		 1. Implementation class
		 2. Anonymus class
		 3. Anonymus function
		 4. Method reference
		    --> static method reference
		    Có thể chuyển 1 lamda bất kỳ sang static method reference
		    
		    + Nên dùng khi
		    	- Lambda có dạng giống với 1 static method đã tồn tại trong dự án JAVA or Custom
		    	- Lambda có body dài và sử dụng được gọi nhiều chổ
		    
		    --> non-static method reference
		 	
		 	
		 bai tap : cho danh sach cac s nguyen viet chuong trinh
		 	+ tim tong cac phan tu trong danh sach cua cac phan tu trong mang
		 	+ tim gia tri lon nhat cua cac phan tu trong mang
		 	+ tim gia tri nho nhat cua cac phan tu trong mang
		*/
		int[] numbers = {1,2,4,2,6,4};
		int sum = process(0, numbers, Ex04MethodReference_Static::sum );
		
		int max = process(Integer.MIN_VALUE , numbers, Ex04MethodReference_Static::max);
		//or
		int max2 = process(Integer.MIN_VALUE, numbers, Integer::max);
		
		int min = process(Integer.MAX_VALUE , numbers, Ex04MethodReference_Static::min);
		//or
		int min2 = process(Integer.MAX_VALUE, numbers, Integer::min);
		System.out.println("sum: " +sum);
		System.out.println("max: " +max);
		System.out.println("max2: " +max2);
		System.out.println("min: " +min);
		System.out.println("min2: " +min2);
	
		
	}
	
	private static int process(int initial ,int[] elements , IntBinaryOperator operator) {
		int result = initial;
		for(int element: elements) {
			result = operator.applyAsInt(result, element);
		}
		return result;
	}
	
	private static int sum(int x, int y) {
		return x+y;
	}
	
	private static int max(int a, int b) {
		return a<b?b:a;
	}
	
	private static int min(int a, int b) {
		return a>b?b:a;
	}
	
}
