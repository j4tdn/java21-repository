package controlling;

import java.util.Random;

public class Ex02SwitchCase {
	public static void main(String[] args) {
		
		//Ngày trong tuần
			
		// Thứ 2 --> Chủ nhật
		// Thứ hai, thứ 3 .... chủ nhật 8
		
		int weekday = new Random().nextInt(2 ,9);
		
		System.out.println("weekday -->" + weekday);
		
		switch (weekday) {
		case 2: {
			System.out.println("Thứ 2");
			break;
		}
		case 3: {
			System.out.println("Thứ 3");
			break;
		}
		case 4: {
			System.out.println("Thứ 4");
			break;
		}
		case 5: {
			System.out.println("Thứ 5");
			break;
		}
		case 6: {
			System.out.println("Thứ 6");
			break;
		}
		case 7: {
			System.out.println("Thứ 7");
			break;
		}
		case 8: {
			System.out.println("Thứ 8");
			break;
		}
		default:
			System.out.println("Không hợp lệ");
		}
		
		System.out.println("Exit");
		
		switch (weekday) {
		case 2:		
		case 3: 
		case 4: 
		case 5: 
		case 6: {
			System.out.println("Thứ 6");
			break;
		}
		case 7: 
		case 8: {
			System.out.println("Thứ 8");
			break;
		}
		default:
			System.out.println("Không hợp lệ");
		}
	}
}
