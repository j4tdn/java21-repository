package bai5;

import java.util.Scanner;

public class Main {
    public static String findLCS(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();

        int[][] lcsTable = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    lcsTable[i][j] = lcsTable[i - 1][j - 1] + 1;
                } else {
                    lcsTable[i][j] = Math.max(lcsTable[i - 1][j], lcsTable[i][j - 1]);
                }
            }
        }

        int length = lcsTable[m][n];
        char[] lcs = new char[length];

        int i = m, j = n;
        while (i > 0 && j > 0) {
            if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                lcs[length - 1] = s1.charAt(i - 1);
                i--;
                j--;
                length--;
            } else if (lcsTable[i - 1][j] > lcsTable[i][j - 1]) {
                i--;
            } else {
                j--;
            }
        }
        return new String(lcs);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("S1: ");
        String s1 = scanner.next();
        System.out.print("S2: ");
        String s2 = scanner.next();
        scanner.close();

        String result = findLCS(s1, s2);
        System.out.println("Output: " + result);
    }
}
