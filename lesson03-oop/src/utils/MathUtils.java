package utils;

/**
 Utility class là class chứa các helper methods
 
 Helper Methods là những phương thức dùng chung cho nhiều chỗ 
 và mình sẽ tạo ra static method trong utility class
 
 */
public class MathUtils {
	
	private MathUtils() {
		
	}
	
	public static int sum(int a, int b) {
		return a + b;
	}
	
	public static int sub(int a, int b) {
		return a - b;
	}
}
