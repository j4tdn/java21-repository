package datastructure.object.available;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		int a = 5;
		System.out.println("a -- > "+a);
		
		System.out.println("\n========\n");
		// Object type : available 
		Integer o1 = new Integer(12);
		Integer o2 = new Integer(28);
		
		System.out.println("o1 --> "+ o1.toString());
		System.out.println("o2 --> "+ o2);
		
		Integer o3 = 77;
		Integer o4 = 88;
		
		Character c1 = new Character('@');
		System.out.println("c1 --> "+ c1);
	}
}
