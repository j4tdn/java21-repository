package view.string.imutable;

import javax.swing.table.TableStringConverter;

public class Ex02StringCompare {
	public static void main(String[] args) {
		
		//So sánh lớn pé --> compareTo, vì String implements Comparable
		
		String s1 = "hello";
		String s2 = "keen";
		String s3 = "hello";
		String s4 = new String("hello");
		
		System.out.println("s1 compare to s2 --> " + s1.compareTo(s2));
		
		// So sánh bằng --> equals, từ class Object
		
		// Object#equals: so sánh địa chỉ stack
		// String#equals: so sánh địa chỉ ở heap
		
		Ex02StringCompare o1 = new Ex02StringCompare();
		Ex02StringCompare o2 = new Ex02StringCompare();
		
		System.out.println("\no1 equals o2 --> " + o1.equals(o2));
		
		System.out.println("\no1 equals a3 --> " + o1.equals(s3));
		
		System.out.println("\no1 equals s4 --> " + o1.equals(s4));
	}
}
