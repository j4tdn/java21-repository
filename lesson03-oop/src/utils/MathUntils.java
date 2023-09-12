package utils;
/*
 * Utility class là class chứa các helper methods
 * (Helper methods: những phương thức dùng chung cho nhiều chỗ và
 * mình sẽ tạo ra static method trong Utility class)
 * ==> Không tạo ra vùng nhớ
 */
public class MathUntils {
	private MathUntils() {
	}
	
	public static int sum(int a, int b) {
		return a + b;
	}
	
	public static int sub(int a, int b) {
		return a - b;
	}
}
