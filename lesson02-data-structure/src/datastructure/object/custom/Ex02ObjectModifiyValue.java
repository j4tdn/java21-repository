package datastructure.object.custom;

public class Ex02ObjectModifiyValue {
	public static void main(String[] args) {
		// Toán tử gán = --> 100% gán ở STACK (địa chỉ)
		Item i1 = new Item(1,'A', 11d); // H1
		Item i2 = new Item(2,'B', 22d); //H2
		
		i1 = i2; // i1,i2 --> H2
		i1.name = 'z';
		System.out.println("i1 -->" +i1); //id=
		System.out.println("i2 -->" +i2);
	}
}
