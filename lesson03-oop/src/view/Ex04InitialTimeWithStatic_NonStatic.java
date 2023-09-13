package view;

public class Ex04InitialTimeWithStatic_NonStatic {

	// attribute, method
	
	// static    : class loading time
	
	// non-static: object creating time
	
	// order time: static -> non-static
	
	private static String staticVar;
	private String nonStaticVar;
	
	public static void main(String[] args) {
		staticMethod();
//		nonStaticMethod(); --> need object
	}
	
	private static void staticMethod() {
		System.out.println(staticVar);
//		System.out.println(nonStaticVar);
		System.out.println("Ex04 --> Static Method");
	}
	
	private void nonStaticMethod() {
		System.out.println(staticVar);
		System.out.println(nonStaticVar);
		staticMethod();
		System.out.println("Ex04 --> Non Static Method");
	}
}	
