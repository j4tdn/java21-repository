package view;

public class Ex04InitialTimeWithStatic_NoneStatic {
	//attributes, method
	// static : class loading -- gọi được static khác, không gọi được non static,
	//non-static: object creating time gọi được non staitic và static
	//order time: static --> non-staic
	 private static String staticVar;
	 
	 private String nonestaticVar;
	 
	public static void main(String[] args) {
		
	}
		 private static void staticMethod() {
			 
			 System.out.println("Ex04 --> Static Method");
	}
		 private void nonstaticMethod() {
			 System.out.println(staticVar);
			 System.out.println(nonestaticVar);
			 staticMethod();
			 
			 
			 
			 System.out.println("Ex04 -->  nonstaticMethod");
		 }
}

