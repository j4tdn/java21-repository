package view.string.immutable;

public class Ex01StringImmutableDemo {
	
	public static void main(String[] args) {
		
		//class, data type -->string
		
		//String Literal --> gán trực tiếp giá trị cho chuỗi
		String s1 = "welcome";
		String s2 = "welcome";
		String s3 = "hello";
		
		System.out.println("s1 hash:" +System.identityHashCode(s1) + ",value: " +s1);
		System.out.println("s2 hash:" +System.identityHashCode(s2) + ",value: " +s2);
		System.out.println("s3 hash:" +System.identityHashCode(s3) + ",value: " +s3);
		
		s3 = "bye";
		
		String s4 = "hello";
		System.out.println("\ns3 hash:" +System.identityHashCode(s3) + ",value: " +s3);
		System.out.println("s4 hash:" +System.identityHashCode(s4) + ",value: " +s4);
		
		//Khi nào cộng nhiều chuỗi, không nên sử dụng String(immutable)
		//Nhiều(>3);
		String [] ss = {s1, s2, s3, s4};
		String result = "";
		for (String s: ss) {
			result = result + s;
			System.out.println("result hash:" +System.identityHashCode(result) + ",value: " +result);
		}
		
		//String object --> thông qua toán tử new
		String s01 = new String("welcome");
		String s02 = new String("welcome");
		String s03 = new String("hello");
		System.out.println("s01 hash:" +System.identityHashCode(s01) + ",value: " +s01);
		System.out.println("s02 hash:" +System.identityHashCode(s02) + ",value: " +s02);
		System.out.println("s03 hash:" +System.identityHashCode(s03) + ",value: " +s03);
		
		//Neesu dung string immutale --> dung string literal
		
	}		
}
