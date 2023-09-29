package lesson02;

import java.util.ArrayList;

import javax.naming.spi.DirStateFactory.Result;

public class SortArray {
	public static void main(String[] args) {
		int[] numbers = {12, 21, 25, 19, 32, 35, 49, 10, 33, 14, 18};
		ArrayList<Integer> divisibleBy7 = new ArrayList<>();
		ArrayList<Integer> divisibleBy5 = new ArrayList<>();
		ArrayList<Integer> otherNumbers = new ArrayList<>();
		
		for(int number : numbers) {
			// số chia hết cho 7 mà không chia hết cho 5
			if(number % 7 == 0 && number % 5 != 0) {
				divisibleBy7.add(number);
			// số chia hết cho 5 mà không chia hết cho 7
			}else if(number % 7 != 0 && number % 5 ==0){
				divisibleBy5.add(number);
			// và những số còn lại
			}else {
				otherNumbers.add(number);
			}
		}
		ArrayList<Integer> results = new ArrayList<>();
		results.addAll(divisibleBy7);
		results.addAll(divisibleBy5);
		results.addAll(otherNumbers);
		System.out.println("Mảng sau khi được sắp xếp là : ");
		for(int number : results) {
			System.out.print(number+ " ");
		}
	}
}
