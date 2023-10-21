package bt2;

import java.util.Scanner;

public class PasswordValidation {
public static void main(String[] args) {
	CheckPassWord cp = new CheckPassWord();
	 Scanner scanner = new Scanner(System.in);

     while (true) {
         try {
             System.out.println("Đăng ký tài khoản");
             System.out.print("Nhập mật khẩu: ");
             String password = scanner.nextLine();

         cp.validatePassword(password);

             System.out.println("Mật khẩu hợp lệ. Đăng ký thành công!");
             break;
         } catch (IllegalArgumentException e) {
             System.err.println(e.getMessage());
         }
     }

     scanner.close();
 }
}

