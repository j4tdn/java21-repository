package view.string.exercises;

import java.util.ArrayList;

public class Ex05FindLongestCommonSubstring {
    public static void main(String[] args) {
        String s1 = Utility.getStringUpperCase("Enter String s1 (A-Z)", false);
        String s2 = Utility.getStringUpperCase("Enter String s2 (A-Z)", false);
        String lcs = findLongestCommonSubstring(s1, s2);
        System.out.println(lcs);
    }

    public static String findLongestCommonSubstring(String s1, String s2) {
        StringBuilder result = new StringBuilder();
        String[] s1Arr = s1.split("");
        String[] s2Arr = s2.split("");
        int max = 0;

        for (int i = 0; i < s1Arr.length; i++) {
            for (int j = 0; j < s2Arr.length; j++) {
                if (s1Arr[i].equals(s2Arr[j])) {
                    int k = i;
                    int l = j;
                    while (k < s1Arr.length && l < s2Arr.length && s1Arr[k].equals(s2Arr[l])) {
                        result.append(s1Arr[k]);
                        k++;
                        l++;
                    }
                    if (result.length() > max) {
                        max = result.length();
                    }
                    result.setLength(0);
                }
            }
        }

        return result.toString();
    }
}
