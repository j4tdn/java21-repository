package ex02_password;

import java.util.Scanner;

// --
public class PasswordVerifier {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your password: ");
        while (true) {
            try {
                String inputPass = input.nextLine();
                verifyPassword(inputPass);
                System.out.println("Password creation is successful.");
                System.out.println("Your password has been sent to your email.");
                break;
            } catch (PasswordVerificationException e) {
                System.out.println(e.getMessage());
                System.out.print("Please input your password again: ");
            }
        }

        input.close();
        System.out.println("=====Finished=====");
    }

    private static void verifyPassword(String password) throws PasswordVerificationException {
        verifyLength(password);
        verifyLowercase(password);
        verifyUppercase(password);
        verifyNumber(password);
        verifySpecialCharacter(password);
    }

    private static void verifyLength(String password) throws PasswordVerificationException {
        if (password.length() < 8) {
            throw new PasswordVerificationException("Password must be at least 8 characters long.");
        } else if (password.length() > 256) {
            throw new PasswordVerificationException("Password cannot exceed 256 characters.");
        }
    }

    private static void verifyLowercase(String password) throws PasswordVerificationException {
        if (!password.matches(".*[a-z].*")) {
            throw new PasswordVerificationException("Password must contain at least 1 lowercase character.");
        }
    }

    private static void verifyUppercase(String password) throws PasswordVerificationException {
        if (!password.matches(".*[A-Z].*")) {
            throw new PasswordVerificationException("Password must contain at least 1 uppercase character.");
        }
    }

    private static void verifyNumber(String password) throws PasswordVerificationException {
        if (!password.matches(".*\\d.*")) {
            throw new PasswordVerificationException("Password must contain at least 1 digit.");
        }
    }

    private static void verifySpecialCharacter(String password) throws PasswordVerificationException {
        if (!password.matches(".*\\W.*")) {
            throw new PasswordVerificationException("Password must contain at least 1 special character.");
        }
    }
}