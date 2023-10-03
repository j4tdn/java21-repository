package test04;

import java.util.Scanner;

public class SumArray {

    public static int sum(int[] arr) {
        if (arr == null || arr.length <= 2) {
            return 0;
        }

        int min = arr[0];
        int max = arr[0];
        int sum = 0;

        for (int number : arr) {
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
            sum += number;
        }

        sum -= max;
        sum -= min;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    sum -= arr[i];
                    break;
                }
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử trong mảng: ");
        int n = ip.nextInt();

        if (n <= 0) {
            System.out.println("Số lượng không hợp lệ!");
            ip.close();
            return;
        }

        int[] arr = new int[n];
        System.out.print("Nhập các phần tử: ");
        for (int i = 0; i < n; i++) {
            arr[i] = ip.nextInt();
        }

        int result = sum(arr);

        if (n >= 3) {
            System.out.println("Tổng: " + result);
        } else {
            System.out.println("Không đủ phần tử để tính tổng!");
        }

        ip.close();
    }
}
