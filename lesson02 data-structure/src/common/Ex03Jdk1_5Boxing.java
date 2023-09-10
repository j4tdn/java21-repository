package common;

public class Ex03Jdk1_5Boxing {
	
	public static void main(String[] args) {
		

		// với những kiểu dữ liệu có sẵn (nguyên thủy và đối tượng) của JAVA
		// int Integer: int
		// float Float: float
		// long Long: long
		
		// int có thể nhận giá trị từ Integer --> không cần ép kiểu
		// Integer có thể nhận giá trị từ int --> không cần ép kiểu
		
		// từ v1.0 đến v1.4 
		// chưa xuất hiện khái niệm auto boxing hay auto unboxing
		
		// Từ v1.5
		// xuất hiện khái niệm 
		// auto boxing --> JAVA sẽ tự động convert từ kiểu nguyên thủy sang kiểu đối tượng tương ứng
		// --> int(Integer), long(Long)
		
		// auto unboxing --> JAVA sẽ tự động convert từ kiểu đối tượng sang kiểu nguyên thủy tương ứng
		
		int x1 = 2;
		int x2 = 8;
		
		Integer i1 = x1;
		
		Integer xo1 = new Integer(17);
		Integer xo2 = new Integer(91);
		
		x1 = xo1;
		xo2 = x2;
		
		// swapInt(x1, x2);
		
		System.out.println("\n==================\n");
		
		// swapInteger(xo1, xo2);
		// cẩn thận khi unboxing (đối tượng sang nguyên thủy)
				// đt (null, value)
				// ngthuy (value)
		Integer a = null;
		int b = a; // a.intvalue()
		System.out.println("b --> " + b);
	}
	private static void swapInt( int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}
	
	private static void swapInteger(Integer a, Integer b) {
		Integer temp = a;
		a = b;
		b = temp;
	}
}
