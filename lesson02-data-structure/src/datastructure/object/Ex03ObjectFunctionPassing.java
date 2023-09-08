package datastructure.object;

public class Ex03ObjectFunctionPassing {
	public static void main(String[] args) {
		Item i3 = new Item(3, 'C', 33d);
		System.out.println("i3 1st --> " + i3);
		modify(i3);
		System.out.println("i3 2nd --> "  + i3);
	}
	
	private static void modify(Item item) {
		item.price = 99;
		Item i4 = new Item(4, 'D', 44d);
		i4 = item;
		i4.price = 88;
		i4 = new Item();
		item.price = 77;
		item = i4;
	}
}
