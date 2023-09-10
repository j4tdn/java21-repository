package view;

public class Ex09 {
	
	public static void main(String[] args) {
		
		int n = 1;
		int count = 0;
		
		while(count < 200) {
			if(checkNumber(n)) {
				count++;
				if(count == 200) {
					System.out.println("Số nguyên tố thứ 200 là: " + n);;
				}
			}
			n++;
		}
	}
	
	public static boolean checkNumber(int number) {
		for(int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}
