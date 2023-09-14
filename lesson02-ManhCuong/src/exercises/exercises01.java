package exercises;

import java.io.PrintStream;

public class exercises01 {
	public static void main(String[] args, PrintStream scanner) {
        int count = 0;

        while (count < 5) {
            System.out.print("Nhập một số nguyên dương N: ");
            String input = System.console().readLine();

            try {
                int N = Integer.parseInt(input);

                if (N > 0) {
                    if (N % 2 == 0) {
                        System.out.println(N + " là bội của 2.");
                    } else {
                        System.out.println(N + " không phải là bội của 2.");
                    }
                    break;
                } else {
                    System.out.println("Số không hợp lệ. Vui lòng nhập lại.");
                    count++;
                }
            } catch (NumberFormatException e) {
                System.out.println("Số không hợp lệ. Vui lòng nhập lại.");
                count++;
            }

        if (count >= 5) {
            System.out.println("Đã vượt quá số lần nhập tối đa. Kết thúc chương trình.");
        }
        
        scanner.close();
    }
}


