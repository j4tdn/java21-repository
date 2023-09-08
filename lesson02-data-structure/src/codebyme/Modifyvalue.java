package codebyme;

public class Modifyvalue {

	public static void main(String[] args) {
		Swap i1 = new Swap(1);
		Swap i2 = new Swap(2);
		
		
		System.out.println("i1  --> " + i1.value);
		System.out.println("i2  --> " + i2.value);
		
		swaptwonumber(i1, i2);

		System.out.println("\nSau khi swap\n");
		
		System.out.println("i1 --> " + i1.value);
		System.out.println("i2 --> " + i2.value);

	}
	
	private static void swaptwonumber(Swap i1, Swap i2) {
		Swap tam = new Swap();
		tam.value = i1.value;
		i1.value = i2.value;
		i2.value = tam.value;

		
		
	}

}
