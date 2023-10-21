package lesson06_baitap;

import java.util.Scanner;

public class bai3 {
    
	private static final Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        Exception exception = new Exception();
        while (true) {
            try {
                System.out.print("Nhập email: ");
                String email = sc.nextLine();

                if (exception.validateEmail(email)) {
                    System.out.println("Email hợp lệ. ");
                    System.out.println("Email sao khi được nhập là: " + email);
                    break;
                } else {
                    throw new IllegalArgumentException("Email không hợp lệ!");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Lỗi! " + e.getMessage());
            }
        }
     
        sc.close();
    }
}