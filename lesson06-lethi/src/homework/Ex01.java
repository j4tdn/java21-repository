package homework;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);

		double a, b;

		do {
			try {
				System.out.print("Nhập a = ");
				a = Double.parseDouble(ip.nextLine());

				if (a == 0) {
					throw new ArithmeticException("Lỗi! a phải khác 0");
				} else {
					break;
				}
			} catch (NumberFormatException e) {
				System.out.println("Nhập số Không hợp lệ");
			} catch (ArithmeticException e) {
				System.out.println(e.getMessage());
			}

		} while (true);

		do {
			try {
				System.out.print("Nhập b = ");
				b = Double.parseDouble(ip.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("Nhập số Không hợp lệ");
			}

		} while (true);

		double x = (int)-b / a;
		System.out.println("x = " + x);

		ip.close();

	}

}
