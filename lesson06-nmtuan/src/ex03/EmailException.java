

	package ex03;

	import java.util.Scanner;

	public class EmailException {
		public static void main(String[] args) {
			String email = getEmail();
			System.out.println("Your email: " + email);
		}

		private static String getEmail() {
			String tmpEmail;
			String pattern = "\\w+@\\w+(\\.\\w+){1,2}";
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Nhập email: ");
			tmpEmail = sc.nextLine();

			while (!tmpEmail.matches(pattern)) {
				System.out.println("Email không hợp lệ!");
				System.out.print("Nhập email: ");
				tmpEmail = sc.nextLine();
			}
			
			return tmpEmail;
		}
	}

