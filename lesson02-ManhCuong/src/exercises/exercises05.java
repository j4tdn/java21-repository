package exercises;

import java.util.Scanner;

public class exercises05 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;

        while (true) {
            System.out.print("Nhập một số nguyên dương có ít nhất 2 chữ số: ");
            String input = scanner.nextLine();

            try {
                N = Integer.parseInt(input);

                if (N < 10) {
                    System.out.println("Số không hợp lệ. Vui lòng nhập lại.");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Số không hợp lệ. Vui lòng nhập lại.");
            }
        }

        boolean isPalindrome = isPalindrome(N);
        if (isPalindrome) {
            System.out.println(N + " là số đối xứng.");
        } else {
            System.out.println(N + " không phải là số đối xứng.");
        }

        scanner.close();
    }

    private static boolean isPalindrome(int number) {
        String strNumber = Integer.toString(number);
        int left = 0;
        int right = strNumber.length() - 1;

        while (left < right) {
            if (strNumber.charAt(left) != strNumber.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}



