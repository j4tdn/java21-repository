package test3;

import java.util.Scanner;

public class test3 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Nhập chuỗi kí tự: ");
	        String input = scanner.nextLine();

	        String result = revert(input);
	        System.out.println("Kết quả: " + result);

	        scanner.close();
	    }

	    private static String revert(String s) {
	        String trimmedString = s.trim().replaceAll("\\s+", " ");

	        StringBuilder reversedString = new StringBuilder(trimmedString).reverse();

	        return reversedString.toString();
	    }
	}

