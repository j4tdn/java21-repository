package datastructure.object.available;

public class SwapInteger {
	public static void main(String[] args) {
		IntegerWrapper a = new IntegerWrapper(1);
		IntegerWrapper b = new IntegerWrapper(2);
		swap(a,b);
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void swap(IntegerWrapper a, IntegerWrapper b) {
		Integer temp = a.vl;
		a.vl = b.vl;
		b.vl = temp;
		
	}
}
