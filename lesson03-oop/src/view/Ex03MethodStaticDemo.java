package view;

import bean.Tuple;

public class Ex03MethodStaticDemo {

	/*	
	 * [Static]
	 * 
	 * Đặt ở đâu
	 * 
	 * + attribute
	 * --> Thuộc tính mang giá trị dùng chung cho tất cả các đối tượng của class --> static
	 * Không phụ thuộc vào đối tường đang gọi nó
	 * 
	 * --> Thuộc tính mà mỗi đối tượng lưu trữ/quản lý riêng 1 vùng nhớ --> non static
	 * phụ thuộc vào đối tượng đang gọi
	 * 
	 * + method
	 * --> Không phụ thuộc vào đối tượng đang gọi --> static
	 * --> phụ thuộc vào đối tượng đang gọi --> non static
	 * 
	 * + class
	 * 
	 * 
	 * non static: thuộc phạm vi của đối tượng
	 *             phải có đối tượng mới gọi được
	 *             
	 * static: thuộc phạm vi của class
	 * 		 : nên gọi từ class --> class.
	 * 		 : có thể lấy đội tượng gọi nhưng waring
	 */
	
	public static void main(String[] args) {
		int m = 6, n = 8;
		System.out.println("sum: " + Ex03MethodStaticDemo.sum(m, n));
		
		Tuple tuple = new Tuple(2, 3);
		System.out.println("sum: " + tuple.sum());
		
		Tuple tuple2 = new Tuple(6, 7);
		System.out.println("sum: " + tuple2.sum());
	}
	
	private static int sum(int a, int b) {
		return a + b;
	}
}
