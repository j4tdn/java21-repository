package common;

public class Ex02Swap {
	public static void main(String[] args) {
		
		int x1 = 2;
		int x2 = 8;
		swap(x1, x2);
		
		System.out.println("x1 ---> " + x1);
		System.out.println("x2 ---> " + x2);
		
		Integer xo1 = 17;
		Integer xo2 = 91;
		swapInteger(xo1, xo2);
		System.out.println("xo1 ---> " + xo1);
		System.out.println("xo2 ---> " + xo2);

		CustomInteger ci1 = new CustomInteger(26);
		CustomInteger ci2 = new CustomInteger(84);
		
		swapCustomInteger(ci1, ci2);
		
		System.out.println("ci1 --> " + ci1);
		System.out.println("ci2 --> " + ci2);



	}
	
	private static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}
	
	private static void swapInteger(Integer a, Integer b) {
		Integer temp = a;
		a = b;
		b = temp;
	}
	
	// CustomInteer a = ci1 // H1
	// CustomInteger b = ci2 // H2
	private static void swapCustomInteger(CustomInteger a, CustomInteger b) {
		Integer temp = a.value;
		a.value = b.value;
		b.value = temp;
		

	}
}
