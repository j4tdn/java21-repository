package view.string.immutable;

public class Ex01StringImmutableDemo {
	public static void main(String[] args) {
		// class, data type --> String
		
		// String literal --> gán trực tiếp giá trị cho chuỗi
		String s1 = "welcome";
		String s2 = "welcome";
		String s3 = "hello";
		
		System.out.println("s1 hash: " + System.identityHashCode(s1) + ", value: " + s1);
		System.out.println("s2 hash: " + System.identityHashCode(s2) + ", value: " + s2);
		System.out.println("s3 hash: " + System.identityHashCode(s3) + ", value: " + s3);
		
		
		s3 = "bye";
		String s4 = "hello";
		System.out.println("\ns3 hash: " + System.identityHashCode(s3) + ", value: " + s3);
		System.out.println("\ns4 hash: " + System.identityHashCode(s4) + ", value: " + s4);
		
		
		//Khi nào công nhiều chuỗi thì k nên sử dụng String(immutable)
		String[] ss  = {s1,s2,s3};
		
		String result = "";
		for(String s : ss) {
			result =  result + s;
			System.out.println("result hash: " +  System.identityHashCode(result) + ", value: " + result);
		}
		
		// String object --> thông qua toán tử new]
		String so1 = new String("welcome");
		String so2 = new String("welcome");
		String so3 = new String("hello");
		
		System.out.println("\nso1 hash: " + System.identityHashCode(so1) + ", value: " + so1);
		System.out.println("so2 hash: " + System.identityHashCode(so2) + ", value: " + so2);
		System.out.println("so3 hash: " + System.identityHashCode(so3) + ", value: " + so3);
		
		// Nếu dùng String immultable --> Dùng String Literal
		//deamon thread --> clean unused clean
	}
}
