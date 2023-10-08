package lesson03;

import java.util.Scanner;

import javax.script.AbstractScriptEngine;

public class FindMaxValidNumberInString {
    private static Scanner inputScanner = new Scanner(System.in);

    public static void main(String[] args) {
        String input = inputString();
        int maxValidNumber = getMaxValidNumber(input);
        System.out.println("Số lớn nhất trong chuỗi là " + maxValidNumber);
    }

    public static String inputString() {
        System.out.println("Nhập chuỗi: ");
        String input = inputScanner.nextLine();
        while (!isValidString(input)) {
            System.out.println("Chuỗi chỉ được chứa số và kí tự, vui lòng nhập lại");
            input = inputScanner.nextLine();
        }
        return input;
    }

    public static boolean isValidString(String input) {
        for (char c : input.toCharArray()) {
            if (!Character.isDigit(c) && !Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }

    public static int getMaxValidNumber(String input) {
        int currentLength = 0;
        int currentNumber = 0;
        int maxValidNumber = -1;
        boolean inNumber = false;

        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {           
                if (!inNumber) {
                    inNumber = true;
                   
                    currentNumber = Character.getNumericValue(c);
                }else {
                	currentNumber = currentNumber * 10 + Character.getNumericValue(c);
                }
                
                if (currentNumber > maxValidNumber) {
                    maxValidNumber = currentNumber;
                }
            } else {
                inNumber = false;
                currentNumber = 0;
            }
        }
        return maxValidNumber;
    }
}

