package exam.cau1;

import java.util.HashSet;
import java.util.Set;

public class App01 {

	public static void main(String[] args) {
		
		int[] numbers = { 1, 2, 3, 4, 5, 6, 5, 5, 3, 1 };

        System.out.print("Các phần tử chỉ xuất hiện một lần duy nhất trong dãy N: ");
        printUniqueElements(numbers);

        System.out.println();

        System.out.print("Các phần tử xuất hiện nhiều hơn một lần trong dãy N: ");
        printDuplicateElements(numbers);
	}

	public static void printUniqueElements(int[] arr) {
		Set<Integer> uniqueElements = new HashSet<>();
		Set<Integer> duplicateElements = new HashSet<>();

		for (int number : arr) {
			if (uniqueElements.contains(number)) {
				duplicateElements.add(number);
			} else {
				uniqueElements.add(number);
			}
		}

		for (int element : uniqueElements) {
			if (!duplicateElements.contains(element)) {
				System.out.print(element + " ");
			}
		}
	}

	public static void printDuplicateElements(int[] arr) {
		Set<Integer> uniqueElements = new HashSet<>();
		Set<Integer> duplicateElements = new HashSet<>();

		for (int number : arr) {
			if (uniqueElements.contains(number)) {
				duplicateElements.add(number);
			} else {
				uniqueElements.add(number);
			}
		}

		for (int element : duplicateElements) {
			System.out.print(element + " ");
		}
	}
}
