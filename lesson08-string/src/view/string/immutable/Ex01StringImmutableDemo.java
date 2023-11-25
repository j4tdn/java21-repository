package view.string.immutable;

public class Ex01StringImmutableDemo {
	public static void main(String[] args) {
		// class, data type --> String

		// String literal --> gán trực tiếp giá trị cho chuỗi
		String s1 = "Welcom";
		String s2 = "welcom";
		String s3 = "hello";

		System.out.println(" s1 hash: " + System.identityHashCode(s1));
		System.out.println(" s2 hash: " + System.identityHashCode(s2));
		System.out.println(" s3 hash: " + System.identityHashCode(s3));

		s3 = "bye";
		String s4 = "hello";

		System.out.println(" s3 hash: " + System.identityHashCode(s3));
		System.out.println(" s4 hash: " + System.identityHashCode(s4));

		// String object --> thông qua toán tử new
		String o1 = new String("Welcom");
		String o2 = new String("welcom");
		String o3 = new String("hello");
		System.out.println("o1 hash:"+ System.identityHashCode(01));
	}
	//Nếu dùng String Immutable --> dùng String literal
}
