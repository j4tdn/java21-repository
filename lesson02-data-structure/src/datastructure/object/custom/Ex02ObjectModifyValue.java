package datastructure.object.custom;

public class Ex02ObjectModifyValue {

	public static void main(String[] args) {

		Item i1 = new Item(1, 'A', 11);
		Item i2 = new Item(2, 'B', 22);
		
		i1 = i2;
		i1.name = 'Z';
		
		System.out.println(i1);
		System.out.println(i2);
	}

}
