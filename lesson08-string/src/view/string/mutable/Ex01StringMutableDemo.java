package view.string.mutable;

public class Ex01StringMutableDemo {
	public static void main(String[] args) {
		
		//String Mutable: StringBuilder, StringBuffer
		// phân biệt?
		
		StringBuilder sb1 = new StringBuilder("todo-app-2.4");
		sb1.append("-snapshot").append("-test");
		
		System.out.println("sb hash 01: " + sb1.hashCode() );
		
		System.out.println("sb --> " + sb1);
		
		
		sb1.deleteCharAt(0).setCharAt(0, 'a');
		
		System.out.println("sb hash 01: " + sb1.hashCode() );
		
		System.out.println("\nsb deleted --> " + sb1);
		
		System.out.println("Thread -> " + Thread.currentThread().getName());
		
	}
}
