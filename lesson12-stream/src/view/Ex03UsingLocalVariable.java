package view;

import java.util.List;

import bean.Apple;

public class Ex03UsingLocalVariable {
	
	/*
	 * 1 biến cục bộ(biến trong hàm) có thể được sử dụng trong
	 * anonymous class/function mà ko cần phải truyền tham số qua constructor/method
	 * 
	 * Ngầm định những local variable này phải là final
	 * 
	 * Vì: đang tự động truyền tham số qua hàm, mà khi truyền tham số qua hàm
	 * 100% ko thể cập nhật giá trị của biến(local) đó ở stack
	 * 
	 * --> đảm bảo --> final hoặc ngầm định là final
	 * 
	 */
	
	public static void main(String[] args) {
		Runnable runnable = test(15);
		runnable.run();
		
		List<Integer> list = List.of(1,2,3,4,5);
		Integer max = Integer.MIN_VALUE;
		
		list.forEach(number -> {
			if (max < number) {
				// max = number; // auto final
			}
		});
		
		
		System.out.println("max --> " + max);
	}
	
	private static Runnable test(int time) {
		String running = "running ...";
		Apple apple = new Apple();
		apple.setId(123);;
		
		// running = "hello";
		
		// return new TestRunnable(time, running);
		
		/* anonymous class
		return new Runnable() {
			
			@Override
			public void run() {
				String student = "Adam";
				System.out.println(student + " is " + running + " in " + time  + "(s)");
			}
		};*/
		
		// anonymous function
		return () -> {
			apple.setId(234);
			String student = "Adam";
			// running = "test";
			System.out.println(student + " is " + running + " in " + time  + "(s)");
		};
		
		
	}
	
	// external class
	private static class TestRunnable implements Runnable {
		
		private int time;
		private String running;
		
		private TestRunnable(int time, String running) {
			this.time = time;
			this.running = running;
			
			running = "hello";
		}
		
		@Override
		public void run() {
			String student = "Adam";
			System.out.println(student + " is " + running + " in " + time  + "(s)");
		}
	}
	
}
