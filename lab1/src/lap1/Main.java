package lap1;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Fibonacci Sequence");
            System.out.println("2. Convert Binary to Decimal ");
            System.out.println("3. Name Normalizer");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = ip.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the number of terms for Fibonacci Sequence: ");
                    int n = ip.nextInt();
                    Fibonacci.printFibonacciSequence(n);
                    break;

                case 2:
                    System.out.print("Enter a binary string: ");
                    String binaryString = ip.next();
                    int decimal = BinaryToDecimalConverter.binaryToDecimal(binaryString);
                    System.out.println("Decimal equivalent: " + decimal);
                    break;

                case 3:
                    System.out.print("Enter a name: ");
                    ip.nextLine(); 
                    String inputName = ip.nextLine();
                    String normalizedName = NameNormalizer.normalizeName(inputName);
                    System.out.println("Normalized name: " + normalizedName);
                    break;

                case 0:
                    System.out.println("Exiting the program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid , Please enter a valid option.");
                    break;
            }

        } while (choice != 0);

        
    }
}
