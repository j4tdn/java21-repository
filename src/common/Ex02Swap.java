package common;

public class Ex02Swap {
	public static void main(String[] args) {
		CustomInteger a = new CustomInteger(10);
		CustomInteger b = new CustomInteger(20);
		
		swapCustomInteger(a, b);
		System.out.println("a: " + a + " b: " + b);
	}
	private static void swapCustomInteger(CustomInteger n, CustomInteger k) {
		int temp = n.value;
		
		n.value = k.value;
		k.value = temp;
	}
}
