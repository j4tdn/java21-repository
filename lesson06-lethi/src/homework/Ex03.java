package homework;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex03 {

    public static boolean validateEmail(String email) {
        String emailRegex = "^[A-Za-z0-9]+[A-Za-z0-9_\\-.]*[A-Za-z0-9]*@[A-Za-z]+\\.[A-Za-z]{2,}$";
        String combinedRegex = "^(?!.*[-.]{2})(?!.*-@)(?!.*\\.\\..*@)(?!^\\..*@)(?!.*#.*@)" + emailRegex;
        Pattern pattern = Pattern.compile(combinedRegex);
        Matcher matcher = pattern.matcher(email);

        return matcher.matches();
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Nhập email: ");
                String email = ip.nextLine();

                if (validateEmail(email)) {
                    System.out.println("Email hợp lệ!");
                    break;
                } else {
                    throw new IllegalArgumentException("Email không hợp lệ!");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Lỗi! " + e.getMessage());
            }
        }

        ip.close();
    }
}

