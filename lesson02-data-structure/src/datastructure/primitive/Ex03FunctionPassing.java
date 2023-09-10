package datastructure.primitive;

public class Ex03FunctionPassing {
	
	public static void main(String[] args) {
		//phạm vi sử dụng của biến
		//fucntion scope, block scope
		
		int value = 14;
		int anotherValue = 20;
		System.out.println("Value1: " + value);
	
		
		
		//modify in the same method
		
		value = 20;
		System.out.println("Value2: " + value);
		
		//modify via another method
		modify(value);
		System.out.println("value2: " + value);
	}
	
	//pass by value at STACK 
	// truyền tham số qua hàm --> truyền giá trị (STACK) qua cho tham số 
	
	private static void modify(int input) {
		input = 999;
		
	}
}
