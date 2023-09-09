package datastructure.object.custom;

public class Ex03ObjectFunctionPassing {
	public static void main(String[] args) {
		Item i3 = new Item(3, 'E', 33);
		System.out.println(System.identityHashCode(i3));
		modify(i3);
		System.out.println(i3);
	}

	private static void modify(Item i3) {
		i3.price = 99;
		Item i4 = new Item();
		System.out.println(System.identityHashCode(i4));
		i3 = i4;
		System.out.println(i4);
		System.out.println(System.identityHashCode(i3));
	}
}
