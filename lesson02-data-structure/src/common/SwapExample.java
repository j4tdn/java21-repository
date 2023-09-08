package common;

public class SwapExample {
	
	public static void main(String[] args) {
		CustomInteger a = new CustomInteger(5);
		CustomInteger b = new CustomInteger(10);
		
		System.out.println("Trước khi swap: ");
		System.out.println("a = " + a.getNumber());
		System.out.println("b = " + b.getNumber());
		
		swap(a, b);
		
		System.out.println("Sau khi swap: ");
		System.out.println("a = " + a.getNumber());
		System.out.println("b = " + b.getNumber());
	}
	
	public static void swap(CustomInteger x, CustomInteger y) {
		int temp = x.getNumber();
		x.setNumber(y.getNumber());
		y.setNumber(temp);
	}
}
