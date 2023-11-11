package ex03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Ex03 {
	static ArrayList<Integer> arrListNumber = new ArrayList<>();
	public static void main(String[] args) {
		Integer[] arrayNum = {8,5,9,20};
		Integer[] resultNum = new Integer[arrayNum.length];
		int num, temp = 0;
		
		
		int count =0;
		for(int i = 0; i < arrayNum.length; i++) {
			for(int k = 1; k <= arrayNum[i]; k++) {
				if(arrayNum[i]%k==0) {
					count++;
				}
			}
			resultNum[i] = count;
			count = 0;
		}
		num = arrayNum.length;
		 for (int i = 0; i < (num - 1); i++) {
	            for (int j = 0; j < num - i - 1; j++) {
	                if (resultNum[j] > resultNum[j + 1]) {
	                    temp = resultNum[j];
	                    resultNum[j] = resultNum[j + 1];
	                    resultNum[j + 1] = temp;
	                }
	            }
	        }

	System.out.println(Arrays.toString(resultNum));
	}
}
	

