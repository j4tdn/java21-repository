package bt3;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class EmailValidation {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.print("Nhập địa chỉ email: ");
	            String email = scanner.nextLine();

	            if (isValidEmail(email)) {
	                System.out.println("Địa chỉ email hợp lệ: " + email);
	                break;
	            } else {
	                System.out.println("Lỗi: Địa chỉ email không hợp lệ. Vui lòng thử lại.");
	            }
	        }

	        scanner.close();
	    }

	    public static boolean isValidEmail(String email) {
	       
	        String emailPattern = "^[a-zA-Z0-9_.\\-]+@[a-zA-Z0-9]+(\\.[a-zA-Z]+)+$";
	        Pattern pattern = Pattern.compile(emailPattern);
	        Matcher matcher = pattern.matcher(email);

	        return matcher.matches();
	    }
}
