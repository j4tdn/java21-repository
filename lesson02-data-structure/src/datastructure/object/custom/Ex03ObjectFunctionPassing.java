package datastructure.object.custom;

public class Ex03ObjectFunctionPassing {
	public static void main(String[] args) {
		Item i3 = new Item(3,'C',33d);
		
		System.out.println("i3 -> "+i3);
		
		modify(i3);
		
		System.out.println("i3 -> "+i3);

	}
	
	
	private static void modify(Item item) {
		item.price = 99;
	}
}
