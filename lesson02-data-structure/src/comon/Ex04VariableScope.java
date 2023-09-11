package comon;

import datastructure.object.custom.Item;
// Java --> block scope

// Java --> class
// +KDL đối tượng -- attribute, constructor, toString
// +Code demo --> main + #method
public class Ex04VariableScope {
	
	// Cú pháp khai báo biến
	// attribute:[access modifier] [static] [final] returrn_type var_name [=value]ư
	//local variable:						[final] returrn_type var_name [=value
	// Phạm vị trong  class Ex04VariableScope
	// Được dùng ở bất kỳ hàm nào trong class Ex04VariableScope
	// Biến toàn cục = global variable
	// Thuộc tính = attribute
	private static int a = 777;
	public static String b = "Title";
	private static double c= 14d;
public static void main(String[] args) {
	// Phạm vi trong hàm main
	// Biến cục bộ = local variable
	
	 int a = 10;
	 String b = "hello";
	 Item item = new Item (1,'A',11d);
	 System.out.println("a local -->" +a);
	 System.out.println("a golbal var -->" +Ex04VariableScope.a);
	 // prioity: local > global
	 
	 //static
	 //this
	 //--> lesson03
	}

	public static void testScope() {
		// Phạm vi trong hàm testScope
		// biến cục bộ = local variable
	 int a = 10;
	 String b = "hello";
	}
	
	
}
