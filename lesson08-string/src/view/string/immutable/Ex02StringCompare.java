package view.string.immutable;

public class Ex02StringCompare {
	
	public static void main(String[] args) {
		
		// So sánh lớn, bé --> compareTo, vì String implements Comparable<?>
		
		String s1 = "hello";
		String s2 = "keen";
		String s3 = "hello";
		String s4 = new String("hello");
		
		System.out.println("s1 compare s2 --> " + s1.compareTo(s2));
		
		// So sánh bằng --> equals, từ class Object
		
		// Object#equals: so sánh == --> so sánh địa chỉ (stack)
		// String#equals: so sánh giá trị của String 
		
		Ex02StringCompare o1 = new Ex02StringCompare();
		Ex02StringCompare o2 = new Ex02StringCompare();
		System.out.println("\no1 equals o2 --> " + o1.equals(o2));
		
		System.out.println("\ns1 equals s3 --> " + s1.equals(s3));
		
		System.out.println("\ns1 equals s4 --> " + s1.equals(s4));
	}
}
