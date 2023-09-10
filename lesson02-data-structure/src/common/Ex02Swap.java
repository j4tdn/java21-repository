package common;

public class Ex02Swap {
	public static void main(String[] args) {
    // boxing, unboxing, autoboxing
		int x1 = 2;
		int x2 = 8;
		
		swapInt(x1, x2);
		
		System.out.println("x1 --› " + x1);
		System.out.println("x2 --> " + x2);
		
		System.out.println("\n==============================\n");
		
		Integer xo1 = 17;
		Integer xo2 = 91;
		
		swapInteger(xo1, xo2);

		System.out.println("xo1 --› " + xo1);
		System.out.println("xo2 --> " + xo2);
		
		// về nhà
		// viết hàm swap 2 biến lưu trữ số nguyên
		// gợi ý: sử dụng CustomInteger(int value)
		
		// block scope
		CustomInteger ci1 = new CustomInteger(26);
		CustomInteger ci2 = new CustomInteger(84);
		
		swapCustomInteger(ci1, ci2);
		
		System.out.println("ci1 --› " + ci1);
		System.out.println("ci2 --> " + ci2);
		
	}
	
	// Java passes by value at STACK
	
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
	
	// CustomInteger a = ci1;
	// CustomInteger b = ci2;
	
	private static void swapCustomInteger(CustomInteger a, CustomInteger b) {
		int temp = a.value;
        a.value = b.value;
        b.value = temp;
	}
}