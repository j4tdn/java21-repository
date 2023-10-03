package fop;

public class Ex03 {
	    public static void main(String[] args) {
	        String input1 = "12abu02muzk586cyx";
	        String input2 = "Uyk892nn1234uxo2";

	        System.out.println("Số tự nhiên hợp lệ lớn nhất trong chuỗi 1: " + getMaxValidNumber(input1));
	        System.out.println("Số tự nhiên hợp lệ lớn nhất trong chuỗi 2: " + getMaxValidNumber(input2));
	    }

	    public static int getMaxValidNumber(String input) {
	        int maxNumber = 0;
	        int currentNumber = 0;
	        boolean inNumber = false;

	        for (int i = 0; i < input.length(); i++) {
	            char c = input.charAt(i);

	            if (Character.isDigit(c)) {
	                currentNumber = currentNumber * 10 + Character.getNumericValue(c);
	                inNumber = true;
	            } else {
	                if (inNumber) {
	                    maxNumber = Math.max(maxNumber, currentNumber);
	                    currentNumber = 0;
	                    inNumber = false;
	                }
	            }
	        }

	        if (inNumber) {
	            maxNumber = Math.max(maxNumber, currentNumber);
	        }

	        return maxNumber;
	    }
	}
	

