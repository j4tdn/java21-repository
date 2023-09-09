package datastructure.object;

public class Ex03ObjectFunctionPassing {
	public static void main(String[] args) {
		Item i3 = new Item(3, "C", 33d);
		System.out.println("i3 1st --> + i3");
		modify(i3);
		System.out.println("i3 --> " + i3);
	}
	
	private static void modify(Item item) {
		item.setPrice(99);
		Item i4 = new Item(4, "D", 44d);
		i4 = item; // item, i4 -- > H3
		i4.setPrice(88);
		i4 = new Item();
		item.setPrice(77);
		item = i4;
	}
}
