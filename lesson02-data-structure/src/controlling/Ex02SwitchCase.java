package controlling;

import java.util.Random;

public class Ex02SwitchCase {
	public static void main(String[] args) {
		int weekday = new Random().nextInt(2,9);
		switch(weekday) {
		case 2:
			System.out.println("Thứ 2");
			break;
		case 3:
			System.out.println("Thứ 3");
			break;
		case 4:
			System.out.println("Thứ 4");
			break;
		case 5:
			System.out.println("Thứ 5");
			break;
		case 6:
			System.out.println("Thứ 6");
			break;
		case 7:
			System.out.println("Thứ 7");
			break;
		case 8:
			System.out.println("Thứ 8");
			break;
		default:
			System.out.println("Không hợp lệ");
		}
		
		
		switch(weekday) {
		case 2,3,4,5,6:
			System.out.println("Ngày trong tuần");
			break;
		
		case 7,8:
			System.out.println("Ngày cuối tuần");
			break;
		default:
			System.out.println("Không hợp lệ");
		}
	
		String s = switch(weekday) {
			case 2,3,4,5,6 ->"Ngay trong tuan";
			case 7,8->"Ngay cuoi tuan";
			default->"khong hop le";
		};
		System.out.println("s--->"+s);
	}
}
