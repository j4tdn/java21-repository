package ex01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex01 {
	public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 5, 5, 3, 1};
        findUniqueAndDuplicateElements(arr);
    }

    public static void findUniqueAndDuplicateElements(int[] arr) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        List<Integer> uniqueElements = new ArrayList<>();
        List<Integer> duplicateElements = new ArrayList<>();

        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == 1) {
                uniqueElements.add(entry.getKey());
            } else {
                duplicateElements.add(entry.getKey());
            }
        }

        System.out.println("Các phần tử chỉ xuất hiện một lần duy nhất:");
        for (int num : uniqueElements) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Các phần tử xuất nhiều hơn một lần:");
        for (int num : duplicateElements) {
            System.out.print(num + " ");
        }
    }
}


