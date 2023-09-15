package controlling;

public class Ex03For {
	
	public static void main(String[] args) {
		
		// in ra các số nguyên không âm nhỏ hơn 10
		
//		for (int i = 0; i < 10; i++) {
//			System.out.println(i);
//		}
		
		int i = 0;
		for (;;) {
			System.out.println(i);
			if (i == 9) {
				break;
			}
			i++;
			
		}
	}
}
