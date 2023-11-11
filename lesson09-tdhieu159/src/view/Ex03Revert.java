package view;

public class Ex03Revert {
	public static void main(String[] args) {
		String input = "  Welcome    to   JAVA10  class   ";
		
		StringBuilder sb = new StringBuilder();
		String[] words = input.trim().split("\\s+");
		for (String word : words) {
			sb.append(reverse(word)).append(" ");
		}
		System.out.println(sb.toString().trim());
	}
	
	private static String reverse(String string) {
		return new StringBuilder(string).reverse().toString();
	}
}