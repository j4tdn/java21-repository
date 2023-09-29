package ex02;

import java.util.Random;
import java.util.Scanner;

public class Ex02App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		System.out.print("Nhap n: ");
		int n = sc.nextInt();
		int[] array = new int[n];

		for (int i = 0; i < n; i++) {
			array[i] = rd.nextInt(5, 101);
		}

		for (int i = 0; i < n; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.println("\n==================");

		int[] swap = new int[n];
		int count = 0;

		for (int i = 0; i < n; i++) {
			if (array[i] % 7 == 0 && array[i] % 5 != 0) {
				swap[count] = array[i];
				count++;
			}
		}

		for (int i = 0; i < n; i++) {
			if (array[i] % 7 == 0 && array[i] % 5 == 0 || array[i] % 7 != 0 && array[i] % 5 != 0) {
				swap[count] = array[i];
				count++;
			}
		}

		for (int i = 0; i < n; i++) {
			if (array[i] % 7 != 0 && array[i] % 5 == 0) {
				swap[count] = array[i];
				count++;
			}
		}

		System.out.println("Mang sau khi sap xep:");

		for (int i = 0; i < n; i++) {
			System.out.print(swap[i] + ", ");
		}

	}
}
