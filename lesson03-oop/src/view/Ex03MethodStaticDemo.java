package view;

public class Ex03MethodStaticDemo {

 /*
  * 
  * static
  * 
  * Đặt ở đâu
  * 	+attribute
  * 		-Thuộc tính mang giá trị chung cho tất cả các đối tượng của class --> static
  * 			*Không phụ thuộc vào đối tượng đang gọi
  * 
  * 		-Thuộc tính mà mỗi đối tượng lưu trữ/ quản lý riêng 1 vùng nhớ   -->non static
  * 			*Phụ thuộc vào đối tượng đang gọi
  * 
  * 		+VD: Car: id, model(static)
  * 	+method
  * 		--> không phụ thuộc vào đối tượng đang gọi --> static
  * 		
  * 	    --> phụ thuộc vào đối tượng đang gọi --> non static
  * 
  * 	+class
  * 
  * 	non-static: Thuộc phạm vi của đối tượng
  * 			  : phải có đối tượng mới gọi được
  * 
  * 	static    : thuộc phạm vi của lớp (class)
  * 			  : nên gọi từ class --> class.
  * 			  : có thể lấy đối tượng gọi --> như bị warning
  */
	public static void main(String[] args) {
		int m= 6;
		int n =8;
		//Ex03MethodStaticDemo ms1 = new Ex03MethodStaticDemo();
		System.out.println("ms1-->"  +Ex03MethodStaticDemo.sum(m,n));
		Tuple tuple1 = new Tuple(3,2);
		System.out.println("tuple1 sum -->" + tuple1.sum());
		
		Tuple tuple2 = new Tuple(6,7);
		System.out.println("tuple2 sum -->" + tuple2.sum());
	}
	
	//Hàm sum chỉ phụ thuộc vào tham số truyền vào a, b
	// Không phụ thuộc vào đối tượng đang gọi -->static
	private static int sum(int a, int b) {
		return a + b;
	}
	// Bài toán tìm tổng 2 số
	// Biến hàm sum thành non-static method
	// Tạo ra class có 2 tham số --> qua class Tuple
}
