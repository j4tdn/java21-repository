package datastructureobject.custom;

public class Ex01ObjectDemo {
	public static void main(String[] args) {
		
		Item i1 = new Item();
		i1.id = 2;
		i1.name = 'B';
		i1.price = 13d;
		System.out.println("i1 1st --->"+i1);
		
		Item i2 = new Item(2,'F',15d);
		System.out.println("i2 ---->"+ i2);
	
//		Item i5 = null;
//		System.out.println(i5.id);
		
	}
}
	
