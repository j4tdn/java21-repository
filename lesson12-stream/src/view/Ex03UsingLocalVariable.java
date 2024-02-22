package view;

import java.util.List;

public class Ex03UsingLocalVariable {
	/*
	 * 1 biến cục bộ(Biến trong hàm) có thể được sử dụng trong
	 * anonymous class/function mà không cần phải truyền tham số qua constructor/method
	 * 
	 * Ngầm định những local variable nảy phải là final
	 * 
	 * Vì: đang tự động truyền tham số qua hàm, mà khi truyền tham số qua hàm, 100% ko thể
	 * cập nhật giá trị của biến (local) đó ở stack
	 * 
	 * --> đảm bảo --> final hoặc ngầm định là final
	 */
	public static void main(String[] args) {
		Runnable runnable = test(60);
		runnable.run();
		
		List<Integer> list = List.of(1, 2, 3, 4);
		Integer max = Integer.MIN_VALUE;
		for(Integer number:list) {
			if(number > max) {
				max = number;
			}
		}
	}
	
	private static Runnable test(int time) {
		String running = "running...";
		
		// anonymous function
		return () -> {
			String student = "Adam";
			System.out.println(student + " is " + running + " in " + time + "(s)");
		};
	}
}
