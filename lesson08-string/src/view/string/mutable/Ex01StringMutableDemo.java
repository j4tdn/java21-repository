package view.string.mutable;

public class Ex01StringMutableDemo {
	public static void main(String[] args) {
		// String Immuatable: String
		// String Mutable: String Builder; String Buffer
		
		StringBuilder sb1 = new StringBuilder("todo-app-2.4");
		sb1.append("-snapshot").append("-test");
		System.out.println("sb: " + sb1);
		
		sb1.deleteCharAt(0)
		   .setCharAt(0, 'a');;
		System.out.println("\nsb delete: " + sb1);
		
		System.out.println("\nThread --> " + Thread.currentThread().getName());
		
		/*
		 Khi các đoạn code, công việc, task thực thi không depends lẫn nhau
		 
		 Load A -> 4s
		 Load B -> 3s
		 Load C -> 5s
		 
		 Thread 'main'-single -> 12s
		 
		 -> tạo ra 2 thread -> 5s
		 
		 thread: là 1 luồng thực thi giúp thực thi 1 công việc, tác vụ nào đó
		 */
	}
}
