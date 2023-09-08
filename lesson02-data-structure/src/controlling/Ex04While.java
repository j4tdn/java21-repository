package controlling;

public class Ex04While {

	public static void main(String[] args) {
		// in ra các số nguyên lẻ không âm nhỏ hơn 20 --> sử dụng while
		
		int i = 1;
		int n = 20;
		while(i < n) {
			System.out.println("i --> " +i);
			i +=2;
		}
	}

}
