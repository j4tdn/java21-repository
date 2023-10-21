package view;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex02CheckValidPassword {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			do {
				System.out.print("Nhập mật khẩu muốn đăng ký: ");
				String password = sc.nextLine();
				try {
					
					isValid(password);
					System.out.println("Đăng ký mật khẩu thành công");
					break;
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
			}while(true);
		}
		
		public static boolean isValid(String s) throws Exception {
			if(s.length()<8) {
				throw new Exception("Password phải nhiều hơn 8 kí tự");
			} 
			if(s.length()>256) {
				throw new Exception("Password phải ít hơn 256 kí tự");
			}
			if(!Pattern.matches(".*[a-z].*", s)) {
				throw new Exception("phải có 1 ký tự viết thường");
			}
			if(!Pattern.matches(".*[A-Z].*", s)) {
				throw new Exception("phải có 1 ký tự viết hoa");
			}
			if(!Pattern.matches(".*[1-9].*", s)) {
				throw new Exception("phải có 1 ký tự số");
			}
			if(!Pattern.matches(".*[^a-zA-Z0-9].*", s)) {
				throw new Exception("phải có 1 ký đặc biệt");
			}
			return true;
		}
	}

