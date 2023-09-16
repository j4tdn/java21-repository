package datastructuree.object.system;

public class Ex03ObjectFunctionPassing {
	private static void modify(Item item) {
		item.setPrive(9.9);
		Item i4 = new Item(4, "A3",3.3);
		i4 = item ;
		i4.setPrive(88d);
		i4 = new Item(3,"A3", 88d);
		item.setPrive(77d);
		item =i4;
		item=i4;
	}
	public static void main(String[] args) {
		Item i3 = new Item(3, "A3",3.3);
		System.out.println(i3);
		modify(i3);
		System.out.println(i3);
	}
}
