package day11;

public class Test {

	public static void main(String[] args) {
		long t1 = System.currentTimeMillis();
		for (int i = 0; i < 1000; i++) {
			System.out.println("test");
		}
		long t2 = System.currentTimeMillis();
		
		System.out.println("before run for: " + t1);
		System.out.println("after run for: " + t2);
		System.out.println("time run for: " + (t2-t1) + " mls");
	}
}
