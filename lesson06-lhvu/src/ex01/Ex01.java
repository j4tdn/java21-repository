package ex01;
	import java.util.Scanner;

	public class Ex01 {

		public static void main(String[] args) {

			Scanner ip = new Scanner(System.in);
			int a;
			int b;
			do {
				try {
					System.out.print("Enter a:");
					a = Integer.parseInt(ip.nextLine());

					System.out.print("Enter b:");
					b = Integer.parseInt(ip.nextLine());
					if (a == 0) {
						throw new ArithmeticException("Enter a # 0");
					}

					break;
				} catch (NumberFormatException | ArithmeticException e) {
					System.out.println(e.getMessage());
					System.out.println("Please enter again:");
				}

			} while (true);
			System.out.println("=============");
			System.out.println("Ax + b = 0");
			System.out.println("x= -b/a = " + divide(a, b));
			ip.close();
		}

		private static float divide(int a, int b) {
			float x = (float) -b / a;

			return (float) x;
		}
	}
