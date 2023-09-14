package view;

import bean.Tuple;

public class Ex03MethodStaticDemo {

	/*
	 
	 [static] vs [non static]
	 
	 Đặt ở đâu:
	 + attribute
	 	--> thuộc tính mang giá trị dùng chung cho tất cả các đối tượng của class --> static
	 		*không phụ thuộc vào đối tượng đang gọi
	 	--> thuộc tính mà mỗi đối tượng lưu trữ/quản lý riêng một vùng nhớ 	   	  --> non static	 
	 		*phụ thuộc vào đối tượng đang gọi 
	 		
	 	VD: Car: id, model(static)
	 	
	 + method
	 	--> không phụ thuộc vào đối tượng đang gọi --> static
	 	
	 	--> phụ thuộc vào đối tượng đang gọi 	   --> non static
	 
	 + class
	 
	 
	 
	 non static : thuộc phạm vi của đối tượng 
	  			: phải có đối tượng mới gọi được
	  			
	 static		: thuộc phạm vi của lớp(class)
	 			: nên gọi từ class --> class.
	 			: có thể lấy đối tượng gọi --> warning
	 			
	 */
	public static void main(String[] args) {
		int m = 6;
		int n = 8;
		
		//Ex03MethodStaticDemo ms1 = new Ex03MethodStaticDemo();
		System.out.println("ms1 --> " + Ex03MethodStaticDemo.sum(m, n));
		
		//Ex03MethodStaticDemo ms2 = new Ex03MethodStaticDemo();
		System.out.println("ms2 --> " + Ex03MethodStaticDemo.sum(m, n));
		
		System.out.println("=================");
		
		Tuple tuple1 = new Tuple(3, 2);
		System.out.println("tuple1 sum --> " + tuple1.sum());
		
		Tuple tuple2 = new Tuple(6, 7);
		System.out.println("tuple2 sum --> " + tuple2.sum());
	}
	
	// hàm sum chỉ phụ thuộc vào tham số truyền vào a và b
	// không phụ thuộc vào đối tượng đang gọi --> static 
	private static int sum(int a, int b) {
		return a + b;
	}
	//bài toán tìm tổng 2 số 
	//biến hàm sum thành non-static method
	
}
