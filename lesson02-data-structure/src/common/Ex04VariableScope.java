package common;

import datastructure.object.custom.Item;

// Java --> blockscope

// Java --> class
// + KDL  đối tượng -->  attribute, constructor, toString
// + code demo --> main + #method
public class Ex04VariableScope {
	
	// Cú pháp khai báo biến
	// atribute			: [access modifier] [static] [final] return_type var_name [= value]
	// local variable	:							 [final] return_type var_name [= value]
	
	// phạm vi trong class Ex04VariableScope
	// được dùng ở bất kỳ hàm nào trong class Ex04VariableScope
	// biến toàn cục = global variable
	// thuộc tính = attribute
	
	private static int a = 7777;
	public static String b = "Title";
	private static double c = 14d;
	
	public static void main(String[] args) {
		// Phạm vi trong hàm main
		// Biến cục bộ = local variable
		int a = 99;
		String b = "Welcome";
		Item item = new Item();
		
		System.out.println("a local var --> " + a);
		System.out.println("a global var --> " + Ex04VariableScope.a);
		
		// priority: local > global
		
		// static
		// this
		// -->lesson 03
		
	}

	public static void testScope() {
		// phạm vi trong hàm testScope
		// biến cục bộ = local variable
		int a =10;
		String b = "hello";
	}
}
