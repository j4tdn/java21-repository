package ex01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
	public static void printCommonElements(int[] arr1, int[] arr2) {
		Set<Integer> s1 = new HashSet<>();
		for (int num : arr1) {
			s1.add(num);
		}
		Set<Integer> s2 = new HashSet<>();
		for (int num : arr2) {
			s2.add(num);
		}
		List<Integer> result = new ArrayList<>();
		for (int num : s1) {
			if (s2.contains(num)) {
				result.add(num);
			}
		}
		if (result.isEmpty()) {
			System.out.println("Không có phần tử chung");
		} else {
			System.out.print("Các phần tử chung là: ");
			for (int i : result) {
				System.out.print(i + " ");
			}
		}

	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5, 6 };
		int[] arr2 = { 1, 3, 5, 7 };
		printCommonElements(arr1, arr2);
	}
}
