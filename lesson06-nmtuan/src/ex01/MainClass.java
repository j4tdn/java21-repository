
package ex01;

	import java.util.Scanner;

	public class MainClass {
		static Scanner sc = new Scanner(System.in);

		public static void main(String[] args) {
			int a = input();
			int b = input();
			int c = divide(a, b);
			System.out.println("Result: " + c);
		}

		private static int divide(int a, int b) {
			int number;
			while (true) {
				try {
					number = a / b;
					break;
				} catch (Exception e) {
					if (e instanceof NumberFormatException) {
						System.out.println("Vui lòng nhập số");
					} else {
						System.out.println("Mẫu không được là số 0");
					}
				}
			}
			return number;
		}

		private static int input() {
			int number;
			
			while(true) {
				System.out.print("Nhập số: ");
				try {
					number = Integer.parseInt(sc.nextLine());
					System.out.println("Số hợp lệ");
					break;
				} catch (NumberFormatException e) {
					System.out.println("Số không hợp lệ!");
				}
			}
			return number;
		}
	}

