package a.validation_try_catch_throw_throws;

public class Ex03_Exception_Throw {
	
	// Validation: validation trước đoạn code có khả năng bị exception
	// try catch: đưa đoạn code có khả năng bị exception vào khối try
	
	// throw_throws
	// throw: ném exception trước khi đoạn code có khả năng bị exception xảy ra
	//		: ném khi mà exception xảy ra hay không phụ thuộc vào param truyền vào lúc gọi hàm
	
	public static void main(String[] args) {
	
		try {
			System.out.println(divide(4, 0));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	private static int divide(int a, int b) {
		if(b == 0) {
			// fail first --> save time
			// custom exception, message
			throw new ArithmeticException("e -> by zero");
		}
		return a / b;
	}
}
