package ex03;

public class StringReverser {
	public static void main(String[] args) {
		String input = "Welcome to JAVA10    class";
		String output = revert(input);
		System.out.println("output: " + output);
	}

	public static String revert(String s) {
		String[] words = s.split("\\s+");

		StringBuilder reversed = new StringBuilder();
		for (String word : words) {
			StringBuilder reversedWord = new StringBuilder(word).reverse();
			reversed.append(reversedWord).append(" ");
		}

		return reversed.toString().trim();
	}
}
