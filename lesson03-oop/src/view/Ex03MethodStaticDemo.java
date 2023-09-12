package view;

public class Ex03MethodStaticDemo {
	/*
	  [static]
	  
	  Đặt ở đâu:
	  	+ attribute:
	  	--> thuộc tính mang giá trị dùng chung cho tất cả đối tượng thuộc class --> static
	  		+ không phụ thuộc vào đối tượng đang gọi nó.
	  	--> thuộc tính mà mỗi đối tượng lưu trũ/quản lý riêng một vùng nhớ 		--> non static
	  		+ phụ thuộc vào đối tượng đang gọi nó.
	  		
	  	VD: Car: id, model(static)
	  	
	  	+ method:
	  	--> không phụ thuộc vào đối tượng đang gọi 	--> static
	  	
	  	--> phục thuộc vào đối tượng đang gọị		-->	non static
	  	
	  	+ class
	  	
	  	non-static	: thuộc pham vi của đối tượng
	  				: phải có đối tượng mới gọi đc.
	  				
	  	static		: thuộc phạm vi của class
	  				: có thể lấy đối tượng gọi --> warning
	 
	 */
	public static void main(String[] args) {
		
		int m = 6;
		int n = 8;
		
		Ex03MethodStaticDemo ms1 = new Ex03MethodStaticDemo();
		System.out.println(Ex03MethodStaticDemo.sum(m, n));
		
		Ex03MethodStaticDemo ms2 = new Ex03MethodStaticDemo();
		System.out.println(Ex03MethodStaticDemo.sum(m, n));
		
		Tuple a = new Tuple(3, 2);
		System.out.println(a.sum());
		
		Tuple b = new Tuple(6, 7);
		System.out.println(b.sum());
	}
	
	// hàm chỉ phụ thuộc vào tham số a và b mà không phụ thuộc vào đối tượng đang gọi --> static
	private static int sum(int a, int b) {
		return a + b;
	}
	
	// Bài toán tìm tổng 2 số
	// BIến hàm sum thành non static method
}
