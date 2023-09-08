package datastructure.object.custom;

public class Ex02ObjectModifyValue {
	public static void main(String[] args) {
		Item i1 = new Item(1, 'A', 11d);
		Item i2 = new Item(2, 'B', 22d);
		
		// Toán tử gán --> 100% gán ở STACK
		i1 = i2;
		i1.name = 'Z';
		
		System.out.println("i1 --> " + i1);
		System.out.println("i2 --> " + i2);
	}
}
