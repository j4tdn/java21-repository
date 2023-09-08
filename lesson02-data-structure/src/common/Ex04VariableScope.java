package common;

import datastructure.object.Item;
//java ==> block scope


// Java --> class
// + KDL đối tượng --> attribute, constructor, toString
// + Code demo --> main + #methods

public class Ex04VariableScope {

	//cú pháp khai báo biến
	//attribute    :  [access modifier] [static] [final] return_type var_name [= value];
	//local variable:                            [final] return_type var_name [= value];
	
	//phạm vi trong class Ex04VariableScope
	//được dùng ở bất kì hàm nào trong class Ex04VariableScope
	//biến toàn cục = global variable
	//thuộc tính =  attribute
	
	private static int a = 7777;
	private static String b = "Title";
	private static double c = 14d;
	
	public static void main(String[] args) {
		//phạm vi trong hàm main
		//biến cục bộ = local variable
		int a = 99;
		String b = "welcome";
		Item item = new Item(1, 'A', 11d);
		
		System.out.println("a local var --> " + a);
		System.out.println("a global var --> " + Ex04VariableScope.a);
		
		//priority: local > global
	}
	
	public static void testScope() {
		//phạm vi trong hàm testScope
		int a = 10; 
		String b = "hello";
	}

}
