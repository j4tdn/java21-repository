package exercises;

import java.util.Scanner;

public class exercises02 {
	public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int count = 0;

        while (count < 5) {
            System.out.print("Nhập một số nguyên dương N: ");
            String input = x.nextLine();

            try {
                int N = Integer.parseInt(input);

                if (N <= 0) {
                    System.out.println("Số không hợp lệ. Vui lòng nhập một số nguyên dương.");
                } else if (isPowerOf2(N)) {
                    System.out.println(N + " là lũy thừa của 2.");
                } else {
                    System.out.println(N + " không phải là lũy thừa của 2.");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Số không hợp lệ. Vui lòng nhập lại.");
                count++;
            }
        }

        if (count >= 5) {
            System.out.println("Đã vượt quá số lần nhập tối đa. Kết thúc chương trình.");
        }

        x.close();
    }

    private static boolean isPowerOf2(int number) {
        return (number != 0) && ((number & (number - 1)) == 0);
    }
}

