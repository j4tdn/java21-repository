package view;

import bean.Tuple;

public class Ex03MethodStaticDemo {

	/*
	 
	 [static] vs [non static]
	 
	 Đặt ở đâu
	 + attribute
	   --> thuộc tính mang giá trị dùng chung cho tất cả các đối tượng của class --> static
	       * không phụ thuộc vào đối tượng đang gọi nó
	   --> thuộc tính mà mỗi đối tượng lưu trữ/ quản lí riêng một vùng nhớ       --> non static
	       * phụ thuộc vào đối tượng đang gọi
	
	   VD : Car: id, model(static)
	 
	  + method
	    --> không phụ thuộc vào đối tượng đang gọi --> static
	    
	    --> phụ thuộc vào đối tượng đang gọi --> non static
	 
	 + class
	 
	 non-static: thuộc phạm vi của đối tượng
	           : phải có đối tượng mới gọi được
	          
	 static    : thuộc phạm vi của (lớp)class
	           : nên gọi từ class --> class.
	           : có thể lấy đối tượng gọi --> warning
	 */
	
	public static void main(String[] args) {
		int m = 6;
		int n = 6;
		
		System.out.println(Ex03MethodStaticDemo.sum(m, n));
		
		System.out.println();
		
		Tuple tp1 = new Tuple(3, 2);
		System.out.println("tp1 --> " + tp1.sum());
		
		Tuple tp2 = new Tuple(6, 7);
		System.out.println("tp2 --> " + tp2.sum());
	}
	
	// Hàm sum chỉ phụ thuộc vào tham số truyền vào a, b
	// Không phụ thuộc vào đối tượng đang gọi --> static
	private static int sum(int a, int b) {
		return a + b;
	}
	
	// Bài toán tìm tổng 2 số
	// Biến hàm sum thành non-static method
}
