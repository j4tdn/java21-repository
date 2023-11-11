package view.exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex02FindMaxNumberInString {
	public static void main(String[] args) {
		String[] strings = {"aa6b0546c6e22h", "aa6b0326c6e22h"};
		List<Integer> maxNumbers = findMaxNumber(strings);
		Collections.sort(maxNumbers);
		System.out.println("Result : " + maxNumbers);
	}
	
	// find maxnumbers in strings
	public static List<Integer> findMaxNumber(String[] strings){
		List<Integer> maxNumbers = new ArrayList<>();
		
		for(int i=0; i<strings.length; i++) {
			int currentNumber = 0;
			int currentMax = 0;
			for(char ch:strings[i].toCharArray()) {
				if(Character.isDigit(ch)) {
					currentNumber = currentNumber * 10 + (ch - '0');
				}else {
					if(currentNumber > currentMax) {
						currentMax = currentNumber;
					}
					currentNumber = 0;
				}
			}
			if (currentNumber > currentMax) {
				currentMax = currentNumber;
			}
			maxNumbers.add(currentMax);
		}
		
		return maxNumbers;
	}
}
