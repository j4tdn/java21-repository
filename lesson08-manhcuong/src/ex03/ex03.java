package ex03;

import java.text.Normalizer;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ex03 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vietnamese string with accents: ");
        String input = scanner.nextLine();

        String output = removeDiacriticalMarks(input);

        System.out.println("Unsigned string: " + output);
    }

    public static String removeDiacriticalMarks(String input) {
        String normalizedString = Normalizer.normalize(input, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        return pattern.matcher(normalizedString).replaceAll("");
    }

}
