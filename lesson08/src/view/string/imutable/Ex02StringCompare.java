package view.string.imutable;

public class Ex02StringCompare {
	public static void main(String[] args) {
		
		//so sánh lớn bé --> compareT, vì String implements Comparable<?>
		
		String s1 ="hello"; //H1
		String s2 ="keen"; //H2
		String s3 ="hello"; //H1
		String s4 = new String("hello");
		
		System.out.println("s1 compareTo s2 --> " + s1.compareTo(s2));
	
		//so sánh bằng --> equal, từ class Object
		
		Ex02StringCompare o1 = new Ex02StringCompare();
		Ex02StringCompare o2 = new Ex02StringCompare();
	
	System.out.println("o1 equal o2: " + o1.equals(o2));
	System.out.println("s1 compareTo s3 --> " + s1.equals(s3)); // true
	System.out.println("s1 compareTo s4 --> " + s1.equals(s4)); // true
	
	}
}
