package view;

public class Ex09Find200thPrime {
	public static void main(String[] args) {
		int count = 0;
		int i = 1;
		while (count <= 200) {
			i++;
			if (isPrimeNumber(i)) {
				count++;
			}
		}
		
		System.out.println("Số nguyên tố thứ 200 là: " + i);
	}
	
	private static boolean isPrimeNumber(int number) {
		if(number < 2) {
			return false;
		}
		for(int i = 2; i <= number/2; i++) {
			if(number % i == 0) {
				return false;
			}
		}
		
		return true;
	}
}
