package datastructureobject.available;

public class Ex02DiffInitialValue {
	public static void main(String[] args) {
		// Khởi tạo có new
		
		Integer io1 = new Integer(24);
		Integer io2 = new Integer(36);
		Integer io3 = new Integer(24);
		Integer io4 = new Integer(18);
		
		System.out.println("value("+ io1+")--> address(" + System.identityHashCode(io1)+")");
		System.out.println("value("+ io2+")--> address(" + System.identityHashCode(io2)+")");
		System.out.println("value("+ io3+")--> address(" + System.identityHashCode(io3)+")");
		System.out.println("value("+ io4+")--> address(" + System.identityHashCode(io4)+")");
		
		// Khởi tạo không new
		Integer i5 = 17;
		Integer i6 = 28;
		Integer i7 = 11;
		Integer i8 = 17;
		
		System.out.println("value("+ i5+")--> address(" + System.identityHashCode(i5)+")");
		System.out.println("value("+ i6+")--> address(" + System.identityHashCode(i6)+")");
		System.out.println("value("+ i7+")--> address(" + System.identityHashCode(i7)+")");
		System.out.println("value("+ i8+")--> address(" + System.identityHashCode(i8)+")");
	}
}
