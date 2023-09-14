package comon;

public class Ex03Jdk_5Boxing {
	public static void main(String[] args) {
		//với những kiểu dữ liệu có sẵn (Nguyên thủy và đối tương) của JAVA
		//int Integer: int
		//float Float: float
		//long Long: long
		//int có thể nhận giá trị từ Integer --> không cần ép kiểu
		//Integer có thể nhận giá trị từ int --> không cần ép kiểu
		
		// Từ V1.0 đến V1.4
		// Chưa xuất hiện khái niệm auto - boxing, auto - unboxing
		
		// Từ V1.5
		// Xuất hiện khái niệm 
		//auto - boxing --> java sẽ tự động convert kiểu nguyên thủy sang kiểu đối tượng tương ứng
		// -- int (Integer) , long (Long);
		
		// auto - unboxing --> Java sẽ tự động convert kiểu đối tượng sang kiểu nguyên thủy tương ứng
		 int x1 = 2;
		 int x2 = 8;
		 Integer xo1 = new Integer(17);
		 Integer xo2 = new Integer(91);
			// cẩn thận khi unboxing (đối tượng sang nguyên thủy)
			// đối tượng (null, value)
			// nguyên thủy (value)
		 
		 
		 
	}
	private static void swapInt(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}
}
