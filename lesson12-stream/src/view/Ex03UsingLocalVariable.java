package view;

import bean.Apple;

public class Ex03UsingLocalVariable {
	
	/*
	 * 1 biến cục bộ (biến trong hàm) có thể được sử dụng trong
	 * anonymous class/function mà ko cần truyền tham số qua constructor/method
	 * 
	 * ngầm định những biến local variables phải là final
	 * 
	 * Vì: đang tự động truyền tham số qua hàm, mà khi truyền tham qua hàm thì
	 * 100% không thể cập nhật giá trị của biến(local) đó ở stack
	 * 
	 * --> đảm bảo --> final hoặc ngầm định là final
	 * 
	 */

	public static void main(String[] args) {
		Runnable runnable = test(15);
		runnable.run();
	}
	
	private static Runnable test(int time) {
		String running = "running....";
		Apple apple = new Apple();
		apple.setId(123);

		return () -> {
			apple.setId(234);
			// running = "test";
			String student = "Adam";
			System.out.println(student + " is " + running + " in " + time + "(s)");
		};
	}
	
	

}
