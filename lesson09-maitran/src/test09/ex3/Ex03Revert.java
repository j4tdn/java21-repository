package test09.ex3;

public class Ex03Revert {
	public static void main(String[] args) {
		String s = "    Welcome to JAVA10 class    ";
		System.out.println(revert(s));
	}

	private static String revert(String s) {
		s = s.strip().replaceAll("\\s+", " ");
		String[] words = s.split("\\s");

		StringBuilder updateString = new StringBuilder();
		for (String word : words) {
			updateString.append(new StringBuilder(word).reverse()).append(" ");
		}
		return updateString.toString().strip();
	}
}
