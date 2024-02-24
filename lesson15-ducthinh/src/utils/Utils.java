package utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Utils {
	static Scanner ip = new Scanner(System.in);
	private Utils() {
		
	}
	
	public static Integer[] InputIntegerNumber() {
		Integer num ;
		Integer[] nums = null; 
		boolean check = false;
	
		while(!check) {
			try {
				System.out.println("===>Input size<===");
				num = Integer.parseInt(ip.nextLine());
				if(num < 0 || num >= 100) {
					System.out.println("Please input size in range[0;100)");
				}else {
					 nums= new Integer[num]; 
					 System.out.println("Input Elements : ");
					 for (int i = 0; i < nums.length; i++) {
						 	
				            nums[i] = Integer.parseInt(ip.nextLine());
				            if(nums[i] < 1 || nums[i] > 20) {
				            	System.out.println("Please input number in range[0;20)");
				            	i--;
				            	continue;
				            }
				        }
					 check = true;
				}
			} catch (NumberFormatException e) {
				System.out.println(e);
			}
		}
		return nums;
	}
		
}
