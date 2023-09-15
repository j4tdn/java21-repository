package controlling;

public class Ex06BreakContinue {

	// continue
	// sử dụng trong vòng lặp --> kết thúc sớm lần lặp hiện tại, nhảy qua lần lặp tiếp theo
	
	
	// break: 
	// sử dụng trong switch case --> thoát khỏi biểu thức switch case khi gặp lệnh break
	// sử dụng trong vòng lặp --> thoát khỏi toàn bộ vòng lặp hiện tại
	
	public static void main(String[] args) {
	
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			if (i == 7) {
				continue;
			}
		
			if (i == 2) {
				break;
			}
			System.out.println(i);
		}
}
}

	

