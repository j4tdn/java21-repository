package baitap;

import java.util.Scanner;

public class BaiTap5 {
	    public static boolean isDoiXung(int N) {
	        int reversedNumber = 0;
	        int originalNumber = N;

	        while (N != 0) {
	            int digit = N % 10;
	            reversedNumber = reversedNumber * 10 + digit;
	            N /= 10;
	        }

	        return originalNumber == reversedNumber;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int N;

	        do {
	            System.out.print("Nhập một số nguyên dương có tối thiểu 2 chữ số: ");
	            if (scanner.hasNextInt()) {
	                N = scanner.nextInt();
	                if (N < 10) {
	                    System.out.println("Số phải có ít nhất 2 chữ số. Hãy nhập lại.");
	                }
	            } else {
	                System.out.println("Không phải số nguyên. Hãy nhập lại.");
	                scanner.next(); // Xóa dữ liệu nhập sai
	                N = 0;
	            }
	        } while (N < 10);

	        boolean ketQua = isDoiXung(N);

	        if (ketQua) {
	            System.out.println(N + " là số đối xứng.");
	        } else {
	            System.out.println(N + " không phải là số đối xứng.");
	        }

	        scanner.close();
	    }
	}
