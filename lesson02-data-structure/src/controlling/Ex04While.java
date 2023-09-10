package controlling;

public class Ex04While {

	public static void main(String[] args) {
		
		// in ra các số nguyên lẻ ko âm nhỏ hơn 20 --> sử dụng while
		
		int n = 20;
		int i = 0;

		while (i < n) {
			if (i % 2 != 0) {
				System.out.println("i --> " + i);
			i+=2;
			}
			 //i++;
		}
	}

}
