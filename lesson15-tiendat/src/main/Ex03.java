package main;

import java.util.Arrays;
import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chuỗi thứ nhất: ");
        String str1 = scanner.nextLine();

        System.out.print("Nhập chuỗi cần kiểm tra: ");
        String str2 = scanner.nextLine();

        boolean areAnagrams = areAnagrams(str1, str2);

        if (areAnagrams) {
            System.out.println("Kết quả: True - Đây là đảo ngữ.");
        } else {
            System.out.println("Kết quả: False - Đây không phải là đảo ngữ.");
        }
    }

    private static boolean areAnagrams(String str1, String str2) {
        char[] charArray1 = str1.replaceAll("\\s", "").toLowerCase().toCharArray();
        char[] charArray2 = str2.replaceAll("\\s", "").toLowerCase().toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1, charArray2);
    }
}
