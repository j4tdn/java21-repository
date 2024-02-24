package view;

import java.util.List;

import bean.Apple;

public class Ex03UsingLocalVariable {

	/*
	 * 1 biến cục bộ (Biến trong hàm) có thể được sử dụng trong anonumous
	 * class/function mà k cần phải truyền tham số qua constructor/method
	 * 
	 * Ngầm định những local variable này phải là final
	 * 
	 * Vì: Đang tự động truyền tham số qua hàm, mà khi truyền tham số qua hàm 100% k
	 * thể cập nhật giá trị của biến (local) đó ở stack
	 * 
	 * --> đảm bảo --> final hoặc ngầm định là final
	 * 
	 */
	public static void main(String[] args) {
		Runnable runnable = test(15);
		runnable.run();
	}

	private static Runnable test(int time) {
		String running = "running...";

		Apple apple = new Apple();
		apple.setId(123);
		; // vấn cập nhật được giá trị ở HEAP final ở stack

		// anonymous class
		// return new Runnable() {

		/*
		 * @Override public void run() { 
		 * String student = "Adam";
		 * System.out.println(student + " is " + running + " in " +time +"s");
		 * 
		 * } };
		 */

		// anonymous funtion
		return () -> {
			String student = "Adam";
			System.out.println(student + "is" + running + "in" + time + "s");
		};
	}

}
