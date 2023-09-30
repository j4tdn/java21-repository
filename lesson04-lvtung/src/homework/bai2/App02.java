package homework.bai2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class App02 {

	public static void main(String[] args) {
		List<Integer> numberList = new ArrayList<Integer>();
		Random random = new Random();
		int length = 11;

		for (int i = 0; i < length; i++) {
			int rdNumber = random.nextInt(5, 101);
			numberList.add(rdNumber);
		}
		System.out.print("Dãy số ngẫu nhiên: " + numberList);

		int[] resultArray = new int[length];

		// Lọc và sắp xếp các số theo yêu cầu
		int left = 0;
		int right = resultArray.length - 1;
		
		for (int number : numberList) {
			if (number % 7 == 0) {
				resultArray[left] = number;
				left++;
			} else if (number % 5 == 0) {
				resultArray[right] = number;
				right--;
			} else {
				// Các số không chia hết cho 5 hoặc 7 đưa vào giữa mảng
				for (int i = left; i <= right; i++) {
					if (resultArray[i] == 0) {
						resultArray[i] = number;
						break;
					}
				}
			}
		}

		// In ra mảng kết quả
		System.out.println("\nKết quả: " + Arrays.toString(resultArray));

	}
}
