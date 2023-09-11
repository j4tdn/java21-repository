package baitap2;

public class Ex09 {

	public static void main(String[] args) {
		int count=1,i=2;
		
		while(count!=200) {
			if(isPrime(++i)) count++;
		}
		
		System.out.println(i);
	}

	private static boolean isPrime(int n) {
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
}

