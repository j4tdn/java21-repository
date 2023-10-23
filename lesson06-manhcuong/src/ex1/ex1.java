package ex1;

import java.util.Scanner;

public class ex1 {
	 private static final String ENTER_A_MESSAGE = "Nhập giá trị của a: ";
	    private static final String ENTER_B_MESSAGE = "Nhập giá trị của b: ";
	    private static final String ERROR_MESSAGE = "Lỗi: Vui lòng nhập một số nguyên.";

	    private static Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        int a, b;
	        float x;

	        while (true) {
	            a = manualInput(ENTER_A_MESSAGE);
	            if (a == 0) {
	                System.out.println("Lỗi: a không được bằng 0. Vui lòng nhập lại.");
	                continue;
	            }

	            b = manualInput(ENTER_B_MESSAGE);

	            x = -(float) b / a;
	            break;
	        }

	        String equation = (b == 0) ? a + "x = 0" : (b > 0) ? a + "x + " + b + " = 0" : a + "x - " + Math.abs(b) + " = 0";
	        System.out.println("Phương trình bậc nhất: " + equation);
	        System.out.println("Nghiệm của phương trình: x = " + x);

	        scanner.close();
	    }

	    private static int manualInput(String message) {
	        int input;
	        while (true) {
	            try {
	                System.out.print(message);
	                input = Integer.parseInt(scanner.nextLine());
	                break;
	            } catch (NumberFormatException e) {
	                System.out.println(ERROR_MESSAGE);
	            }
	        }
	        return input;
	    }

}
