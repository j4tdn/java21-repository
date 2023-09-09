package bt;

public class Swap {
	public static void main(String[] args) {
		CustomerInteger i1 = new CustomerInteger(5);
		
		CustomerInteger i2 = new CustomerInteger(12);
		
		CustomerInteger.swap(i1, i2);
		
		System.out.println("i1 = " + i1);
		System.out.println("i2 = " + i2);
	}
	
//	private static void swap(CustomerInteger i1, CustomerInteger i2) {
//		int temp = i1.getValue();
//		i1.setValue(i2.getValue());
//		i2.setValue(temp);
//	}
}
