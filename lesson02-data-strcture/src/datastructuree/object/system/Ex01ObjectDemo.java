package datastructuree.object.system;

public class Ex01ObjectDemo {
	public static void main(String[] args) {
		// Object a;
		Item item = new Item(1, "Thanh", 9.1);
	//	System.out.println("Dia chi Item: " + System.identityHashCode(item));
		//item = new Item(1,"t", 1.2);
		System.out.println(item.getName());
		Item item2 = new Item(2, "Thanh2", 10.2);
		System.out.println(item2);
	}
}
