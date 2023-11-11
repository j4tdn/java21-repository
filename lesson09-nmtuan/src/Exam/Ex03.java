package Exam;

import java.util.Arrays;
import java.util.Comparator;

public class Ex03 {
    public static void main(String[] args) {
        int[] arr = {8, 5, 9, 20};

        sortByLevel(arr);

        System.out.print("Kết quả sau khi đã sắp xếp: ");
        for (int a = 0; a < arr.length; a++) {
            System.out.print(arr[a]);
            if (a != arr.length - 1) {
                System.out.print(", ");
            }
        }
    }

    public static void sortByLevel(int[] arr) {
        Integer[] arrWrapper = new Integer[arr.length];
        for (int a = 0; a < arr.length; a++) {
            arrWrapper[a] = arr[a];
        }

        Arrays.sort(arrWrapper, Comparator.comparingInt(Ex03::countFactors));

        for (int b = 0; b < arr.length; b++) {
            arr[b] = arrWrapper[b];
        }
    }

    public static int countFactors(int number) {
        int count = 0;
        for (int b = 1; b <= number; b++) {
            if (number % b == 0) {
                count++;
            }
        }
        return count;
    }
}