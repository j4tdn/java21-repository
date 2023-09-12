package common;

import datastructor.object.Item;
// Java --> block scope

// java --> class
// 		KDL đối tượng --> attribute, constructor, toString
//		Code demo --> main + #methods
public class Ex04VariableScope {
	
	// cú pháp khai báo biến
	// atttribute: []
	
	// phạm vi trong class Ex04
	// được dùng ở bất kỳ hàm nào trong class Ex04
	// biến toàn cục: global
	// thuộc tính: attribute
	
	private static int a = 7777;
	public static String b = "Title";
	private static double c = 14d;
	
	public static void main(String[] args) {
		// phạm vi trong hàm main
		// biến cục bộ = local variable
		int a = 99;
		String bString = "welcome";
		Item item = new Item(1, 'A', 11d);
	}
	
	public static void testScope() {
		
	}
}
