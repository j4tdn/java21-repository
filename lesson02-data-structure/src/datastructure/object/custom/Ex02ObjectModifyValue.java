package datastructure.object.custom;

public class Ex02ObjectModifyValue {

	public static void main(String[] args) {
		
		//gabage collector
		//toán tử gán = --> 100% gán ở STACK
		
		Item i1 = new Item(1, 'A', 11d);
		Item i2 = new Item(2, 'B', 22d);
		
		System.out.println("i1 address 1 --> " + System.identityHashCode(i1));
		System.out.println("i1 address 1 --> " + System.identityHashCode(i2));

		i1 = i2;
		i1.name = 'Z';
		
		System.out.println("i1 address 2 --> " + System.identityHashCode(i1));
		System.out.println("i1 address 2 --> " + System.identityHashCode(i2));
		System.out.println("i1 --> " + i1);
		System.out.println("i2 --> " + i2);
		

	}

}
