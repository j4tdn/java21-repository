package a.validation_try_catch_throw_throws;

public class Ex03Exception_Throw {
	// validation: validation trước đoạn code có khả năng bị exception
			// try catch: đưa đoạn code có khả năng bị exception vào khối try 
			// throw_throws
			// throw: ném exception trước khi đoạn code có khả năng bị exception
			//      : ném khi mà exception xảy ra hay ko phụ thuộc vào pram truyền vào lúc gọi hàm
			
	public static void main(String[] args) {
		// Vị trí A: gọi hàm divide
		//         : cho a, b số nguyên
		//			        b khác 0
		System.out.println("Vị trí của A: "+ divide(2, 3));
		System.out.println("\n==============\n");
		
		//Vị trí B: gọi hàm divide
		//         : cho a, b số nguyên tùy ý
		//			       
		//
		
		
		try {
			System.out.println("Vị trí của B: "+ divide(2, 1));
		} catch (Exception e) {
			System.out.println("ef ->" + e.getMessage());
			e.printStackTrace();
		}
	}
	
	private static double divide(double a, double b) {
		if(b==1) {
			throw new ArithmeticException("e -> / by zero");
		}
		return a/b;
	}
}
	

