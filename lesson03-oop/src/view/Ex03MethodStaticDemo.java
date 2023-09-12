package view;

import bean.Tuple;

public class Ex03MethodStaticDemo {
	/*
	 * [Static]
	 * Đặt ở đâu :
	 *  +) attribute
	 *    --> Thuộc tính dùng chung cho tất cả các đối tượng của class -->static
	 *    	Không phụ thuộc vào đối tượng đang gọi
	 *    --> Thuộc tính mà mỗi giá trị đối tượng lưu trữ/quản lý riêng vùng nhớ --> non static
	 *      Phụ thuộc vào đối tượng đang gọi
	 *    VD: Car: id(model)
	 *   
	 *  +) method:
	 *   --> Tạo ra static method khi không phụ thuộc vào đối tượng đang gọi  --> static
	 *   
	 *   --> Không phụ thuộc vào đối tượng đang gọi --> non static
	 *  
	 *  +) class:
	 *    -->non static: thuộc phạm vi của đối tượng, phải có đối tượng mới gọi được
	 *    -->static: thuộc phạm vi của lớp(class)
	 *               nên gọi từ class -- class.
	 *               có thể lấy đôi tượng gọi --> warning
	 *   
	 */
	public static void main(String[] args) {
		int a =2, b = 8;
		
		System.out.println("Sum: " + (sumStatic(a, b)));
		
		
		// Dưới đây là vd class non-static
		// Hàm xử lý phụ thuộc vào đối tượng đang gọi
		Tuple tuple1 = new Tuple(3, 2);
		System.out.println("Tuple1 of sum : " + tuple1.sum());
		
		Tuple tuple2 = new Tuple(5, 2);
		System.out.println("Tuple1 of sum : " + tuple2.sum());
		
		
	}
	private static int sumStatic(int a, int b ) {
		return a + b;
	}
}
