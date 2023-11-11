package Ex03;

public class Ex03 {

	public static void main(String[] args) {
		String input = "Welcome to JAVA10 class";
		revert(input);
	}
	
	private static void revert(String input) {
		String s = input.replaceAll("\\s+", " ");
		System.out.println("input: " + s);

		String[] words = s.split(" ");
		s = "";
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			String revert = "";
			for (int j = word.length() - 1; j >= 0; j--) {
				revert += word.charAt(j);
			}
			s = s + revert + " ";
		}
		System.out.println("output: " + s);
	}
}
