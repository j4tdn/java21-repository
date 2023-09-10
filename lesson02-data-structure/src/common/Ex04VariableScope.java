package common;

import datastructure.object.custom.Item;

// Java --> block scope
public class Ex04VariableScope {
	// Cú pháp khai báo biến
	// atribute: [access modifier] [static] [final] return_type var_name [= value]
	// local variable:						[final] return_type var_name [= value]
	
	// Khai báo ở đây sẽ được gọi là trong phạm vi class
	// được dùng ở bất kỳ hàm nào trong class Ex04VariableScope
	
	// priority : local > global
	
	int a = 7777;
	String b = "Title";
	double c = 14d;
	
	public static void main(String[] args) {
		int a = 99;
		String b = "welcome";
		Item item = new Item(1, 'B', 44d);
	}
	
	public static void testScope() {
		int a = 10;
		String b = "hello";
	}
}
