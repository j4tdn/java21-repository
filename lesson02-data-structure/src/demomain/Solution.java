package demomain;

import java.util.Arrays;

public class Solution {
	public static void main(String[] args) {
		int[] nums = { 2, 7, 11, 15 };
		int target = 9;

		System.out.println(Arrays.toString(twoSum(nums, target)));
	}

	public static int[] twoSum(int[] nums, int target) {

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (j > i) {
					if (nums[i] + nums[j] == target) {
						return new int[] {i, j};
					}
				}
			}
		}
		return new int[] {};
	}
}
