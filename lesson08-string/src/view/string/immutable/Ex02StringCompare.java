package view.string.immutable;

public class Ex02StringCompare {
	public static void main(String[] args) {
		// So sánh lớn, bé --> compareTo, vì String implements Compare<T>
		String s1 = "hello";
		String s2 = "a";
		String s3 = "hello";
		String s4 = new String("hello");
		System.out.println("s1 compareTo s2 --> " + s1.compareTo(s2));
		
		// So sánh bằng --> equals
		Ex02StringCompare o1 = new Ex02StringCompare();
		Ex02StringCompare o2 = new Ex02StringCompare();
		
		System.out.println("\no1 compareTo o2 --> " + o1.equals(o2));
		System.out.println("\ns1 compareTo s3 --> " + s1.equals(s3));
		System.out.println("\ns1 compareTo s4 --> " + s1.equals(s4));
	}
}
