package view;

import bean.Tuple;

public class Ex03MethodStaticDemo {
	
	/*
	 [static] Đặt ở đâu
	 
	 + attribute 
	 	-> thuộc tính mang giá trị dùng chung cho tất cả các đối tg của class --> static
	 		(không phụ thuộc vào đối tg đang gọi )
	 		
	 	-> thuộc tính mà mỗi đối tg lưu trữ/ quản lý riêng 1 vùng nhớ 		  --> non static
	 		(phụ thuộc vào đối tg đang gọi)
	 	
	 + method
	 	-> không phụ thuộc vào đối tg đang gọi --> static
	 	-> phụ thuộc vào đối tg đang gọi    	--> non static
	 + class 
	 non-static : thuộc phạm vi của đối tg
	 			: phải có đối tg mới gọi đc
	 static		: thuộc phạm vi của lớp( class)
	  			: nên gọi từ class --> class.
	  			: có thể lấy đối tg gọi( có thể bị warning)
	 */

		public static void main(String[] args) {
			int m = 6;
			int n = 8;
		// Ex03MethodStaticDemo ms1 = new Ex03MethodStaticDemo();	
			System.out.println("ms1 --> " + Ex03MethodStaticDemo.sum(m, n));
			
		// Ex03MethodStaticDemo ms1 = new Ex03MethodStaticDemo();	
			System.out.println("ms2 --> " + Ex03MethodStaticDemo.sum(m, n));
			
			System.out.println("\n============================\n");
			
			Tuple tuple1 = new Tuple(3, 2);
			System.out.println("tuple1 sum -->: " + tuple1.sum());
			
			Tuple tuple2 = new Tuple(6, 7);
			System.out.println("tuple2 sum -->: " + tuple2.sum());
		}
		
		// Hàm sum chỉ phụ thuộc vào tham số truyền vào a,b
		// Không phụ thuộc vào đối tg đang gọi --> static
		private static int sum (int a, int b) {
			return a+b;
		}
}
