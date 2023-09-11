package baitapvenha.cautrucdulieu;

public class Ex09 {
	public static void main(String[] args) {
		int i = 2;
		int j = 0;
		
		while (j <= 199) {
			if (isPrime(i)) {			
				j++;		
				System.out.println("j= " + j + "--> i = " + i);
			} 			
			i++;		
		}
	}
	private static boolean isPrime (int n) {
		for (int k = 2; k <= n / 2; k++) {
			if (n % k == 0) {
				return false;
			} 			
		}
		return true;
	}	
}
