package datastructure.object.custom;

public class Ex02ObjectModifyValue {
	public static void main(String[] args) {
		// garbage collector
		// Toán tử gán là gán giá trị ở STACK
		
		Item i1 = new Item(1, 'A', 11d);
		Item i2 = new Item(2, 'B', 22d);
		
		System.out.println("Add i1 1st: " + System.identityHashCode(i1));
		System.out.println("Add i2 1st: " + System.identityHashCode(i2));
		
		i1 = i2;
		i1.name = 'Z';
		
		System.out.println("Add i1 2nd: " + System.identityHashCode(i1));
		System.out.println("Add i2 2nd: " + System.identityHashCode(i2));
		System.out.println("i1 --> " + i1);
		System.out.println("i2 --> " + i2);
		
		
	}
}
