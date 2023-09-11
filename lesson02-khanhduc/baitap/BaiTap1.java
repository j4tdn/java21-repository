package baitap;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BaiTap1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (count < 5) {
            try {
                System.out.println("Enter a positive integer:");
                int a = sc.nextInt();

                if (a > 0) {
                    if (a % 2 == 0) {
                        System.out.println(a + " is a multiple of 2");
                    } else {
                        System.out.println(a + " not a multiple of 2");
                    }
                    count++;
                } else {
                    System.out.println("The number must be a positive integer. Please re-enter.");
                    sc.nextLine();
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Please re-enter a valid positive integer.");
                sc.nextLine();
            }
        }
    }
}
