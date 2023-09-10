package common;

public class Ex03Jdk1_5Boxing {

	public static void main(String[] args) {
		
		// Với những KDL có sẵn(nguyên thủy và đối tượng) của Java
		// int Integer: int
		// float Float: float
		
		// int có thể nhận giá trị từ Integer --> ko cần ép kiểu
		// Integer có thể nhận giá trị từ int --> ko cần ép kiểu
		
		// từ V1.0 đến V1.4
		// chưa xuất hiện khái niệm auto-boxing,auto-unboxing
		
		// từ V1.5
		// xuất hiện khái niệm
		
		// auto-boxing --> Java sẽ tự động convert kiểu nguyên thủy sang kiểu đối tượng tương ứng
		// --> int(Integer), long(Long)
		
		// auto-unboxing -->  Java sẽ tự động convert kiểu đối thượn sang kiểu nguyên thủy tương ứng
		int x1 = 2;
		int x2 = 8;
		
		Integer xo1 = new Integer(17);
		Integer xo2 = new Integer(91);
		
		swapInt(x1, x2);
		
		System.out.println("x1 --› " + x1);
		System.out.println("x2 --> " + x2);
		
		System.out.println("\n==============================\n");
		
		
		
		swapInteger(xo1, xo2);

		
	}

}
