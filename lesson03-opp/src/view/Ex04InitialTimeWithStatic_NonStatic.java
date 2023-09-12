package view;

public class Ex04InitialTimeWithStatic_NonStatic {
	private static String starticVar;
	private String nonStaticVar;
	public static void main(String[] args) {
		

	}
	private static void staticMethod() {
		System.out.println(starticVar);
//		System.out.println(nonStaticMethod);
//		nonStaticMethod();
	}
	
	private void nonStaticMethod() {
		System.out.println(starticVar);
		System.out.println(nonStaticVar);
		staticMethod();
		System.out.println("--> Non Static Method");
	
	}
}
