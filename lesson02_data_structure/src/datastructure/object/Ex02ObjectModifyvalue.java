package datastructure.object;

public class Ex02ObjectModifyvalue {
	public static void main(String[] args) {
		Item i1 = new Item(1, "A", 11d); //H1
		Item i2 = new Item(2, "B", 22d); //H2
		
		i1 = i2;
		i1.setName("Z");
		
		System.out.println("i1 -- > "+ i1);
		System.out.println("i1 -- > "+ i2);

	}
}
