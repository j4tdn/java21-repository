package controlling;

public class Ex06BreakContinue {
	public static void main(String[] args) {
		//continue 
		// sử dụng trong vòng lặp --> kết thúc sớm lần lặp hiện tại, nhảy qua cái lần lặp tiếp theo
		
		
		// break
		// su dung trong switch case
		// su dung trong vong lap --> thoat khoi toàn bộ vong lap hien tai
		
		for (int i = 0; i <= 10; i++) {
			System.out.println("i1---> " +i);
			if (i == 2) {
				continue;
			}
			
			if (i == 5) {
				break;
			}
			
			System.out.println("i2---> " +i);
		}
	}
}
