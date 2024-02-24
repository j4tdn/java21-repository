package ex3;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

	    public static void main(String[] args) {
	        int number = 19;
	        if (isHappyNumber(number)) {
	            System.out.println(number + " is happy number");
	        } else {
	            System.out.println(number + " isn't happy number");
	        }
	    }
	    
	    public static boolean isHappyNumber(int n) {
	        Set<Integer> visitedNumbers = new HashSet<>();

	        while (n != 1 && !visitedNumbers.contains(n)) {
	            visitedNumbers.add(n);

	            int sumOfSquares = 0;
	            while (n > 0) {
	                int digit = n % 10;
	                sumOfSquares += digit * digit;
	                n /= 10;
	            }

	            n = sumOfSquares;
	        }

	        return n == 1;
	    }

	}

