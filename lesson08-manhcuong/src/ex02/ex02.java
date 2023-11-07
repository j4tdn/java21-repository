package ex02;

import java.util.Scanner;

public class ex02 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("full name: ");
        String fullName = scanner.nextLine();

        String formattedName = formatFullName(fullName);

        System.out.println("format full name : " + formattedName);
    }

    public static String formatFullName(String fullName) {
        String[] words = fullName.split(" ");
        StringBuilder formattedName = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                String firstLetter = word.substring(0, 1).toUpperCase();
                String restOfWord = word.substring(1).toLowerCase();
                formattedName.append(firstLetter).append(restOfWord).append(" ");
            }
        }

        return formattedName.toString().trim();
    }
}

