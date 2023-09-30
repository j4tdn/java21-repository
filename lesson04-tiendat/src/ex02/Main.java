package ex02;

public class Main {

	public static void main(String[] args) {
		
		NumberList list = new NumberList();
		list.generateRandom(10);

		System.out.println("Original: ");
		list.print();
		
		System.out.println("Rearranged: ");
		list.rearrange();
	}

}
