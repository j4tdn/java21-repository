package ex02_checkpassword;

import java.util.Scanner;

public class Ex02 {

    static class PasswordLengthException extends Exception {
        public PasswordLengthException() {
            super("Password must be at least 8 letters and at most 256 letters!");
        }
    }

    static class LowercaseMissingException extends Exception {
        public LowercaseMissingException() {
            super("Password must contain at least 1 lowercase letter.");
        }
    }

    static class UppercaseMissingException extends Exception {
        public UppercaseMissingException() {
            super("Password must contain at least 1 uppercase letter.");
        }
    }

    static class SpecialCharacterMissingException extends Exception {
        public SpecialCharacterMissingException() {
            super("Password must contain at least 1 special character (!@#$%^&*()-_+=).");
        }
    }

    static class NumberMissingException extends Exception {
        public NumberMissingException() {
            super("Password must contain at least 1 number.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Enter a new password: ");
                String password = input.nextLine();
                validatePassword(password);
                System.out.println("Valid password, registration successful.");
                break;
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    public static void validatePassword(String password) throws Exception {
        if (password.length() < 8 || password.length() > 256) {
            throw new PasswordLengthException();
        }

        if (!password.matches(".*[a-z].*")) {
            throw new LowercaseMissingException();
        }

        if (!password.matches(".*[A-Z].*")) {
            throw new UppercaseMissingException();
        }

        if (!password.matches(".*[!@#$%^&*()-_+=].*")) {
            throw new SpecialCharacterMissingException();
        }

        if (!password.matches(".*\\d.*")) {
            throw new NumberMissingException();
        }
    }
}
