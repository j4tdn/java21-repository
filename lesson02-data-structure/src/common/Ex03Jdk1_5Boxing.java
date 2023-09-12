package common;

public class Ex03Jdk1_5Boxing {
	public static void main(String[] args) {
		
		int x1 = 2;
		int x2 = 8;
		swapInteger(x1, x2);
		
		// int có thể nhận giá trị từ Integer --> k cần ép kiểu
		// Integer có thể nhận giá trị từ int --> k cần ép kiểu
		
		// Từ v1.0 đến v1.4
		// Chưa xuất hiện khái niệm auto-boxing, auto-unboxing
		
		// Từ v1.5 trở đi
		// Xuất hiện khái niệm
		
		// auto-boxing --> Java sẽ tự động convert kiểu nguyên thủy sang kiểu đối tượng tương ứng
		// 
	}
	
	private static void swapInteger(Integer a, Integer b) {
		Integer temp = a;
		a = b;
		b = temp;
	}
}
