package view;

public class Ex04InitialTimeWithStatic_NonStatic {
	
	// attributes, method
	
	// static		: class loading time
	
	// non-static	: object creating time
	
	private static String staticVar;

	private String nonStaticVar;
	
	public static void main(String[] args) {
	
		
	}
	
	private static void staticMethod() {
		System.out.println("Ex04 --> Static Method" );
	}
	
	private void nonStaticMethod() {
		System.out.println("Ex04 --> Non Static Method" );
	}
}
