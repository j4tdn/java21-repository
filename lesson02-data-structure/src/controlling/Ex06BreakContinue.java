package controlling;

public class Ex06BreakContinue {
	public static void main(String[] args) {
		// continue
		// sử dụng trong vòng lặp--> kết thúc sớm lần lặp hiện tại, nhảy qua lần lặp
		// tiếp theo

		// break
		// sử dụng trong switch case --> thoát khỏi biểu thức switch case khi gặp lệnh
		// break
		// sử dụng trong vòng lặp--> thoát khỏi toàn bộ vòng lặp hiện tại
		for (int i = 0; i < 10; i++) {
			System.out.println("i1--->" + i);
			if (i == 2) { //1,2,3,4,5
				continue;
			}
			if (i == 5) { //0,1,3,4 --> vì khi continue thì nó bỏ qua câu lệnh dưới
				break;
			}
				System.out.println("i2--->" + i);
			}
		}
	}
