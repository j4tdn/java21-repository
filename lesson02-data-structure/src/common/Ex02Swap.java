package common;

public class Ex02Swap {
	public static void main(String[] args) {
		
		int x1 = 2;
		int x2 = 8;
		swapInteger(x1, x2);
		
		//block scope
		
		CustomerInteger ci1 = new CustomerInteger(26);
		CustomerInteger ci2 = new CustomerInteger(84);
		
		swapCustomInteger(ci1, ci2);
		
		System.out.println("ci1 -->" + ci1);
		System.out.println("ci2 -->" + ci2);
		
		
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
	
	private static void swapCustomInteger(CustomerInteger a, CustomerInteger b) {
		Integer temp = a.value;
		a.value = b.value;
		b.value = temp;
	}
	
	
}
