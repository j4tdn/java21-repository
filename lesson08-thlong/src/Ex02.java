import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner ip =  new Scanner(System.in);
		while (true) {
			try {
				System.out.println("Nhập họ và tên: ");
				String str = ip.nextLine();
				checkSpecial(str);
				System.out.println(switchString(str));
				break;
			} catch (IllegalArgumentException e) {
				System.out.println("ef -> " + e.getMessage());
			}
		}
	}
	
	private static void checkSpecial(String password) {
		
		if (!password.matches(".*[a-zA-Z].*")) {
			throw new IllegalArgumentException("Họ tên nhập vào chỉ bao gồm các kí tự [A-Za-z ]");
		}
	}
	
	public static String switchString(String str) {
		char[] strs = str.toLowerCase().toCharArray();
		boolean found = false;
		
		for (int i = 0; i < strs.length; i++) {
			if (!found && Character.isLetter(strs[i])) {
				strs[i] = Character.toUpperCase(strs[i]);
				found = true;
			} else if (Character.isWhitespace(strs[i]) || strs[i]=='.' || strs[i]=='\'') {
				found = false;
			}
		}
		return String.valueOf(strs);
	}
	
}
