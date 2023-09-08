package common;

public class Ex03Jdk1_5Boxing {

	public static void main(String[] args) {
		
		// Với những kiểu dữ liệu có sẵn(nguyên thuỷ và đối tượng) của java
		// int Integer: int
		// float Float: float
		// long Long: long
		
		// int có thể nhận giá trị từ Integer  --> ko cần ép kiểu
		// Integer có thê nhận giá trị từ int  --> ko cần ép kiểu
		
		// từ V1.0 đến V1.4
		// chưa xuất hiện khái niêm auto-boxing, auto-unboxing
		
		// từ V1.5
		// xuất hiện khái niệm
		
		//auto-boxing --> java sẽ tự động convert kiểu nguyên thuỷ sang kiểu đối tượng tương ứng
		// --> int(Integer), long(Long)
		
		//auto-unboxing --> java sẽ tự động convert kiểu đối tượng sang kiểu nguyên thuỷ tương ứng
		
		int x1 = 2;
		int x2 = 8;
		
		Integer xo1 = new Integer(17);
		Integer xo2 = new Integer(91);
		
		x1 = xo1;
		xo2 = x2;
		
		//swapInt(xo1, xo2);
		
		System.out.println("\n======\n");
			
		//swapInteger(xo1, xo2);
		
		// cẩn thận khi unboxing(đối tượng sang nguyên thuỷ)
		// đt(null, value)
		// nt(value)
		
		Integer a = null;
		int b = a; // a.intValue()
		System.out.println("b --> " + b);
	}
	
	private static void swapInt(int a, int b) {
		
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
