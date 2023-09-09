package datastructure.object.custom;
	/*
	 * In Java: Pass by value AT STACK
	 */
public class Ex03ObjectFunctionPassing {
	public static void main(String[] args) {
		Item i3 = new Item(3, 'C', 33d);
		String b;
		
		System.out.println("i3: " + i3);
		
		modify(i3);
		
		System.out.println("i3 after modify: " + i3);
	}
	
	private static void modify(Item item) {
		item.price = 99d;
		Item i4  = new Item(4, 'K', 88d);
		i4 = item;
		i4.price = 55d;
		i4 = new Item();
		item.price = 77d;
		item = i4;
	}
	
}
