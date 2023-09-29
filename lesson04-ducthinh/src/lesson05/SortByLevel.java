package lesson05;

import java.util.Arrays;
import java.util.Comparator;

public class SortByLevel {
    public static void main(String[] args) {
        int[] arr = {8, 5, 9, 20};
        int n = arr.length;

        // Sắp xếp mảng theo level tăng dần
        sortByLevel(arr, n);

        // In mảng sau khi đã sắp xếp
        System.out.println("Mảng sau khi đã sắp xếp theo level tăng dần:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    // Hàm tính level của một số tự nhiên
    public static int getLevel(int num) {
        int level = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                level++;
            }
        }
        return level;
    }

    // Hàm sắp xếp mảng theo level tăng dần sử dụng Comparator
    public static void sortByLevel(int[] arr, int n) {
        Integer[] arrWithLevels = new Integer[n];

        // Tính level cho từng số trong mảng
        for (int i = 0; i < n; i++) {
            arrWithLevels[i] = arr[i];
        }

        // Sắp xếp mảng dựa trên level sử dụng Comparator
        Arrays.sort(arrWithLevels, Comparator.comparingInt(SortByLevel::getLevel));

        // Sao chép lại các giá trị đã sắp xếp vào mảng gốc
        for (int i = 0; i < n; i++) {
            arr[i] = arrWithLevels[i];
        }
    }
}

