package view.exam;

public class Ex04RegisterAccount {
	public static void main(String[] args) {
		 registerAccount();
	}
	
	// register Account function
	public static void  registerAccount() {
		String username = Utility.getString("Enter username: ", false);
		String password;
		while(true) {
			password = Utility.getString("Enter password: ", false);
			if(isValidPassword(password, username)) {
				break;
			}
		}
		System.out.println("=======Register successfully=========");
	}
	
	// check valid password function
	public static boolean isValidPassword(String password, String username) {
		// requirement 1: lenght of passwork >= 8
		if(password.length()<8) {
			System.out.println("Password must be least 8 characters");
			return false;
		}
		// requirement 2: password must constain least 1 digit, 1 uppercase and 1 special character
		if (!password.matches(".*\\d.*") || !password.matches(".*[A-Z].*") || !password.matches(".*[~!@#$%^&*].*")) {
			System.out.println("password must constain least 1 digit, 1 uppercase and 1 special character");
			return false;
		}
		// requirement 3: password doesn't loop more 3 character
		for(int i=0; i<password.length()-3; i++) {
			String subString = password.substring(i, i+4);
			if(username.contains(subString)) {
				System.out.println("password doesn't loop more 3 character");
				return false;
			}
		}
		return true;
	}
}
