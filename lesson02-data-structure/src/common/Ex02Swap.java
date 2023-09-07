package common;

public class Ex02Swap {
	public static void main(String[] args) {
		
		int x1 = 2;
		int x2 = 8;
		 
		swapInt(x1, x2);
		
		System.out.println("x1 --> " + x1);
		System.out.println("x2 --> " + x2);
		
		System.out.println("\n=========\n");
		
		Integer xo1 = 17;
		Integer xo2 = 91;
		
		swapInteger(xo1, xo2);
		
		System.out.println("xo1 --> " + xo1);
		System.out.println("xo2 --> " + xo2);
		
		//về nhà
		//viết hàm swap 2 biến lưu trữ số nguyên
		//gợi ý : CustomInteger(int value)
		
	}
	private static void swapInt(int a, int b) {
		int temp = a;
		a=b;
		b=temp;
	}
	
	private static void swapInteger(Integer a, Integer b) {
		Integer temp = a; 
		a = b;
		b = temp;
	}

}
