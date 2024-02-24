package view;

import static utils.Utils. *;

import java.util.HashMap;
import java.util.Map;

import condition.EntryCondition;

public class Ex01GenerateAppearElements {
	public static void main(String[] args) {
		Integer[] nums = InputIntegerNumber();
		displayArrayNumbers(nums);
		appearTimeElements(nums, a -> a.getValue() == 1);
		appearTimeElements(nums, a -> a.getValue() > 1);
	}	
	private static void appearTimeElements(Integer[] nums, EntryCondition test) {
	        Map<Integer, Integer> numsMap = new HashMap<>();

	        // Count appear times of each elements
	        for (int num : nums) {
	            numsMap.put(num, numsMap.getOrDefault(num, 0) + 1);
	        } 
	        System.out.print("Elements appear 1 time in Array : ");
	        for (Map.Entry<Integer, Integer> entry : numsMap.entrySet()) {
	            if (test.test(entry) ) {
	                System.out.print(entry.getKey() + " ");
	            }
	        }
	        System.out.println();
	}

	private static void displayArrayNumbers(Integer[] nums) {
		System.out.print("Array: ");
		for(int i = 0; i < nums.length; i++) {
			System.out.print(" " + nums[i]);
		}
		System.out.println();
	}
}
