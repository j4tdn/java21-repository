package view;

public class Ex04InitialTimeWithStatic_NonStatic {

	// attributes, method
	// static     : class loading time
	// non-static : object creating time
	
	private static String staticVar;
	private static String nonStaticVar;
	
	
	public static void main(String[] args) {
		staticMethod();
//		nonStaticMethod();    ---> need object
	
	}
	
	
	public static void staticMethod() {
		System.out.println(staticVar);
		
//		System.out.println(nonStaticVar);
//		nonStaticVar;
		
		System.out.println("Ex04 --> Static Method");
	}
	
	public void nonStaticMethod() {
		System.out.println(staticVar);
		System.out.println(nonStaticVar);
		staticMethod();
		
		System.out.println("Ex04 --> Non Static Method");
	}
}
