package test2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class test2 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int n;
	        while (true) {
	            try {
	                System.out.print("Nhập số lượng xâu chuỗi (n): ");
	                n = Integer.parseInt(scanner.nextLine());
	                if (n > 0) {
	                    break;
	                } else {
	                    System.out.println("Số lượng xâu chuỗi phải là một số nguyên dương.");
	                }
	            } catch (NumberFormatException e) {
	                System.out.println("Vui lòng nhập một số nguyên dương.");
	            }
	        }

	        String[] strings = new String[n];
	        for (int i = 0; i < n; i++) {
	            System.out.print("Nhập xâu chuỗi thứ " + (i + 1) + ": ");
	            strings[i] = scanner.nextLine();
	        }

	        System.out.println("\nSố lượng xâu chuỗi đã nhập: " + n);
	        System.out.println("Các xâu chuỗi đã nhập:");
	        for (int i = 0; i < n; i++) {
	            System.out.println((i + 1) + ": " + strings[i]);
	        }

	        System.out.println("\nCác số lớn nhất từ các xâu chuỗi:");
	        String[] largestNumbers = getLargestNumbers(strings);
	        for (String number : largestNumbers) {
	            System.out.println(number);
	        }

	        scanner.close();
	    }

	    private static String[] getLargestNumbers(String... ss) {
	        List<Integer> largestNumbers = new ArrayList<>();

	        for (String s : ss) {
	            List<Integer> numbers = extractNumbersFromString(s);
	            int largestNumber = getMax(numbers);
	            if (largestNumber != 0) {
	                largestNumbers.add(largestNumber);
	            }
	        }

	        Collections.sort(largestNumbers);

	        String[] result = new String[largestNumbers.size()];
	        for (int i = 0; i < largestNumbers.size(); i++) {
	            result[i] = String.valueOf(largestNumbers.get(i));
	        }

	        return result;
	    }

	    private static List<Integer> extractNumbersFromString(String s) {
	        List<Integer> numbers = new ArrayList<>();
	        StringBuilder currentNumber = new StringBuilder();

	        for (char c : s.toCharArray()) {
	            if (Character.isDigit(c)) {
	                currentNumber.append(c);
	            } else if (currentNumber.length() > 0) {
	                numbers.add(Integer.parseInt(currentNumber.toString()));
	                currentNumber.setLength(0);
	            }
	        }

	        if (currentNumber.length() > 0) {
	            numbers.add(Integer.parseInt(currentNumber.toString()));
	        }

	        return numbers;
	    }

	    private static int getMax(List<Integer> numbers) {
	        return numbers.isEmpty() ? 0 : Collections.max(numbers);
	    }
	}

