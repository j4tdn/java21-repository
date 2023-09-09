package datastructor.object.available;

public class Ex02DiffInitaValue {
	public static void main(String[] args) {
		// Integer Demo
		Integer io1 = new Integer(24);
		Integer io2 = new Integer(36);
		Integer io3 = new Integer(24);
		Integer io4 = new Integer(18);
		System.out.println("io1(" + io1 + ") --> address(" + System.identityHashCode(io1) + ")");
		System.out.println("io2(" + io2 + ") --> address(" + System.identityHashCode(io2) + ")");
		System.out.println("io3(" + io3 + ") --> address(" + System.identityHashCode(io3) + ")");
		System.out.println("io4(" + io4 + ") --> address(" + System.identityHashCode(io4) + ")");
		
		System.out.println("==================================================");
		
		Integer i5 = 17;
		Integer i6 = 28;
		Integer i7 = 11;
		Integer i8 = 17;
		System.out.println("io5(" + i5 + ") --> address(" + System.identityHashCode(i5) + ")");
		System.out.println("io6(" + i6 + ") --> address(" + System.identityHashCode(i6) + ")");
		System.out.println("io7(" + i7 + ") --> address(" + System.identityHashCode(i7) + ")");
		System.out.println("io8(" + i8 + ") --> address(" + System.identityHashCode(i8) + ")");
		
	}
}
