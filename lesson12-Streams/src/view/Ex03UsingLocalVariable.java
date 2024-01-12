package view;

import bean.Apple;

public class Ex03UsingLocalVariable {

	/*
	 *  1 biến cục bộ( biến tring hàm) có thể đc sử dụng trong
	 *  anonymus class/function mà ko cần phải truyền tham số qua construcstor/ method
	 *  
	 *  Ngầm định những local variable này phải là final
	 *  
	 *  Vì : đang tụ động truyền tham số qua hàm, mà khi truyền tham số qua hàm 
	 *  100% ko thể câpj nhập giá trị của biến (local) đó ở stack
	 *  
	 *  --> đảm bảo --> final hoặc ngầm định là final
	 */
	
	public static void main(String[] args) {
		
		Runnable runnable =  test(15);
		runnable.run();
	}
	
	private static Runnable test(int time) {
		String running = "running ....";
		Apple apple = new Apple();
		apple.setId(123);
		
		// Ngầm định là final nên không thể thay đổi được .
//		running = "hello";
//		 return new TestRunnable(time,running);
		
		
		
		/*
		 * Anonymú function
		return new Runnable() {
			
			@Override
			public void run() {
				String student = "Adam";
				System.out.println(student + "is" + running + " in " + time + "(s)");
			}
		};*/
		 
		
		
	//	anonymus function
		return () -> {
			String student = "Adam";
			System.out.println(student + "is" + running + " in " + time + "(s)");
		};
	}
	
	private static class TestRunnable implements Runnable{
		@Override
		public void run() {
			String student = "Adam";
			
		}
	}

}
