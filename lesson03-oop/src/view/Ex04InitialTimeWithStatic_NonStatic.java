package view;

public class Ex04InitialTimeWithStatic_NonStatic {

	/*
	 * attribute, method
	 * 
	 * static
	 * 
	 * non-static
	 * 
	 * order time: static --> non-static
	 */
	private static String staticVar;
	private static String nonStaticVar;

	public static void main(String[] args) {
		staticMethod();
		
		// nonStaticMethod(); --> need object
	}

	private static void staticMethod() {

	}

	private void nonStaticMethod() {

	}
	
	// static gọi static được, static gọi non static không được(muốn gọi non static cần có đối tượng)
	
}
