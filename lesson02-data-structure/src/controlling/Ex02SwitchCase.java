package controlling;

import java.util.Random;

public class Ex02SwitchCase {
	
	public static void main(String[] args) {
		
		// ngày trong tuần
		
		//thứ 2 --> cn
		//thứ 2(2), thứ 3(3) ....chủ nhật(8)
		
		int weekday = new Random().nextInt(2, 10);
		
		System.out.println("weekday --> " + weekday);
		
		switch(weekday) {
		case 2:
			System.out.println("thứ hai");
			break;
		case 3:
			System.out.println("thứ ba");
			break;
		case 4:
			System.out.println("thứ tư");
			break;
		case 5:
			System.out.println("thứ năm");
			break;
		case 6:
			System.out.println("thứ sáu");
			break;
		case 7:
			System.out.println("thứ bảy");
			break;
		case 8:
			System.out.println("chủ nhật");
			break;
		default:
			System.out.println("không hợp lệ");
		}
		System.out.println("Exit");
	}

}
