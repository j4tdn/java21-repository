package common;

import datastructure.object.custom.Item;

//Java --> block scope

// Java --> class
// + KDL đối tượng --> attribute, constructor, toString
// + Code demo --> main + #methods
public class Ex04VariableScope {
	
	// cú pháp khai báo biến
	// attribute     : [access modifier] [static] [final] return_type var_name [= value];
	// local variable:                            [final] return_type var_name [= value];
	
	// phạm vi dùng trong Ex04VariableScope
	// đc dùng ở bất kì hàm nào trong class Ex04VariableScope
	// biến toàn cục = global variable
	// thuộc tính = attribute
	
	private static int a = 7777;
	private static String b = "title";
	private static double c = 14d;
	
	public static void main(String[] args) {
		// phạm vi trong hàm main
		int a = 99; 
		String b = "welcome";
		Item item = new Item(1, 'A', 11d);
		
		System.out.println("a local var --> " + a);
		System.out.println("a global var --> " + Ex04VariableScope.a);
		
	}
	
	public static void testScope() {
		// phạm vi trong testScope
		// biến cục bộ = local variable
		int a = 10;
		String b = "hello";
	}

}
