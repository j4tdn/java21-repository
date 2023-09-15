package view;

public class Ex04InitialTimeWithStatic_NonStatic {
		
	// attreibutes, method
	
	// static	 : class loading time
	// non static: object creating time
	
	// order time: static -> non static
		private static String staticVar;
		
		private  String nonstaticVar;

		public static void main(String[] args) {
			
//			
//			System.out.println("Ex04 --> Non Static method");

		}
		private static void staticMethod () {
			System.out.println(staticVar);
			
		//	System.out.println(nonStaticVar);
		//  nonStaticMethod;
			System.out.println("Ex04 --> Static method");
		}
		
		private void nonstaticMethod () {
			System.out.println(staticVar);
			System.out.println(nonstaticVar);
			staticMethod();
			
			System.out.println("Ex04 --> Non Static Method");
		}
}
