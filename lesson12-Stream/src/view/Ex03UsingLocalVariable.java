package view;

import java.util.List;

public class Ex03UsingLocalVariable {
	/*
	 * 1 Biến cục bộ(biến trong hàm) có thể được sử dụng trong anonymous
	 * class/function mà không cần truyền tham số qua constructor/medthod
	 Mặc định những local variable khi sử dụng anonymous function/class là final
	 
	 */

	public static void main(String[] args) {
		Runnable runnable = test(15);
		runnable.run();
		
	}

	private static Runnable test(int time) {
		String running ="running...";
		//anonymous function 
		return () ->{
			String student = "Adam";
			System.out.println(student +" is "+running+" in "+time+"(s)");
		};
	}
}
