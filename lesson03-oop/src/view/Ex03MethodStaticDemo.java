package view;

import bean.Tuple;

public class Ex03MethodStaticDemo {
	/*
	 [static]
	 
	 Đặt ở đâu
	 + attribute
	  --> thuộc tính mang giá trị dùng chung cho tất cả các đối tượng của class --> static
	     * Không phụ thuộc vào đối tượng đang gọi
	     * 
	  --> thuộc tính mà mỗi đối tượng lưu trữ/ quản lý riêng một vùng nhớ       --> non static

	     * phụ thuộc vào đối tượng đang gọi
	      
	       
	     
	  	 VD: Car: id, model(static)
	  	 
	  	 
	 + method
	   --> tạo ra static method khi không phụ thuộc vào đối tượng đang gọi --> static
	   
	   --> phụ thuộc vào đối tượng đang gọi thì dùng --> non static 
	 
	 
	 + class 
	 
	 
	 non-static: thuộc phạm vi của đối tượng
	           : phải có đối tượng mới gọi được 
	           
	 static : thuộc phạm vi của lớp(class) 
	        : nên gọi từ class --> class.
	        : có thể lấy đối tượng gọi --> warning
	 */
	
	public static void main(String[] args) {
		int m = 6;
		int n = 8;
		
//		Ex03MethodStaticDemo ms1 = new Ex03MethodStaticDemo();
//		System.out.println("ms1 --> " + ms1.sum(m, n));
	System.out.println("ms1 --> " + Ex03MethodStaticDemo.sum(m, n));
		
//		Ex03MethodStaticDemo ms2 = new Ex03MethodStaticDemo();
//		System.out.println("ms2 --> " + ms2.sum(m, n));
	
	System.out.println("=======================================");
	
	Tuple tuple1 = new Tuple(3, 2);
	System.out.println("Tuple 1 --> " + tuple1.sum());
	
	
	Tuple tuple2 = new Tuple(6, 7);
	System.out.println("Tuple 2 --> " + tuple2.sum()) ;
	}
	
	private static int sum(int a, int b) {
		return a + b;
	}
	
	// Bài toán tìm tổng 2 số
	// Biến hàm sum thành non-static method 
	
	
	
}
