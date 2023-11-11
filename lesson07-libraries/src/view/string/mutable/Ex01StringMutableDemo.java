package view.string.mutable;

public class Ex01StringMutableDemo {
	public static void main(String[] args) {
		
		//1. Phân biệt String Literal và String Object
		//2. Phân biệt StringBuilder và StringBuffer
		//3. Khái niệm immutable là gì, ví dụ
		//4. Phân biệt String Immutable và Mutable
		// String Immutable: String
		
		// String mutable: StringBuilder, String buffer
		StringBuilder sb1 = new StringBuilder("todo-app-2.4");
		
		sb1.append("-snapshot")
		   .append("-test");
		
		System.out.println("sb --> " + sb1);
		sb1.deleteCharAt(0);
		System.out.println("\nsb --> "+ sb1);
	}
}
