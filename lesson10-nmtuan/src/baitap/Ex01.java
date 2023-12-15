package baitap;

import java.util.*;

public class Ex01 {
    public static void main(String[] args) {
        int n = 10; // Số phần tử trong mảng
        int[] array = generateRandomArray(n);

        System.out.println("Mảng ban đầu:");
        printArray(array);

        int[] uniqueArray = removeDuplicates(array);
        System.out.println("Mảng sau khi loại bỏ phần tử trùng nhau:");
        printArray(uniqueArray);

        int half = n / 2;
        double avgFirstHalf = calculateAverage(Arrays.copyOfRange(uniqueArray, 0, half));
        double avgSecondHalf = calculateAverage(Arrays.copyOfRange(uniqueArray, half, n));

        System.out.println("Giá trị trung bình của n/2 phần tử đầu tiên: " + avgFirstHalf);
        System.out.println("Giá trị trung bình của n/2 phần tử cuối cùng: " + avgSecondHalf);

        int thirdLargest = findThirdLargest(uniqueArray);
        System.out.println("Số lớn thứ 3 trong mảng: " + thirdLargest);
    }

    public static int[] generateRandomArray(int n) {
        Random random = new Random();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int[] removeDuplicates(int[] array) {
        Set<Integer> uniqueSet = new HashSet<>();
        List<Integer> uniqueList = new ArrayList<>();

        for (int num : array) {
            if (!uniqueSet.contains(num)) {
                uniqueSet.add(num);
                uniqueList.add(num);
            }
        }

        int[] uniqueArray = new int[uniqueList.size()];
        for (int i = 0; i < uniqueList.size(); i++) {
            uniqueArray[i] = uniqueList.get(i);
        }

        return uniqueArray;
    }

    public static double calculateAverage(int[] array) {
        if (array.length == 0) {
            return 0.0;
        }

        int sum = 0;
        for (int num : array) {
            sum += num;
        }

        return (double) sum / array.length;
    }

    public static int findThirdLargest(int[] array) {
        if (array.length < 3) {
            System.out.println("Không đủ phần tử để tìm số lớn thứ 3.");
            return Integer.MIN_VALUE;
        }

        Arrays.sort(array);
        int count = 1;
        int thirdLargest = array[array.length - 1];

        for (int i = array.length - 2; i >= 0; i--) {
            if (array[i] != array[i + 1]) {
                count++;
            }

            if (count == 3) {
                thirdLargest = array[i];
                break;
            }
        }

        return thirdLargest;
    }
}