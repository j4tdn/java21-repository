package controlling;

public class Ex04While {
	public static void main(String[] args) {
		int n = 20;
		while(n >= 0) {
			if(n % 2 == 1) {
				System.out.println(n);
			}
			n--;
		}
	}
}
