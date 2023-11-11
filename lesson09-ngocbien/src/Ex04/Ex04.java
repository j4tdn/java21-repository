package Ex04;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account name: ");
		String accountName = sc.nextLine();
		String password;
		
		do {
			System.out.println("Enter password: ");
			password = sc.nextLine();
			if(isValidPassword(accountName, password)) {
				System.out.println("successfully!");
				break;
			}
		} while (true);
		
		sc.close();
	}
	
	private static boolean isValidPassword(String accountName, String password ) {
		
		if(password.length() > 8) {
			return false;
		}
		
		// ít nhất 1 chữ số, 1 kí tự in hoa, và 1 kí tự đặc biệt
		if (!password.matches(".*\\d.*") || !password.matches(".*[A-Z].*") || !password.matches(".*[~!@#$%^&*].*")) {
            return false;
        }
		
		int count = 0;
		for(int i = 0; i < accountName.length() -2; i++) {
			String substring = accountName.substring(i, i+3);
			if(password.contains(substring)) {
				count++;
				if(count > 3) {
					return false;
				}
			}
		}
		return true;
		
	}
}
