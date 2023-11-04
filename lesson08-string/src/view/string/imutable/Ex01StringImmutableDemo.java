package view.string.imutable;

import java.awt.FocusTraversalPolicy;

public class Ex01StringImmutableDemo {
	public static void main(String[] args) {
		
		// class, data type --> string
		
		// String literal --> gán trực tiếp giá trị cho chuỗi
		
		String s1 = "welcome";
		String s2 = "welcome";
		String s3 = "hello";
		
		System.out.println("s1 hash: " + System.identityHashCode(s1) + ", value: " + s1);
		System.out.println("s2 hash: " + System.identityHashCode(s2) + ", value: " + s2);
		System.out.println("s3 hash: " + System.identityHashCode(s3) + ", value: " + s3);
		
		s3 = "bye";
		String s4  = "hello";
		
		System.out.println("s3 hash: " + System.identityHashCode(s3) + ", value: " + s3);
		System.out.println("s4 hash: " + System.identityHashCode(s4) + ", value: " + s4);
				
		
		
		
		// deamon thread --> clean unused memory
		
		// khi nào cộng nhiều chuỗi, k nên sử dụng String(immutable)
		// Nhiều >3 
		
		String[] ss = {s1, s2, s3, s4};
		String result = "";
		
		for (String s: ss) {
			result = result + s;
			System.out.println("result hash: " + System.identityHashCode(result)+ ", value: " + result);
		}
		
		// String Object --> thông qua toán tử new
		
		
		
		
	}
}
