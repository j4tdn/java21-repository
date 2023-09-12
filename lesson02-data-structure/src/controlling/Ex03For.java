package controlling;

import java.util.Iterator;

public class Ex03For {
	public static void main(String[] args) {
		
		// In ra các số nguyên nhỏ hơn 10
		
		for (int i = 0; i < 10; i++) {
			System.out.println("i -->" + i);
		}
		
		System.out.println("==============");
		
		int i = 0;
		for (; i < 10; ) {
			System.out.println("i -->" + i);
			i++;
		}
	}
}
