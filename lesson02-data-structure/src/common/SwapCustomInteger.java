package common;

public class SwapCustomInteger {
	public static void main(String[] args) {
		CustomInteger it1 = new CustomInteger(12);//H1
		CustomInteger it2 = new CustomInteger(24);//H2
		
		Swap(it1, it2);
		
		System.out.println("it1 --> " + it1);
		System.out.println("it2 --> " + it2);
	}
	private static void Swap(CustomInteger a, CustomInteger b) {
		int temp = a.it;//H1	
		a.it = b.it;//H2		
		b.it = temp;//H1		
	}

}
