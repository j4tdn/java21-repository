package view.string.immutable;



public class Ex02StringCompare {
	public static void main(String[] args) {
		
	
	// So sánh lớn bé ---> compareTo, vì String implements Comparable<?>
	String s1 = "hello";
	String s2 ="keen";
	String s3 ="hello";
	String s4 = new String("hello");
	System.out.println("s11 compareTo--->"+s1.compareTo(s2));
	
	//so sánh bằng ---> equals, từ class object, so sánh địa chỉ
	Ex02StringCompare o1 = new Ex02StringCompare();
	Ex02StringCompare o2 = new Ex02StringCompare();
	System.out.println("\no1 equals o2 -->"+ o1.equals(o2));
	System.out.println("\ns1 equals 42 -->"+ s1.equals(s4));
	
	
	
	
	
}
}