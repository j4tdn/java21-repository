package common;

import datastructure.object.custom.Item;

// Java --> block scope 

public class Ex04VariableScope {
	
	// phạm vi trong class Ex04VariableScope
	// được dùng ở bất kì hàm nào trong class Ex04VariableScope
	// biến toàn cục = global variable
	// thuộc tính = attribute
	
	public static void main(String[] args) {
		// phạm vi trong hàm main
		
		int a = 99;
		String b = "welcome";
		Item item = new Item(1, 'A', 11d);
		
		System.out.println("a local var -->" + a);
		// System.out.println("a global var -->" + Ex04VariableScope.a);

		// priority: local > global	  
		
	}
	
	public static void testScope() {
		// phạm vi trong hàm testScope
		int a = 10;
		String b = "hello";
	}
}
