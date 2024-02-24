package view;

import java.util.List;

import bean.Apple;

public class Ex03UsingLocalVariable {
	/*
	  1 biến cục bộ (biến trong hàm) có thể được sử dụng trong anonymous class/function
	  mà không cần phải truyền tham số qua constructor
	  
	  Ngầm định những local viriable này phải là final 
	  
	  Vì: Đang tự động truyền tham số qua hàm, mà khi truyền tham số qua hàm, 100% không thể 
	  cập nhật giá trị của biển(local) ở stack
	  
	  --> đảm bảo --> final hoặc ngầm định là final
	 */
	public static void main(String[] args) {
		//test(15);
		Runnable runnable =  test(15);
		runnable.run();
		
		List<Integer> list = List.of(1,2,3,4,5);
		Integer max = Integer.MIN_VALUE;
		
		list.forEach(number -> {
			if(max < number) {
//				max = number;   //auto final
			}
		});

	
		System.out.println("max --> " + max);
		
	}
	
	private static Runnable test(int time) {
		 String running = "running...";
		
		 Apple apple = new Apple();
		 apple.setId(123);
		 
	     // running = "hello";
	
		// return new TestRunnable(time,running);
		
		/* anonymous class
		return new Runnable() {
			@Override
			public void run() {
				String student = "Adam";
				System.out.println(student + " is " + running + " in " + time + "(s)");
			}
		}; */
		
		
		// anonymous function
		return () -> {
			apple.setId(345);
			String student = "Adam";
			System.out.println(student + " is " + running + " in " + time + "(s)");
		}; 
		

		
	}

	// External class
	private static class TestRunnable implements Runnable{

		private int time;
		private String running;
		
		public TestRunnable(int time, String running) {
			this.time = time;
			this.running = running;
		}
		@Override
		public void run() {
			String student = "Adam";
			System.out.println(student + " is " + running + " in " + time + "(s)");			
		}
	}
	
	
}
  