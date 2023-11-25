package day04;

import java.util.Arrays;

public class ValidNumberDemo {

	public static void main(String[] args) {
		String[] ss = {"xx01a7772b3456cde8xx",
				"aa6b546c6e22h",
				"aa6b326c6e22h",
				"aaa"};
		int[] result = getValidMaxNumbers(ss);
		
		Arrays.sort(result);
		
		System.out.println("max valid number: " + Arrays.toString(result) );
	}
	
	private static int[] getValidMaxNumbers(String[] ss) {
		int[] numbers = new int[ss.length];
		int count = 0;
		for(String s:ss) {
			int eachmax = getMaxValidNumber(s);
			if(eachmax != -1) {
				numbers[count++] = eachmax;
			}
		}
		return Arrays.copyOfRange(numbers, 0, count);
	}
	 
	
	private static int getMaxValidNumber(String s) {
		String[] tokens = s.split("[a-z]+");
		if(tokens.length == 0) {
			return -1;
		}
		int max = tokens[0].isEmpty()
				? Integer.MIN_VALUE
				: Integer.parseInt(tokens[0]);
		for(int i = 1; i < tokens.length; i++) {
			int validNber = Integer.parseInt(tokens[i]);
			if(max < validNber) {
				max = validNber;
			}
		}
		return max;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
