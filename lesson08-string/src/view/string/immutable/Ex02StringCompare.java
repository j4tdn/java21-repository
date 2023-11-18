package view.string.immutable;

public class Ex02StringCompare {

	
	public static void main(String[] args) {
		// so sánh lớn bé --> compareTo vì String implements Comparable<?>
		
		String s1 = "hello";
		String s2 = "keen";
		String s3 = "hello";
		String s4 = new String("hello");
			
		System.out.println("s1 compareTo s2 --> " + s1.compareTo(s2));
		
		// so sánh bằng --> equals, từ class Object
		
		
		Ex02StringCompare o1 = new Ex02StringCompare();
		Ex02StringCompare o2 = new Ex02StringCompare();
		
		// 1:26 coi lại
		
		System.out.println("\no1 equals to o2: " + s1.equals(o2));
		System.out.println("\ns1 equals to s3: " + s1.equals(s3));
		System.out.println("\ns1 equals to s4: " + s1.equals(s4));
		
		
	}
}
