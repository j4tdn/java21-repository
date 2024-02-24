/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.Exercises;

/**
 *
 * @author PC
 */
public class Ex03HappyNumber {

    public static void main(String[] args) {
        int number1 = 19; // Số hạnh phúc
        int number2 = 4;  // Không phải số hạnh phúc

        System.out.println(number1 + " là số hạnh phúc: " + isHappyNumber(number1));
        System.out.println(number2 + " là số hạnh phúc: " + isHappyNumber(number2));
    }

    public static boolean isHappyNumber(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = calculateSumOfSquares(slow);
            fast = calculateSumOfSquares(calculateSumOfSquares(fast));
        } while (slow != fast);

        return slow == 1;
    }

    public static int calculateSumOfSquares(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
}
