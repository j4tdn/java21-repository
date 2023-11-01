package view.string.immutable;

public class Ex01StringImmutableDemo {
	public static void main(String[] args) {
		
		// class, date type -- String
		
		// String literal --> gán trực tiếp giá trị cho chuỗi
		String s1 = "welcome";
		String s2 = "welcome";
		String s3 = "hello";
		
		System.out.println("s1 hash: " + System.identityHashCode(s1) + " value: " + s1);
		System.out.println("s2 hash: " + System.identityHashCode(s2) + " value: " + s2);
		System.out.println("s3 hash: " + System.identityHashCode(s3) + " value: " + s3);
		
		s3 = "bye";
		String s4 = "hello";
		
		System.out.println("s3 hash: " + System.identityHashCode(s3) + " value: " + s3);
		System.out.println("s4 hash: " + System.identityHashCode(s4) + " value: " + s4);
		
		// Khi nào cộng nhiều chuỗi, ko nên sử dụng String(immutable)
		
		//String object
		String o1 = new String("welcome");
		String o2 = new String("welcome");
		String o3 = new String("hello");
		System.out.println("o1 hash: " + System.identityHashCode(o1) + " value: " + o1);
		System.out.println("o2 hash: " + System.identityHashCode(o2) + " value: " + o2);
		System.out.println("o3 hash: " + System.identityHashCode(o3) + " value: " + o3);
		
		// deamon thread --> clean unused memory
	}
}
