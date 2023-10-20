package ex03_checkemail;

import java.util.Scanner;

public class Ex03CheckEmail {
    public static boolean isValidEmail(String email) {
        // Kiểm tra từng quy tắc
        if (email == null || email.isEmpty()) {
            return false;
        }

        String[] parts = email.split("@");
        if (parts.length != 2) {
            return false;
        }

        String prefix = parts[0];
        String domain = parts[1];

        if (prefix.isEmpty() || domain.isEmpty()) {
            return false;
        }

        String[] domainParts = domain.split("\\.");
        if (domainParts.length < 2) {
            return false;
        }

        for (char c : prefix.toCharArray()) {
            if (!(Character.isLetter(c) || Character.isDigit(c) || c == '_' || c == '.' || c == '-')) {
                return false;
            }
        }

        for (String part : domainParts) {
            if (part.isEmpty() || !part.matches("[a-zA-Z]+")) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Input address Email: ");
            String email = scanner.nextLine();
            
            if (isValidEmail(email)) {
                System.out.println("Valid Email: " + email);
                break;
            } else {
                System.out.println("Invalid email, please input again.");
            }
        }
        
       
    }
}

