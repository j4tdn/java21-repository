package exercises;

import java.util.Scanner;

public class exercises03 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhập một số nguyên để tính giai thừa: ");
        int num = in.nextInt();
        System.out.println("Giai thừa của " + num + " là: " + factorial(num));
        in.close();
    }

    public static int factorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

}
