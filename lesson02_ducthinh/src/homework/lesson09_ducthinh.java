package homework;

public class lesson09_ducthinh {
	
	public static void main(String[] args) {
		int count = 0;
		int num = 2;
		while(count<200) {
			if(checkPrime(num)) {
				count++;
				if(count == 200) {
					System.out.println("Số nguyên thứ 200 là : "+num);
				}
			}
			num++;
		}
	}
	
	public static boolean checkPrime(int n) {
		for(int i=2; i < Math.sqrt(n);i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
