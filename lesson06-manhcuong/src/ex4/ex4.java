package ex4;

import java.util.Scanner;

public interface ex4 {
	 static final String[] UNITS = {"", "Một", "Hai", "Ba", "Bốn", "Năm", "Sáu", "Bảy", "Tám", "Chín"};
	    static final String[] TENS = {"", "Mười", "Hai mươi", "Ba mươi", "Bốn mươi", "Năm mươi", "Sáu mươi", "Bảy mươi", "Tám mươi", "Chín mươi"};

	    public static String convertToWords(int n) {
	        if (n < 0 || n > 999) {
	            return "Số không hợp lệ";
	        }

	        if (n == 0) {
	            return "Không";
	        }

	        StringBuilder words = new StringBuilder();

	        if (n <= 9) {
	            words.append(UNITS[n]);
	        } else if (n <= 99) {
	            int unitDigit = n % 10;
	            int tenDigit = n / 10;
	            if (unitDigit == 0) {
	                words.append(TENS[tenDigit]);
	            } else {
	                words.append(TENS[tenDigit]).append(" ").append(UNITS[unitDigit]);
	            }
	        } else {
	            int hundredDigit = n / 100;
	            int remainingDigits = n % 100;
	            if (remainingDigits == 0) {
	                words.append(UNITS[hundredDigit]).append(" trăm");
	            } else if (remainingDigits <= 9) {
	                words.append(UNITS[hundredDigit]).append(" trăm linh ").append(UNITS[remainingDigits]);
	            } else {
	                words.append(UNITS[hundredDigit]).append(" trăm ").append(convertToWords(remainingDigits));
	            }
	        }

	        return words.toString();
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Nhập các số bạn muốn chuyển đổi: ");
	        int n = scanner.nextInt();

	        System.out.println("Nhập " + n + " số:");
	        for (int i = 0; i < n; i++) {
	            int number = scanner.nextInt();
	            System.out.println("Số " + number + " được viết thành chữ là: " + convertToWords(number));
	        }

	        scanner.close();
	    }
	}

