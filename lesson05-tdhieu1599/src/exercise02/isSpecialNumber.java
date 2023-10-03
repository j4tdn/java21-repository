package exercise02;

public class isSpecialNumber {

	public static void main(String[] args) {
		System.out.println(isSpecialNumber(14));
	}
	
	private static boolean isSpecialNumber(int n) {
		int sum = 0;
		for (int i = 0; i <= n/2; i++) {
			sum += i;
			if (n == sum) {
				return true;
			}
			
		}
		return false;
	}
}
