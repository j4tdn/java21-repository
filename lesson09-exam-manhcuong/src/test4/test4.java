package test4;

import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tên tài khoản: ");
        String username = scanner.nextLine();

        while (true) {
            System.out.print("Nhập mật khẩu: ");
            String password = scanner.nextLine();

            if (isValidPassword(username, password)) {
                System.out.println("Đăng ký tài khoản thành công!");
                break;
            } else {
                System.out.println("Lỗi: " + getErrorReason(username, password));
                System.out.println("Vui lòng nhập lại.");
            }
        }

        scanner.close();
    }

    private static boolean isValidPassword(String username, String password) {
        if (password.length() < 8) {
            return false;
        }

        boolean hasDigit = false;
        boolean hasUpperCase = false;
        boolean hasSpecialChar = false;

        for (char ch : password.toCharArray()) {
            if (Character.isDigit(ch)) {
                hasDigit = true;
            } else if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
            } else if ("~!@#$%^&*".indexOf(ch) != -1) {
                hasSpecialChar = true;
            }
        }

        if (!(hasDigit && hasUpperCase && hasSpecialChar)) {
            return false;
        }

        int count = 0;
        for (char ch : username.toCharArray()) {
            if (password.contains(String.valueOf(ch))) {
                count++;
                if (count > 3) {
                    return false;
                }
            }
        }

        return true;
    }

    private static String getErrorReason(String username, String password) {
        if (password.length() < 8) {
            return "Mật khẩu phải có ít nhất 8 ký tự.";
        }

        boolean hasDigit = false;
        boolean hasUpperCase = false;
        boolean hasSpecialChar = false;

        for (char ch : password.toCharArray()) {
            if (Character.isDigit(ch)) {
                hasDigit = true;
            } else if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
            } else if ("~!@#$%^&*".indexOf(ch) != -1) {
                hasSpecialChar = true;
            }
        }

        if (!(hasDigit && hasUpperCase && hasSpecialChar)) {
            return "Mật khẩu phải chứa ít nhất 1 chữ số, 1 kí tự in hoa và 1 kí tự đặc biệt (~!@#$%^&*).";
        }

        int count = 0;
        for (char ch : username.toCharArray()) {
            if (password.contains(String.valueOf(ch))) {
                count++;
                if (count > 3) {
                    return "Mật khẩu không được trùng quá 3 ký tự với tên tài khoản.";
                }
            }
        }

        return "";
    }
}

