package view;

public class Ex04InitialTimeWithStatic_NonStatic {
	
	// atrributes, method
	
	// static		: class loading time
	
	// non-static	: object creating time
	
	private static String staticVarString;
	private String nonStaticVarString;
	
	public static void main(String[] args) {
		staticMethod();
		
	}
	
	private static void staticMethod() {
		
		System.out.println("Ex4 --> Static Method" );
	}
	
	private  void nonStaticMethod() {
		System.out.println("Ex4 --> nonStatic Method" );
	}
}
