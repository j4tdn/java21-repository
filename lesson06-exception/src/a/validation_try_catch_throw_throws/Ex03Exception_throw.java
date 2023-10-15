package a.validation_try_catch_throw_throws;

public class Ex03Exception_throw {
	
	//validation: validation trước đoạn code có khả năng bị exception
	//try-catch: đưa đoạn code có khả năng bị exception vào khối try
	
	//throw_throws
	
	public static void main(String[] args) {
		System.out.println("Vị trí A: " + divide(4, 2));
		
		try {
			System.out.println("Vị trí A: " + divide(4, 0));
		} catch (ArithmeticException ef) {
			System.out.println("ef: " + ef.getMessage());
		}
		
		
	}
	
	private static int divide(int a, int b) {
		if(b == 0) {
			throw new ArithmeticException("/ by zero");
		}
		return a / b;
	}

}
