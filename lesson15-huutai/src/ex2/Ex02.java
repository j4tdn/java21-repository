package ex2;

import java.util.HashMap;
import java.util.Map;

public class Ex02 {
	public static void main(String[] args) {
		String inputString = "aaaaccdcec";

		Map<Character, Integer> countMap = new HashMap<>();
		int maxCount = 0;

		for (char c : inputString.toCharArray()) {
			countMap.put(c, countMap.getOrDefault(c, 0) + 1);
			maxCount = Math.max(maxCount, countMap.get(c));
		}

		// In kết quả
		System.out.print("Ký tự có số lần xuất hiện nhiều nhất là: ");
		boolean isFirst = true;
		for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
			if (entry.getValue() == maxCount) {
				if (isFirst) {
					System.out.print(entry.getKey());
					isFirst = false;
				} else {
					System.out.print(", " + entry.getKey());
				}
			}
		}
	}
}
