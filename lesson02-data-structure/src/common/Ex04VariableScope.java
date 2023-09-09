package common;

import datastructure.object.custom.Item;
	//Java block scope

	// Java --> class
	// + KDL đối tượng: attribute, constructor, toString
	// + Code demo -- main + methods
public class Ex04VariableScope {
	
	// Cú pháp khai báo biến 
	// attribute	: [access modifier] [static] [final] return_type var_name [= value];
	// local variable:							 [final] return_type var_name [= value];
	
	// Phạm vi trong class Ex04
	// được dùng ở bất kỳ hàm nào trong class Ex04
	// biến toàn cục = global variable
	// thuộc tính = attribute
	private static int a = 777;
	public String b = "title";
	
	public static void main(String[] args) {
		// Phạm vi trong hàm main
		int a = 99;
		String b = "welcome";
		Item item = new Item();
		
		// Ưu tiên biến cục bộ hơn biến toàn cục: local var > global var
	}
	
	public static void testScope() {
		// phạm vi trong hàm testScope
		int a = 10;
		String b = "hello";
	}
}
