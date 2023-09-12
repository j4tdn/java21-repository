package view;

public class Ex04InitTimeWithStatic_NonStatic {
	// attributes, method
	
	// static : class loading time
	
	// non-static : object creating time
	
	private static String staticVar;
	private String nonStaticVar;
	
	public static void main(String[] args) {
		
	}
	
	// Class.staticMethod
	// Object.staticMethod
	public static void staticMethod() {
		System.out.println("Static method");
		System.out.println(staticVar);
		//System.out.println(nonStaticVar);	// Không gọi được
		//nonStaticMethod();	// Không gọi được
	}
	public void nonStaticMethod() {
		System.out.println("Non static method");
		System.out.println(staticVar); 		
		System.out.println(nonStaticVar);	// = this.nonStaticVar
		staticMethod();
	}
}
