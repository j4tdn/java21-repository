package datastructuree.object.system;

public class Ex02ObjectofifyValue {
	public static void main(String[] args) {
		Item i1= new Item(1, "A1", 1.1);
		Item i2= new Item(2, "A2", 2.2);
		
		i1=i2;
		i1.setName("B");
		System.out.println(i2);
	}
}
