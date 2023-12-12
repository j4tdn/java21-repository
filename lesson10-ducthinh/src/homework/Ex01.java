package homework;

import java.util.ArrayList;
import java.util.List;

public class Ex01 {
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,3,1};
		nums = removeSameElement(nums);
		ArrayUtils.generate("Array after remove duplicates elements ", nums);
		double sum1 = averageArrayHalf(nums, 0, nums.length/2);
		double sum2 = averageArrayHalf(nums, nums.length/2, nums.length);
		if(sum1 > sum2) {
			System.out.println("first half of array greater last half of array");
		}else if(sum1 < sum2) {
			System.out.println("first half of array smaller last half of array");
		}else {
			System.out.println("first half of array equal last half of array");
		}
	}
	public static int[] removeSameElement(int[] nums) {
		ArrayList<Integer> uniqueList = new ArrayList<>();
		ArrayList<Integer> dElementsList = new ArrayList<>();
		for(int num : nums) {
			if(!uniqueList.contains(num)) {
				uniqueList.add(num);
			}else {
				dElementsList.add(num);
			}
		}
			
		uniqueList.removeAll(dElementsList);
		// convert list to array
		int[] uniqueArray = new int[uniqueList.size()];
		for(int i = 0; i < uniqueList.size(); i++) {
			uniqueArray[i] = uniqueList.get(i);
		}
		return uniqueArray;
	}
	public static double averageArrayHalf(int[] nums, int start, int end) {
		double sum = 0;
		int count = 0;
		for(int i=start; i < end; i++) {
			count += 1;
			sum += nums[i];
		}
		return (double)sum/count;
	}
}
