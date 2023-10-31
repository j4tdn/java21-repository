package view.string.immutable;

public class Ex02StringCompare {
	public static void main(String[] args) {
		
		// So sánh, lớn bé --> compareTo, vì String Implements Compareable <?>
		
		String s1 = "hello"; //h1
		String s2 = "z"; //h2
		String s3 = "hello"; //h1
		String s4 = new String("hello"); //h3
		
		System.out.println(" s1 compareTo s2 -->" +s1.compareTo(s2)); //so sánh từ h -> z -18 khoảng cách
		
		//So sánh bằng --> equals, từ class Object
		
		//Object#equals: so sánh == --> so sánh địa chỉ ở stack
		//String#equals: so sánh giá trị của String ở HEAP
		
		Ex02StringCompare o1 = new Ex02StringCompare();
		Ex02StringCompare o2 = new Ex02StringCompare();
		System.out.println("o1 equals o2 --> " + o1.equals(o2));  //false
		
		System.out.println("s1 equals s3 --> " +s1.equals(s3)); //true
		
		System.out.println("s1 equals s4 --> " +s1.equals(s4)); //true
	}
}
