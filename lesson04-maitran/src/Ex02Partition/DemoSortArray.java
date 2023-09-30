package Ex02Partition;

import java.util.ArrayList;
import java.util.List;

public class DemoSortArray {

	    public static void main(String[] args) {
	        int[] numbers = {12, 21, 25, 19, 32, 35, 49, 10, 33, 14, 18};
	        
	        List<Integer> divisibleBy7 = new ArrayList<>();
	        List<Integer> divisibleBy5 = new ArrayList<>();
	        List<Integer> remain = new ArrayList<>();
	        
	        for (int number : numbers) {
	            if (number % 7 == 0 && number % 5 != 0) {
	                divisibleBy7.add(number);
	            } else if (number % 5 == 0 && number % 5 != 0) {
	                divisibleBy5.add(number);
	            } else {
	            	remain.add(number);
	            }
	        }
	        
	        List<Integer> list = new ArrayList<>(divisibleBy7);
	        list.addAll(remain);
	        list.addAll(divisibleBy5);
	        
	        for (int number : list) {
	            System.out.print(number + " ");
	        }
	    }
	}
