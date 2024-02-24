package ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ex03 {
	public static void main(String[] args) {
        List<Integer> randomSequence = generateRandomSequence(10);
        System.out.println("Dãy ngẫu nhiên có hai chữ số:");
        for (int number : randomSequence) {
            System.out.print(number + " ");
        }
        System.out.println("\n\nKiểm tra số hạnh phúc:");
        for (int number : randomSequence) {
            if (isHappyNumber(number)) {
                System.out.println(number + " là số hạnh phúc");
            } else {
                System.out.println(number + " không phải là số hạnh phúc");
            }
        }
    }

    public static List<Integer> generateRandomSequence(int length) {
        List<Integer> sequence = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(90) + 01; 
            sequence.add(number);
        }
        return sequence;
    }

    public static boolean isHappyNumber(int number) {
        List<Integer> seen = new ArrayList<>();
        while (number != 1 && !seen.contains(number)) {
            seen.add(number);
            number = sumOfSquaredDigits(number);
        }
        return number == 1;
    }

    public static int sumOfSquaredDigits(int number) {
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit * digit;
            number /= 10;
        }
        return sum;
    }

}
