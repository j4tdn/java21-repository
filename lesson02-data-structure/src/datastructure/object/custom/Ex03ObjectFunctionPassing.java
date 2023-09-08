package datastructure.object.custom;

public class Ex03ObjectFunctionPassing {
	public static void main(String[] args) {
		Item i3 = new Item(3, 'C', 33); //H3(3, C, 77)
		
		System.out.println("i3 1st --> " + i3);
		
		modify(i3);
		
		System.out.println("i3 2nd -->" +i3);
	}
	
	private static void modify(Item item) {
		item.price = 99;
		Item i4  = new Item(4, 'D', 44d); //H4
		i4 = item; // item, i4 --> H3
		i4.price = 88;
		i4 = new Item(); // H5(i4)
		item.price = 77;
		item = i4;
	}
}
