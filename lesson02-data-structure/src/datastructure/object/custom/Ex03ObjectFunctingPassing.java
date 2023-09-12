 package datastructure.object.custom;

public class Ex03ObjectFunctingPassing {

	public static void main(String[] args) {
		Item i3 = new Item(3, "C", 33d);
		
		System.out.println("i3 --> " + i3);
		
		modify(i3);
		
		System.out.println("i3 2nd --> " + i3);
	}
	
	//Item item = i3
	private static void modify(Item item) {
		item.price = 99;
		Item i4 = new Item(4, "D", 44d); //H4
		i4 = item; // item, i4 --> H3
		item.price = 88;
		i4 = new Item(); //H5(i4)
		item.price = 77; 
		item = i4; //item(H5)
		
	}

}
